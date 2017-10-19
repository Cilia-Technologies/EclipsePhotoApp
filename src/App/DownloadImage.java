package App;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;
/**
 * Servlet implementation class DownloadImage
 */
@WebServlet("/DownloadImage")
public class DownloadImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String PhotoId = request.getParameter("DN");
		PrintWriter out = response.getWriter();  
	    HttpSession session=request.getSession(false);
	    
	    if(session==null){
	    	out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);
	    }
	    else{
		try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/PhotoApp","root","password");
            String userHome = System.getProperty("user.home");
 //           System.out.println("Home directory="+userHome);
            File file = new File(userHome+"/Downloads/" + "Image" + PhotoId + ".jpg"); 
         //   File file=new File("C:\\Users\\raviteja.godavarthi\\Desktop\\PhotoApp\\image.jpg");
            FileOutputStream fos=new FileOutputStream(file);
            byte b[];
            Blob blob;
            System.out.println("photoid= "+ PhotoId);
            PreparedStatement ps=con.prepareStatement("select Actual_Photo from photos where photo_id="+PhotoId);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                blob=rs.getBlob("Actual_Photo");
                b=blob.getBytes(1,(int)blob.length());
                fos.write(b);
            }
            
            ps.close();
            fos.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	    }
	}

}
