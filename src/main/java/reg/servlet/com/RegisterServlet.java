package reg.servlet.com;

import cc221047018.Student;

import student.dao.com.StudentdDao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String age = request.getParameter("age");
	    String gender = request.getParameter("gender");
	    String subject = request.getParameter("subject");
	    String num = request.getParameter("num");

	    // Retrieve subject code from the subjects table
	    Student std = new Student(name, age, gender, subject,num);
	    
	    StudentdDao sdao = new StudentdDao();
		
	    String rollNumber;
	
		
		try {
			rollNumber = sdao.insert(std);
			
			        // Display the auto-generated roll number to the user
			        request.setAttribute("rollNumber", rollNumber);
			        RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			        rd.forward(request, response);
			      
			//response.sendRedirect("login.jsp");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
