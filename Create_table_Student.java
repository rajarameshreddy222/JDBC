import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_table_Student
{
public static void main(String[] args)
{
	try 
	{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/raja", "sa", "sa");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("create table student(name varchar(20),marks int,gender varchar(20)) ");
			if(i>0) 
			{
				System.out.println("created successfully");
			}
			else
			{
				System.out.println("Not created ");
			}
		}
		else
		{
			
			System.out.println("no");
			
		}
		
	}
    catch (Exception e)
    {
    	System.out.println(e);
    	
    }



	
	
	
}	
}
