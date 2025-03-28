package emplyoee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class EmplyoeeController extends HttpServlet {
	EmployeeDao empdao;
	public EmplyoeeController() {
		empdao = new EmployeeDao();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get request is working");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String nicui = request.getParameter("nicui");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("genderui");
        String accountStatus = "DeActive";
        
        Employee employee = new Employee(fname, lname, email,nicui, username, password, gender,accountStatus);
        
        response.setContentType("text/html");
        response.getWriter().println("<h2>Form Data Received</h2>");
        response.getWriter().println("<p>First Name: " + fname + "</p>");
        response.getWriter().println("<p>Last Name: " + lname + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Username: " + username + "</p>");
        response.getWriter().println("<p>Password: " + password + "</p>");
        response.getWriter().println("<p>Gender: " + gender + "</p>");
        response.getWriter().println("<p>NIc: " + employee.getNic() + "</p>");
        
        if(empdao.insertEmployee(employee)) {
        	response.getWriter().println("<h2>Sucessfully sign up</h2>");
        }else {
        	response.getWriter().println("<h2>not Sucessfully sign up</h2>");
        }
        
	}

}
