package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Mysqlreader();
	}

	public static List Mysqlreader() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wns", "root", "root");
		Statement statment = conn.createStatement();
		ResultSet resultset = statment.executeQuery("Select *from endo");
		List logindata = new ArrayList();
		while (resultset.next()) 
		{
			logindata.add(resultset.getString(1));
			logindata.add(resultset.getString(2));
		}
		System.out.println(logindata);
		return logindata;

	}

}
