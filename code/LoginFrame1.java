import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginFrame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame1 frame = new LoginFrame1();
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
	public LoginFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 519);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup ob = new ButtonGroup();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 789, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CV Builder");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 0, 779, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(154, 93, 475, 307);
		contentPane.add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(30, 48, 409, 22);
		panel_1.add(separator);
		
		JLabel lblCongratulationsYourCv = new JLabel("Login as");
		lblCongratulationsYourCv.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongratulationsYourCv.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblCongratulationsYourCv.setBounds(20, 11, 439, 29);
		panel_1.add(lblCongratulationsYourCv);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Admin");
		rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setBounds(152, 111, 200, 50);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnUser.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		rdbtnUser.setBackground(new Color(230, 230, 250));
		rdbtnUser.setBounds(152, 152, 200, 50);
		panel_1.add(rdbtnUser);
		
		Button button_1 = new Button("Continue");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					AdminLoginFrame o = new AdminLoginFrame();
					o.setVisible(true);
					dispose();
				}
				if(rdbtnUser.isSelected()) {
					UserLoginFrame o = new UserLoginFrame();
					o.setVisible(true);
					dispose();
					
				}
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button_1.setBackground(new Color(255, 140, 0));
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(359, 422, 97, 22);
		contentPane.add(button_1);
	}
	
}
