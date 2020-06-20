import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AdminLoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginFrame frame = new AdminLoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(247, 216, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(331, 213, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(247, 256, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 707, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginFrame1 d = new LoginFrame1();
				d.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(30, 144, 255));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBackground(SystemColor.menu);
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(10, 17, 53, 22);
		panel.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 687, 28);
		panel.add(lblNewLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(331, 255, 118, 20);
		contentPane.add(passwordField_1);
		
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String username = textField.getText().toString();
				char [] password = passwordField_1.getPassword();
				String pass = new String(password);
				
				Connection con = null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
					PreparedStatement ps=con.prepareStatement("select * from cvbuilderadmin where username=?");					
					ps.setString(1, username);
					
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						if(pass.equals(rs.getString(2))) {
							AdminLoginDomainFrame a = new AdminLoginDomainFrame();
							a.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(button,"Incorrect username or, password");
						}
					}
					
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		

		button.setForeground(Color.WHITE);
		button.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button.setBackground(new Color(255, 140, 0));
		button.setActionCommand("Continue\r\n");
		button.setBounds(307, 337, 97, 22);
		contentPane.add(button);
		
	
	}
}
