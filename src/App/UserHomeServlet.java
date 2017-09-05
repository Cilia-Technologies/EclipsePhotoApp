package App;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserHomeServlet")
public class UserHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
		    throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    HttpSession session=request.getSession(false);
		    if(session==null){
		    	out.print("Please login first");  
	            request.getRequestDispatcher("login.html").include(request, response);
		    }
		    else{
		    	RequestDispatcher rd=request.getRequestDispatcher("userprofile.html");
				rd.include(request, response);
		    String n=request.getParameter("username");  
		    out.print("Welcome "+n);
		    }
		          
		    out.close();  
		    }  

}
