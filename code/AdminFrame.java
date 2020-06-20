import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 771, 50);
		contentPane.add(panel);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLoginDomainFrame d = new AdminLoginDomainFrame();
				d.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(30, 144, 255));
		button.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button.setBackground(SystemColor.menu);
		button.setActionCommand("Continue\r\n");
		button.setBounds(10, 10, 53, 22);
		panel.add(button);
		
		JLabel lblAdminPanel = new JLabel("Admin panel");
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPanel.setForeground(Color.WHITE);
		lblAdminPanel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAdminPanel.setBounds(0, 0, 771, 50);
		panel.add(lblAdminPanel);
		
		JLabel lblPremiumUsers = new JLabel("Premium users");
		lblPremiumUsers.setHorizontalAlignment(SwingConstants.LEFT);
		lblPremiumUsers.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblPremiumUsers.setBackground(Color.WHITE);
		lblPremiumUsers.setBounds(10, 61, 198, 38);
		contentPane.add(lblPremiumUsers);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(10, 99, 146, 23);
		contentPane.add(separator);
		
		table = new JTable();
		table.setBounds(10, 141, 744, 300);
		contentPane.add(table);
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 118, 226, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEmail.setBounds(264, 116, 226, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPhone.setBounds(513, 116, 226, 14);
		contentPane.add(lblPhone);
		
		try {
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			String sql = "SELECT * FROM cvbuilderpremium";
			Statement ps = con.createStatement();
			
		ResultSet rs=ps.executeQuery(sql);
		table.setModel(DbUtils.resultSetToTableModel(rs));

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
