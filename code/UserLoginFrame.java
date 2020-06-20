import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class UserLoginFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginFrame frame = new UserLoginFrame();
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
	public UserLoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(123, 99, 526, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Benefits of using our premium services");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 11, 482, 29);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Quick results");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 70, 92, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblSeeTheResults = new JLabel("See the results from our offline tool in one place");
		lblSeeTheResults.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblSeeTheResults.setBounds(30, 89, 472, 22);
		panel.add(lblSeeTheResults);
		
		JLabel lblNoMoreWorries = new JLabel("No more worries about wrong formatting");
		lblNoMoreWorries.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNoMoreWorries.setBounds(30, 147, 472, 22);
		panel.add(lblNoMoreWorries);
		
		JLabel lblHassleFree = new JLabel("Hassle free");
		lblHassleFree.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblHassleFree.setBounds(20, 128, 92, 14);
		panel.add(lblHassleFree);
		
		JLabel lblProffesionalQualityResume = new JLabel("Professional quality resume within seconds");
		lblProffesionalQualityResume.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblProffesionalQualityResume.setBounds(30, 213, 472, 22);
		panel.add(lblProffesionalQualityResume);
		
		JLabel lblIndustryReady = new JLabel("Industry ready");
		lblIndustryReady.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblIndustryReady.setBounds(20, 186, 92, 28);
		panel.add(lblIndustryReady);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(30, 48, 482, 22);
		panel.add(separator);
		
		Button button_2 = new Button("Premium");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CVBuilderPremiumInput frame = new CVBuilderPremiumInput();
				frame.setVisible(true);
				dispose();
			}
		});
		button_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		button_2.setForeground(new Color(255, 140, 0));
		button_2.setBackground(new Color(230, 230, 250));
		button_2.setBounds(201, 253, 129, 38);
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 771, 50);
		contentPane.add(panel_1);
		
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
		button_1.setBounds(10, 10, 53, 22);
		panel_1.add(button_1);
		
		JLabel lblGetStartedWith = new JLabel("Get started with CV Builder");
		lblGetStartedWith.setHorizontalAlignment(SwingConstants.CENTER);
		lblGetStartedWith.setForeground(Color.WHITE);
		lblGetStartedWith.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblGetStartedWith.setBounds(0, 0, 771, 50);
		panel_1.add(lblGetStartedWith);
		
		Button button = new Button("Start");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLoginDomainFrame d = new UserLoginDomainFrame();
				d.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button.setBackground(new Color(255, 140, 0));
		button.setActionCommand("Continue\r\n");
		button.setBounds(343, 428, 97, 22);
		contentPane.add(button);
	}
}
