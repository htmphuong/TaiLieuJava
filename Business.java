import java.sql.Connection;
import java.sql.DriverManager;

public class Business {
	Connection conn;
	//connect from java to sql
	public void connect() {
		try {
			//load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//start connecting EmployeeDB database
			conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-NU4VCB7\\SQLEXPRESS;user=sa;password=123456");
			System.out.println("Connected");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
