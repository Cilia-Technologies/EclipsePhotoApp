package App;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;  

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String u=request.getParameter("username");  
		    String p=request.getParameter("password");  
		    if(LoginDao.validateUser(u)){
		    
		    	if(LoginDao.validate(u, p)){  
		        RequestDispatcher rd=request.getRequestDispatcher("UserHomeServlet");  
		        rd.forward(request,response);  
		    	}  
		    	else{  
		    		
		    		request.setAttribute("loginresponse", "Sorry username or password error" );
		    		RequestDispatcher rd=request.getRequestDispatcher("login.html");  
		    		rd.include(request,response);  
		    	}  
		    }
		    else
		    {
		    	out.println("Username not exists!, Register");
		    	RequestDispatcher rd=request.getRequestDispatcher("login.html");  
	    		rd.include(request,response); 
		    }
		    out.close();  
	}

}
