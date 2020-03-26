import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_into_Student_values1 {

	public static void main(String[] args) throws Exception
	{
		String name="ddd",gender="male";
		int marks=89;
				
				Class.forName("org.h2.Driver");
		  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/raja","sa","sa");		
				if(con!=null)
				{
					Statement stmt=con.createStatement();
					int i=stmt.executeUpdate("insert into student values('"+name+"','"+marks+"','"+gender+"')");
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
				

				}}
