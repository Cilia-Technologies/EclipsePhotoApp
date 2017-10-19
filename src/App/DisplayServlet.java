package App;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public void init() throws ServletException {

    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
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

        String imageId = request.getParameter("id");
        System.out.println(imageId);
        System.out.println("Inside do post servlet1");
        InputStream sImage;

        // Check if ID is supplied to the request.
        if (imageId == null) {
            // Do your thing if the ID is not supplied to the request.
            // Throw an exception, or send 404, or show default/warning image, or just ignore it.
            response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
            return;
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PhotoApp", "root","password");
 //         stmt = conn.prepareStatement("select * from contacts where contact_id=" + imageId); 
            stmt = conn.prepareStatement("select cropped_photo from photos");
 //           rs = stmt.executeQuery();
/*            while(rs.next()){
                System.out.println("Inside RS");
                byte[] bytearray = new byte[1048576];
                int size=0;
                sImage = rs.getBinaryStream(4);
//              response.reset();
                response.setContentType("image/jpeg");
                while((size = sImage.read(bytearray)) != -1 ){
                    response.getOutputStream().
                    write(bytearray,0,size);
                }
            } */
        /*    String imgLen="";
            rs = stmt.executeQuery("select photo from contacts");
            System.out.println("Inside while loop");
            while(rs.next()){
            	 System.out.println("Inside while loop");
                 
                 imgLen = rs.getString(1);
                 System.out.println(imgLen.length());
               
            int len = imgLen.length();
            byte [] rb = new byte[len];
            InputStream readImg = rs.getBinaryStream(1);
            int index=readImg.read(rb, 0, len);  
            System.out.println("index"+index);
            stmt.close();
            response.reset();
            response.setContentType("image/jpg");
            response.getOutputStream().write(rb,0,len);
            response.getOutputStream().flush();  
            } */
            
            String imgLen="";
            rs = stmt.executeQuery("select cropped_photo from photos where photo_id='8'");
            System.out.println("Inside while loop");
            while(rs.next()){
            	 System.out.println("Inside while loop");
                 
                 imgLen = rs.getString(1);
                 System.out.println(imgLen.length());
               
            int len = imgLen.length();
            byte [] rb = new byte[len];
            InputStream readImg = rs.getBinaryStream(1);
            int index=readImg.read(rb, 0, len);  
            System.out.println("index"+index);
            stmt.close();
            response.reset();
            response.setContentType("image/jpg");
            response.getOutputStream().write(rb,0,len);
            response.getOutputStream().flush();  
            }
            
            

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}