package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deletingdatabase {
	

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			String sql = "drop database avinash";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.executeUpdate();
			pmst.close();
			conn.close();	
			System.out.println("database dropped");
		} catch (Exception e) {
           System.out.println("error occured");
		}
	} 
}
