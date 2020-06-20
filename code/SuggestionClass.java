import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SuggestionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	
	Connection con=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");    // static block
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	PreparedStatement ps=con.prepareStatement("insert into cvbuilderstatement values(?,?)");
	
	ps.setString(1, "SofTech LLP is looking for freshly passouts for tech support job role");
	ps.setString(2, "General");
	
	int i=ps.executeUpdate();
	
	if(i>0) {
		System.out.println("Successfully inserted");
	}
	else {
		System.out.println("Not successfull");
	}
	
}catch(Exception e) {
	e.printStackTrace();
}
}

}
