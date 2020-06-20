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
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class UserLoginDomainFrame extends JFrame {

	private JPanel contentPane;
	public static String st = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginDomainFrame frame = new UserLoginDomainFrame();
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
	public UserLoginDomainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup ob = new ButtonGroup();		// for selection part(1 at a time)
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 719, 50);
		contentPane.add(panel);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLoginFrame d = new UserLoginFrame();
				d.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(30, 144, 255));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBackground(SystemColor.menu);
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(10, 10, 53, 22);
		panel.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Help us align you with your dream job");
		lblNewLabel.setBounds(0, 0, 719, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(155, 94, 418, 340);
		contentPane.add(panel_1);
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(10, 89, 398, 22);
		panel_1.add(separator);
		
		JLabel lblSelectYourDomain = new JLabel("Select your domain for the best results");
		lblSelectYourDomain.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectYourDomain.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblSelectYourDomain.setBackground(Color.WHITE);
		lblSelectYourDomain.setBounds(10, 40, 398, 38);
		panel_1.add(lblSelectYourDomain);
		
		JRadioButton rdbtnTechnical = new JRadioButton("Technical");
		rdbtnTechnical.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnTechnical.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnTechnical.setBackground(new Color(230, 230, 250));
		rdbtnTechnical.setBounds(94, 118, 219, 27);
		panel_1.add(rdbtnTechnical);
		ob.add(rdbtnTechnical);
		
		JRadioButton rdbtnManagement = new JRadioButton("Management");
		rdbtnManagement.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnManagement.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnManagement.setBackground(new Color(230, 230, 250));
		rdbtnManagement.setBounds(94, 148, 200, 27);
		panel_1.add(rdbtnManagement);
		ob.add(rdbtnManagement);
		
		JRadioButton rdbtnMedical = new JRadioButton("Medical");
		rdbtnMedical.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnMedical.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnMedical.setBackground(new Color(230, 230, 250));
		rdbtnMedical.setBounds(94, 178, 200, 27);
		panel_1.add(rdbtnMedical);
		ob.add(rdbtnMedical);
		
		JRadioButton rdbtnGeneral = new JRadioButton("General");
		rdbtnGeneral.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnGeneral.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnGeneral.setBackground(new Color(230, 230, 250));
		rdbtnGeneral.setBounds(94, 211, 200, 27);
		panel_1.add(rdbtnGeneral);
		ob.add(rdbtnGeneral);
	
		Button button = new Button("Continue");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnTechnical.isSelected()) {
					st = "Tech";
					InputFrameTech t = new InputFrameTech();
					t.setVisible(true);
					dispose();
				}
				
				if(rdbtnManagement.isSelected()) {
					st = "Management";
					InputFrameManagement m = new InputFrameManagement();
					m.setVisible(true);
					dispose();
				}
				
				if(rdbtnMedical.isSelected()) {
					st = "Med";
					InputFrameMedical m = new InputFrameMedical();
					m.setVisible(true);
					dispose();
				}
				if(rdbtnGeneral.isSelected()) {
					st = "General";
					InputFrameGeneral g = new InputFrameGeneral();
					g.setVisible(true);
					dispose();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button.setBackground(new Color(255, 140, 0));
		button.setActionCommand("Continue\r\n");
		button.setBounds(160, 285, 97, 22);
		panel_1.add(button);
		
	}
}
