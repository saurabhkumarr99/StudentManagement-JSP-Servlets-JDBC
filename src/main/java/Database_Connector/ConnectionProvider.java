package Database_Connector;
import java.sql.*;

public class ConnectionProvider {

	private static Connection connection;

	public static Connection getConnection() {

		try {

			if (connection == null) {
				// Step-1 --> Load JDBC Driver
				Class.forName("com.mysql.jdbc.Driver");

				// Step-2 --> Create a connection
				String url = "jdbc:mysql://localhost:3306/student_management_system";
				String user = "root";
				String password = "root";

				connection = DriverManager.getConnection(url, user, password);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
