import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Insert_into_Student_values {

	public static void main(String[] args) throws Exception
	{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/raja", "sa", "sa");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into student values('ccc',99,'female')");
	          if(i>0)
	          {
	        	  System.out.println("records inserted successfully");
	          }
	          else
	          {
	        	  System.out.println("error");
	          }
		}
		else
		{
			System.out.println("no");
		}
		
		

	}

}
