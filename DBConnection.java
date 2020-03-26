import java.sql.DriverManager;

import java.sql.Connection;


public class DBConnection {

	public static void main(String[] args) throws Exception
	{
				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection( "jdbc:h2:tcp://localhost/~/raja","sa","sa");
				if(con!=null)
				{
					System.out.println("Connecition established Successfully");
				}
				else
				{
					System.out.println("error");
				}

	}

}
