
public class DriverManager {

	public static void getConnection(String url,String uname,String pwd) throws ClassNotFoundException
	{
		Class.forName("org.h2.Driver");  
		   DriverManager.getConnection("jdbc:h2:~/raja","sa","sa");
	}

}
