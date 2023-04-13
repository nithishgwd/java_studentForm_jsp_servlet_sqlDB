package cc221047018;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

	
	
	
	public class JDBCConnection {
		
		private static final String PROPERTIES_FILE = "C:\\Users\\MSIS\\Downloads\\StudentReg\\StudentReg\\db.properties";

	    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
	        Properties prop = new Properties();
	        FileInputStream in = new FileInputStream(PROPERTIES_FILE);
			prop.load(in);
			in.close();

	        String url = prop.getProperty("url");
	        String username = prop.getProperty("username");
	        String password = prop.getProperty("password");

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        return conn;
	    }
	}