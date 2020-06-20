import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AdminLoginDomainFrame extends JFrame {

	private JPanel contentPane;
	public static String st = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginDomainFrame frame = new AdminLoginDomainFrame();
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
	public AdminLoginDomainFrame() {
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
				AdminLoginFrame d = new AdminLoginFrame();
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
		
		JLabel lblNewLabel = new JLabel("Admin login");
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
		
		JLabel lblSelectLogin = new JLabel("Select login option");
		lblSelectLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectLogin.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblSelectLogin.setBackground(Color.WHITE);
		lblSelectLogin.setBounds(10, 40, 398, 38);
		panel_1.add(lblSelectLogin);
		
		JRadioButton rdbtnPremium = new JRadioButton("Premium");
		rdbtnPremium.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnPremium.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnPremium.setBackground(new Color(230, 230, 250));
		rdbtnPremium.setBounds(94, 118, 219, 27);
		panel_1.add(rdbtnPremium);
		ob.add(rdbtnPremium);
		
		JRadioButton rdbtnSuggestion = new JRadioButton("Suggestion");
		rdbtnSuggestion.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnSuggestion.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnSuggestion.setBackground(new Color(230, 230, 250));
		rdbtnSuggestion.setBounds(94, 148, 200, 27);
		panel_1.add(rdbtnSuggestion);
		ob.add(rdbtnSuggestion);
		
		Button button = new Button("Continue");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnPremium.isSelected()) {
					st = "Premium";
					AdminFrame t = new AdminFrame();
					t.setVisible(true);
					dispose();
				}
				
				if(rdbtnSuggestion.isSelected()) {
					st = "Suggestion";
					AdminSuggestion m = new AdminSuggestion();
					m.setVisible(true);
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
