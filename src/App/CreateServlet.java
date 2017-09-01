package App;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		String email=request.getParameter("email");
		
		String college=request.getParameter("college");
		
		String ph=request.getParameter("phone");
		double phone=Double.parseDouble(ph);
		
		String sqlDate = request.getParameter("dob");

		int status=RegisterUser.register(username, password, email, college, phone, sqlDate);
		if(status>0){
			out.print("WELCOME! YOUR ACCOUNT HAS OPENED");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		else{
			out.print("Sorry,Registration failed. please try later");
			RequestDispatcher rd=request.getRequestDispatcher("error-500.html");
			rd.include(request, response);
		}
		
	out.close();	
	}

}
