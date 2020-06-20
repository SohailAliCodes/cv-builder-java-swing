import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CVBuilderPremiumInput extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CVBuilderPremiumInput frame = new CVBuilderPremiumInput();
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
	public CVBuilderPremiumInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 789, 50);
		contentPane.add(panel);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLoginFrame frame = new UserLoginFrame();
				frame.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(30, 144, 255));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBackground(SystemColor.menu);
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(10, 18, 53, 22);
		panel.add(button_1);
		
		JLabel lblPremiumSubscription = new JLabel("Premium Subscription");
		lblPremiumSubscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremiumSubscription.setForeground(Color.WHITE);
		lblPremiumSubscription.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPremiumSubscription.setBounds(0, 0, 789, 50);
		panel.add(lblPremiumSubscription);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(245, 95, 311, 340);
		contentPane.add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(10, 81, 291, 22);
		panel_1.add(separator);
		
		JLabel lblEnterDetails = new JLabel("Enter details");
		lblEnterDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterDetails.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblEnterDetails.setBackground(Color.WHITE);
		lblEnterDetails.setBounds(57, 32, 198, 38);
		panel_1.add(lblEnterDetails);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 114, 139, 20);
		panel_1.add(textField);
		
		JLabel label = new JLabel("Name");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(52, 114, 46, 20);
		panel_1.add(label);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEmail.setBounds(52, 155, 67, 20);
		panel_1.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 157, 139, 20);
		panel_1.add(textField_1);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.DARK_GRAY);
		lblPhone.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPhone.setBounds(52, 201, 67, 20);
		panel_1.add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 203, 139, 20);
		panel_1.add(textField_2);
		
		Button button = new Button("Subscribe");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText().toString();
				String email = textField_1.getText().toString();
				String phone = textField_2.getText().toString();
				
				Connection con = null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
					String query = "insert into cvbuilderpremium values(?,?,?)" ;
					
					PreparedStatement ps=con.prepareStatement(query);
					
					  ps.setString(1, name);
					  ps.setString(2, email);
					  ps.setString(3, phone);
					  
					int i= ps.executeUpdate();
					if(i > 0) {
						JOptionPane.showMessageDialog(button, "Registered successfully, enjoy the premium features!");
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(button, "Failed! enter the fields properly");
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button.setBackground(new Color(255, 140, 0));
		button.setActionCommand("Continue\r\n");
		button.setBounds(115, 279, 97, 22);
		panel_1.add(button);
		
		
	}
}
