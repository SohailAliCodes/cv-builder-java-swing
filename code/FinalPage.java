import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.awt.event.ActionEvent;

public class FinalPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalPage frame = new FinalPage();
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
	public FinalPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 528);
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
		label.setBounds(10, 0, 779, 50);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(139, 101, 526, 310);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Quick results");
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_1.setBounds(20, 116, 92, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("See the results from our offline tool in one place");
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		label_2.setBounds(30, 135, 472, 22);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("No more worries about wrong formatting");
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		label_3.setBounds(30, 193, 472, 22);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Hassle free");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(20, 174, 92, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Professional quality resume within seconds");
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		label_5.setBounds(30, 259, 472, 22);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Industry ready");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(20, 232, 92, 28);
		panel_1.add(label_6);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 140, 0));
		separator.setBounds(30, 48, 482, 22);
		panel_1.add(separator);
		
		JLabel label_7 = new JLabel("Congratulations your CV is ready!");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		label_7.setBounds(20, 11, 482, 29);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Do consider using our premium services");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 16));
		label_8.setBounds(40, 61, 448, 29);
		panel_1.add(label_8);
		
		Button button = new Button("Done");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				com.itextpdf.text.Font  titleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 18);
				com.itextpdf.text.Font subtitleFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 15);
				com.itextpdf.text.Font  textFont = FontFactory.getFont(FontFactory.HELVETICA, 12);

				
				Connection connect = null;
				Document document = new Document();
				
				String name = null;
				String email = null;
				String address = null;
				String phone = null;
				
				String objective = null;
				
				String EduName = null;
				String EduBoard = null;
				String EduMarks = null;
				String EduYear = null;
				
				String EduName1 = null;
				String EduBoard1 = null;
				String EduMarks1 = null;
				String EduYear1 = null;
				
				String EduName2 = null;
				String EduBoard2 = null;
				String EduMarks2 = null;
				String EduYear2 = null;
				
				String Strength = null;
				String ExtraCurr = null;
				
				String Strength1 = null;
				String ExtraCurr1 = null;
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
					connect=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
					
					PreparedStatement ps=connect.prepareStatement("select * from cvbuilderdatabase");
	    			ResultSet resultSet = ps.executeQuery();
				     
				    while(resultSet.next()) {
				    	  
				         name = resultSet.getString(1);
				         email=resultSet.getString(2);
				         address=resultSet.getString(3);
				         phone=resultSet.getString(4);
				         
				         //objective=resultSet.getString(5);
				         objective=resultSet.getString(6);
				         
				         //EduName=resultSet.getString(6);
				         //EduName=resultSet.getString(5);
				         EduName=resultSet.getString(9);
				         EduName1=resultSet.getString(7);
				         EduName2=resultSet.getString(8);
				         
				         Strength=resultSet.getString(10); 
				         ExtraCurr=resultSet.getString(11);
				         
				        // EduBoard=resultSet.getString(11);
				         EduBoard=resultSet.getString(14);
				         EduBoard1=resultSet.getString(12);					//5 11
				         EduBoard2=resultSet.getString(13);
				         
				         //EduMarks=resultSet.getString(14);
				         EduMarks=resultSet.getString(17);
				         
				         EduMarks1=resultSet.getString(15);
				         EduMarks2=resultSet.getString(16);
				         
				        // EduYear=resultSet.getString(17);
				         EduYear=resultSet.getString(20);
				         EduYear1=resultSet.getString(18);
				         EduYear2=resultSet.getString(19);
				                  
				      }
				      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\HelloWorld2.pdf"));
				         document.open();
				         
				         //Name
				         Paragraph Name = new Paragraph(name, titleFont);
				         document.add(Name);
				         
				         //Email
				         Paragraph Email = new Paragraph(email, textFont);
				         document.add(Email);
				         
				         //Phone
				         Paragraph PH = new Paragraph(phone, textFont);
				         document.add(PH);
				         
				         //Address
				         Paragraph AD = new Paragraph(address, textFont);
				         document.add(AD);
				         				         
				         //Objective
				         Paragraph Ob = new Paragraph("\n\nCareer Objective", subtitleFont);
				         document.add(Ob);
				         
				         Paragraph Objective = new Paragraph(objective, textFont);
				         document.add(Objective);
				         
				       				         
				         //Education
				         Paragraph EduTitle = new Paragraph("\nEducational Qualification", subtitleFont);
				         document.add(EduTitle);
				         
				         PdfPTable table = new PdfPTable(4); // 3 columns.
				         table.setWidthPercentage(100); //Width 100%
				         table.setSpacingBefore(10f); //Space before table
				         table.setSpacingAfter(10f); //Space after table
				  
				         float[] columnWidths = {1f, 1f, 1f, 1f};
				         table.setWidths(columnWidths);
				         
				         PdfPCell Exam = new PdfPCell(new Paragraph("Name"));
				         Exam.setBorderColor(BaseColor.BLACK);
				         Exam.setPaddingLeft(10);
				         Exam.setHorizontalAlignment(Element.ALIGN_CENTER);
				         Exam.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell Board = new PdfPCell(new Paragraph("Board"));
				         Board.setBorderColor(BaseColor.BLACK);
				         Board.setPaddingLeft(10);
				         Board.setHorizontalAlignment(Element.ALIGN_CENTER);
				         Board.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell Marks = new PdfPCell(new Paragraph("Marks"));
				         Marks.setBorderColor(BaseColor.BLACK);
				         Marks.setPaddingLeft(10);
				         Marks.setHorizontalAlignment(Element.ALIGN_CENTER);
				         Marks.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell Year = new PdfPCell(new Paragraph("Year"));
				         Year.setBorderColor(BaseColor.BLACK);
				         Year.setPaddingLeft(10);
				         Year.setHorizontalAlignment(Element.ALIGN_CENTER);
				         Year.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         
				         PdfPCell cell1 = new PdfPCell(new Paragraph(EduName));
				         cell1.setBorderColor(BaseColor.BLACK);
				         cell1.setPaddingLeft(10);
				         cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell2 = new PdfPCell(new Paragraph(EduBoard));
				         cell2.setBorderColor(BaseColor.BLACK);
				         cell2.setPaddingLeft(10);
				         cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell3 = new PdfPCell(new Paragraph(EduMarks));
				         cell3.setBorderColor(BaseColor.BLACK);
				         cell3.setPaddingLeft(10);
				         cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				         PdfPCell cell4 = new PdfPCell(new Paragraph(EduYear));
				         cell4.setBorderColor(BaseColor.BLACK);
				         cell4.setPaddingLeft(10);
				         cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				         PdfPCell cell5 = new PdfPCell(new Paragraph(EduName1));
				         cell5.setBorderColor(BaseColor.BLACK);
				         cell5.setPaddingLeft(10);
				         cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell6 = new PdfPCell(new Paragraph(EduBoard1));
				         cell6.setBorderColor(BaseColor.BLACK);
				         cell6.setPaddingLeft(10);
				         cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell7 = new PdfPCell(new Paragraph(EduMarks1));
				         cell7.setBorderColor(BaseColor.BLACK);
				         cell7.setPaddingLeft(10);
				         cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				         PdfPCell cell8 = new PdfPCell(new Paragraph(EduYear1));
				         cell8.setBorderColor(BaseColor.BLACK);
				         cell8.setPaddingLeft(10);
				         cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell8.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				         PdfPCell cell9 = new PdfPCell(new Paragraph(EduName2));
				         cell9.setBorderColor(BaseColor.BLACK);
				         cell9.setPaddingLeft(10);
				         cell9.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell9.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell10 = new PdfPCell(new Paragraph(EduBoard2));
				         cell10.setBorderColor(BaseColor.BLACK);
				         cell10.setPaddingLeft(10);
				         cell10.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell10.setVerticalAlignment(Element.ALIGN_MIDDLE);
				  
				         PdfPCell cell11 = new PdfPCell(new Paragraph(EduMarks2));
				         cell11.setBorderColor(BaseColor.BLACK);
				         cell11.setPaddingLeft(10);
				         cell11.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell11.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				         PdfPCell cell12 = new PdfPCell(new Paragraph(EduYear2));
				         cell12.setBorderColor(BaseColor.BLACK);
				         cell12.setPaddingLeft(10);
				         cell12.setHorizontalAlignment(Element.ALIGN_CENTER);
				         cell12.setVerticalAlignment(Element.ALIGN_MIDDLE);
				         
				  
				         //To avoid having the cell border and the content overlap, if you are having thick cell borders
				         //cell1.setUserBorderPadding(true);
				         //cell2.setUserBorderPadding(true);
				         //cell3.setUserBorderPadding(true);
				  
				         table.addCell(Exam);
				         table.addCell(Board);
				         table.addCell(Marks);
				         table.addCell(Year);
				         
				         
				         table.addCell(cell5);
				         table.addCell(cell6);
				         table.addCell(cell7);
				         table.addCell(cell8);
				         
				         table.addCell(cell9);
				         table.addCell(cell10);
				         table.addCell(cell11);
				         table.addCell(cell12);
				         

				         table.addCell(cell1);
				         table.addCell(cell2);
				         table.addCell(cell3);
				         table.addCell(cell4);
				         document.add(table);
				         
				         //Strengths
				         Paragraph STitle = new Paragraph("\nStrengths", subtitleFont);
				         document.add(STitle);
				         
				         Paragraph ST = new Paragraph(Strength, textFont);
				         document.add(ST);
				         
				         //ExtraCurr
				         Paragraph ATitle = new Paragraph("\nExtra Curricular", subtitleFont);
				         document.add(ATitle);
				         
				         Paragraph AC = new Paragraph(ExtraCurr, textFont);
				         document.add(AC);
				         
				         //Declaration
				         Paragraph D = new Paragraph("\nDeclaration:", titleFont);
				         document.add(D);
				         Paragraph DL = new Paragraph("I hereby declare that the information given above is true and correct.", textFont);
				         document.add(DL);
				         
				         //Signature
				         Paragraph S = new Paragraph("Date:______________________                   Signature:__________________________", textFont);
				         document.add(S);
				         
				         document.addCreationDate();
				         
				         
				         document.close();
				         writer.close();

				         int i= ps.executeUpdate();
							if(i > 0) {
								JOptionPane.showMessageDialog(button, "Your CV is ready!");
							}
							else {
								JOptionPane.showMessageDialog(button, "Failed! Try again later");
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
		button.setBounds(359, 430, 97, 22);
		contentPane.add(button);
	
}
}
