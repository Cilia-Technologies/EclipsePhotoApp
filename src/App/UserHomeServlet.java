package App;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	//	    		String user=request.getParameter("username");  
		    		String user = (String)session.getAttribute("USER");
		    		System.out.println("Welcome"+user);
		    		Connection con=GetCon.getCon();
		    		PreparedStatement ps;
		    		try {
		    			ps = con.prepareStatement("SELECT email,DOB,watsapp_num,college_name,wallet FROM user WHERE username=?");
		    			ps.setString(1,user);
		    			ResultSet rs=ps.executeQuery();	
		    			while (rs.next())
		    			{
		    			request.setAttribute("user", user);
		    			request.setAttribute("email", rs.getString(1));
		    			request.setAttribute("dob", rs.getString(2) );
		    			request.setAttribute("watsapp", rs.getString(3) );
		    			request.setAttribute("college", rs.getString(4) );
		    			request.setAttribute("wallet", rs.getString(5) );
		    			}
		    			RequestDispatcher rd=request.getRequestDispatcher("UserProfile.jsp");
		    			rd.forward(request, response);
//						out.print("Welcome "+user);
				
		    			}catch(Exception e){System.out.println(e);}  
		          
		    		out.close();  
		    }  

	}
}
