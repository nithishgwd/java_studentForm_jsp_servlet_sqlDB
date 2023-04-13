package student.dao.com;
import cc221047018.JDBCConnection;
import cc221047018.Student;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;






public class StudentdDao  {
	
    public  String insert(Student std)throws SQLException, ClassNotFoundException, IOException{
    	Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	    String subjectCode = null;
	    try {
	      conn = JDBCConnection.getConnection();
	      ps = conn.prepareStatement("SELECT subject_code FROM subjects WHERE subject_name = ?");
	      ps.setString(1, std.getSubject());
	      rs = ps.executeQuery();
	      if (rs.next()) {
	        subjectCode = rs.getString("subject_code");
	      }
	      rs.close();
	      ps.close();
	      conn.close();
	    } catch (ClassNotFoundException |  IOException| SQLException e) {
	      e.printStackTrace();
	    }

	    // Generate roll number based on the subject code
	    String rollNumber = subjectCode + "-" + String.format("%04d", (int)(Math.random() * 10000));
	  

	    // Insert student details into the students table
	    try {
	    	
	    	conn = JDBCConnection.getConnection();
	    	ps = conn.prepareStatement("INSERT INTO students(roll_number,name, age, gender, subject_name,number) VALUES (?, ?, ?,?, ?, ?)");
	    	ps.setString(1, rollNumber);
	    	ps.setString(2, std.getSname());
	    	ps.setString(3, std.getAge());
	    	ps.setString(4, std.getGender());
	    	ps.setString(5, std.getSubject());
	    	ps.setString(6, std.getPhone());
	    	ps.executeUpdate();
	    	
	    	ps.close();
	    	conn.close();
	    } catch (ClassNotFoundException | IOException|SQLException e){
	    	e.printStackTrace();
	    }

     return rollNumber;
   }
}
