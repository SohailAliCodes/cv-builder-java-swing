import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.SystemColor;

public class AdminSuggestion extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	static ArrayList<String[]> ar=new ArrayList<>();
	static DefaultListModel<String> listModel =new DefaultListModel<>();
	JList<String> list;
	
	public String stream = null;
	/**
	 * Launch the application.
	 */
	
	
	
	
	public ArrayList<String[]> getDetails(){
		ArrayList<String[]> ar=new ArrayList<>();
		String[] data=null;
		try {
			
			Connection con=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			PreparedStatement ps=con.prepareStatement("select * from cvbuilderdatabase");
			
			ResultSet rs=ps.executeQuery();
			int count =rs.getMetaData().getColumnCount();
			while(rs.next()) {
				data=new String[count];
				for(int i=0;i<count;i++) {
					data[i]=rs.getString(i+1);
				}
				ar.add(data);
					
			}
			return ar;		
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return ar;
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSuggestion frame = new AdminSuggestion();
					frame.setVisible(true);
					//AdminSuggestion a=new AdminSuggestion();
					ar=frame.getDetails();
					
					Iterator it=ar.iterator();
					String[] data=null;
					while(it.hasNext()) {
						data=(String[])it.next();
						listModel.addElement(data[4]);
					
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminSuggestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 789, 50);
		contentPane.add(panel);
		
		JLabel label = new JLabel("CV Builder");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label.setBounds(82, 0, 707, 50);
		panel.add(label);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLoginDomainFrame t = new AdminLoginDomainFrame();
				t.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(new Color(30, 144, 255));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBackground(SystemColor.menu);
		button_1.setActionCommand("Continue\r\n");
		button_1.setBounds(10, 10, 53, 22);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 309, 400, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(26, 11, 100, 39);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(258, 11, 100, 39);
		panel_1.add(label_1);
	
list=new JList<>(listModel);
list.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
		        JList list = (JList)e.getSource();
		        if (e.getClickCount() == 1) {

		           
		            String name1 = (String)list.getSelectedValue();
		            String [] data1 = null; 
		            try {
		            	Connection con=null;
		    			Class.forName("oracle.jdbc.driver.OracleDriver");
		    			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		    			PreparedStatement ps=con.prepareStatement("select * from cvbuilderdatabase where studentid=?");
		    			ps.setInt(1, Integer.parseInt(name1));
		    			ResultSet rs=ps.executeQuery();
		    			int count =rs.getMetaData().getColumnCount();
		    			while(rs.next()) {
		    				lblNewLabel_1.setText(rs.getString(1));
		    				label_1.setText(rs.getString(9));
		    				stream = label_1.getText().toString();
		    			}
		            }
		    			
		            
		            catch(Exception e1){
		            	e1.printStackTrace();
		            }
		            
				} 
		    }
			
	
});





list.setBounds(20, 97, 760, 169);


	
	contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(449, 325, 331, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 61, 112, 25);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(10, 88, 97, 15);
		contentPane.add(separator);
		
		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String suggestion = textField.getText().toString();
				try {
	            	Connection con=null;
	    			Class.forName("oracle.jdbc.driver.OracleDriver");
	    			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	    			String query = "insert into CVBuilderstatement values(?,?)" ;
					
					PreparedStatement ps=con.prepareStatement(query);
					
					  ps.setString(1, suggestion); 
					  ps.setString(2, stream); 
					 
					int i= ps.executeUpdate();
					if(i > 0) {
						JOptionPane.showMessageDialog(button, "Data added successfully!");
					}
					else {
						JOptionPane.showMessageDialog(button, "Failed! enter the fields properly");
					}
	            }
	    			
	            
	            catch(Exception e1){
	            	e1.printStackTrace();
	            }
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		button.setBackground(new Color(255, 140, 0));
		button.setActionCommand("Continue\r\n");
		button.setBounds(350, 443, 97, 22);
		contentPane.add(button);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblName.setBounds(20, 277, 112, 25);
		contentPane.add(lblName);
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setHorizontalAlignment(SwingConstants.CENTER);
		lblStream.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblStream.setBounds(255, 277, 120, 25);
		contentPane.add(lblStream);
		
		JLabel lblAddSuggestion = new JLabel("Add suggestion");
		lblAddSuggestion.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddSuggestion.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAddSuggestion.setBounds(449, 276, 139, 25);
		contentPane.add(lblAddSuggestion);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 140, 0));
		separator_1.setBounds(449, 304, 130, 15);
		contentPane.add(separator_1);
		
		
	}
}
