import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Button;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class InputFrameMedical extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblObjective;
	private JTextField textField_4;
	private JLabel lblEducationalQualification;
	private JLabel lblNewLabel_2;
	private JLabel lblBoarduniversity;
	private JLabel lblMarks;
	private JLabel lblYearOfPassing;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblStrengths;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private Button button_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputFrameMedical frame = new InputFrameMedical();
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
	public InputFrameMedical() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 569);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(35, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(98, 50, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEmail.setBounds(350, 49, 46, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(400, 46, 125, 20);
		contentPane.add(textField_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.DARK_GRAY);
		lblAddress.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblAddress.setBounds(35, 84, 60, 14);
		contentPane.add(lblAddress);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(98, 78, 139, 20);
		contentPane.add(textField_2);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.DARK_GRAY);
		lblPhone.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPhone.setBounds(350, 74, 46, 24);
		contentPane.add(lblPhone);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(400, 78, 125, 20);
		contentPane.add(textField_3);
		
		lblObjective = new JLabel("Objective");
		lblObjective.setForeground(Color.WHITE);
		lblObjective.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblObjective.setBounds(35, 120, 86, 21);
		contentPane.add(lblObjective);
		
		textField_4 = new JTextField();
		textField_4.setBounds(35, 152, 490, 52);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblEducationalQualification = new JLabel("Educational Qualification");
		lblEducationalQualification.setBackground(Color.WHITE);
		lblEducationalQualification.setForeground(Color.WHITE);
		lblEducationalQualification.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEducationalQualification.setBounds(35, 228, 190, 20);
		contentPane.add(lblEducationalQualification);
		
		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(35, 259, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		lblBoarduniversity = new JLabel("Board/University");
		lblBoarduniversity.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblBoarduniversity.setForeground(Color.DARK_GRAY);
		lblBoarduniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoarduniversity.setBounds(151, 259, 133, 14);
		contentPane.add(lblBoarduniversity);
		
		lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblMarks.setForeground(Color.DARK_GRAY);
		lblMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarks.setBounds(308, 259, 88, 14);
		contentPane.add(lblMarks);
		
		lblYearOfPassing = new JLabel("Year");
		lblYearOfPassing.setHorizontalAlignment(SwingConstants.CENTER);
		lblYearOfPassing.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblYearOfPassing.setForeground(Color.DARK_GRAY);
		lblYearOfPassing.setBounds(451, 259, 86, 14);
		contentPane.add(lblYearOfPassing);
		
		textField_5 = new JTextField();
		textField_5.setBounds(35, 284, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(177, 284, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(310, 284, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(451, 284, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(35, 315, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(177, 315, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(310, 315, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(451, 315, 86, 20);
		contentPane.add(textField_12);
		
		lblStrengths = new JLabel("Strengths");
		lblStrengths.setForeground(Color.WHITE);
		lblStrengths.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblStrengths.setBounds(35, 388, 112, 24);
		contentPane.add(lblStrengths);
		
		textField_13 = new JTextField();
		textField_13.setBounds(35, 423, 228, 52);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(303, 423, 244, 52);
		contentPane.add(textField_15);
		
		JPanel panel = new JPanel();
		panel.setBounds(582, 0, 237, 515);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Here are some offers  for you");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 217, 29);
		panel.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(10, 38, 217, 2);
		panel.add(separator);
		
		JTextPane txtpnDdadsdaadd = new JTextPane();
		txtpnDdadsdaadd.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtpnDdadsdaadd.setToolTipText("");
		txtpnDdadsdaadd.setText("Job Description 1");
		txtpnDdadsdaadd.setBounds(10, 51, 217, 57);
		panel.add(txtpnDdadsdaadd);
		
		JTextPane txtpnJobDescription = new JTextPane();
		txtpnJobDescription.setToolTipText("");
		txtpnJobDescription.setText("Job Description 2");
		txtpnJobDescription.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtpnJobDescription.setBounds(10, 119, 217, 57);
		panel.add(txtpnJobDescription);
		
		JTextPane txtpnJobDescription_1 = new JTextPane();
		txtpnJobDescription_1.setToolTipText("");
		txtpnJobDescription_1.setText("Job Description 3");
		txtpnJobDescription_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtpnJobDescription_1.setBounds(10, 187, 217, 57);
		panel.add(txtpnJobDescription_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setToolTipText("");
		textPane_2.setText("Job Description 1");
		textPane_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textPane_2.setBounds(10, 255, 217, 57);
		panel.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setToolTipText("");
		textPane_3.setText("Job Description 1");
		textPane_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textPane_3.setBounds(10, 323, 217, 57);
		panel.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setToolTipText("");
		textPane_4.setText("Job Description 1");
		textPane_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textPane_4.setBounds(10, 391, 217, 57);
		panel.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setToolTipText("");
		textPane_5.setText("Medical Job Description 1");
		textPane_5.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textPane_5.setBounds(10, 458, 217, 46);
		panel.add(textPane_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 204));
		panel_1.setBounds(0, 0, 582, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("CV Builder");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label.setBounds(125, 0, 307, 35);
		panel_1.add(label);
		
		button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLoginDomainFrame d = new UserLoginDomainFrame();
				d.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(30, 144, 255));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBackground(SystemColor.menu);
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(10, 10, 53, 25);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, 120, 148, 24);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds(0, 228, 238, 24);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(30, 144, 255));
		panel_4.setBounds(0, 388, 171, 24);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(30, 144, 255));
		panel_5.setBounds(372, 388, 182, 24);
		contentPane.add(panel_5);
		
		JLabel lblExtraCurricular = new JLabel("Extra curricular");
		lblExtraCurricular.setBounds(10, 0, 165, 24);
		panel_5.add(lblExtraCurricular);
		lblExtraCurricular.setForeground(Color.WHITE);
		lblExtraCurricular.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		Button button = new Button("Build");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = textField.getText().toString();
				String email = textField_1.getText().toString();
				String address = textField_2.getText().toString();
				String phone = textField_3.getText().toString();
				
				String objective = textField_4.getText().toString();
				
				String EduName = textField_5.getText().toString();
				String EduBoard = textField_6.getText().toString();
				String EduMarks = textField_7.getText().toString();
				String EduYear = textField_8.getText().toString();
				
				String EduName1 = textField_9.getText().toString();
				String EduBoard1 = textField_10.getText().toString();
				String EduMarks1 = textField_11.getText().toString();
				String EduYear1 = textField_12.getText().toString();
				
				String EduName2 = textField_17.getText().toString();
				String EduBoard2 = textField_18.getText().toString();
				String EduMarks2 = textField_19.getText().toString();
				String EduYear2 = textField_20.getText().toString();
				
				String Strength = textField_13.getText().toString();
				String ExtraCurr = textField_15.getText().toString();
				
				
				Connection con = null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
					String query = "insert into CVBuilderDatabase values(?,?,?,?,studentid.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
					
					PreparedStatement ps=con.prepareStatement(query);
					
					  ps.setString(1, name); ps.setString(2, email); ps.setString(3, address);
					  ps.setString(4, phone); ps.setString(5, objective); ps.setString(6, EduName);
					  ps.setString(7, EduName1); ps.setString(8, EduName2); ps.setString(9,
					  Strength); ps.setString(10, ExtraCurr); ps.setString(11, EduBoard);
					  ps.setString(12, EduBoard1); ps.setString(13, EduBoard2); ps.setString(14,
					  EduMarks); ps.setString(15, EduMarks1); ps.setString(16, EduMarks2);
					  ps.setString(17, EduYear); ps.setString(18, EduYear1); ps.setString(19,
					  EduYear2);
					 
					int i= ps.executeUpdate();
					if(i > 0) {
						FinalPage o = new FinalPage();
						o.setVisible(true);
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
		button.setFont(new Font("Century Gothic", Font.BOLD, 11));
		button.setBackground(new Color(255, 140, 0));
		button.setForeground(Color.WHITE);
		button.setBounds(247, 486, 86, 22);
		contentPane.add(button);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(35, 346, 86, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(177, 346, 86, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(310, 346, 86, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(451, 346, 86, 20);
		contentPane.add(textField_20);
	}
}