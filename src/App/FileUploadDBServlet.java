package App;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.imgscalr.Scalr;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)	// upload file's size up to 16MB
public class FileUploadDBServlet extends HttpServlet {
	
	// database connection settings
	private String dbURL = "jdbc:mysql://localhost:3306/PhotoApp";
	private String dbUser = "root";
	private String dbPass = "mysql";
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// gets values of text fields
		String user = request.getParameter("username");		
		
		InputStream inputStream = null;	// input stream of the upload file
		InputStream cropped_inputstream=null;
		// obtains the upload file part in this multipart request
		Part filePart = request.getPart("photo");
		if (filePart != null) {
			// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());
			
			// obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}
		BufferedImage image= ImageIO.read(inputStream);
		BufferedImage thumbnail = Scalr.resize(image, Scalr.Method.SPEED, Scalr.Mode.FIT_TO_WIDTH,150, 100, Scalr.OP_ANTIALIAS);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(thumbnail, "jpg", os);
        cropped_inputstream = new ByteArrayInputStream(os.toByteArray());
		
		Connection conn = null;	// connection to the database
		String message = null;	// message will be sent back to client
		
		try {
			// connects to the database
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
			PreparedStatement s1 = conn.prepareStatement("SELECT user_id FROM user where username=?");
			s1.setString(1, user);
			ResultSet rs=s1.executeQuery();
			int uid=0;
			if(rs.next())
			{
				uid=rs.getInt(1);
			}else
			{
				System.out.println("UID not found"+uid);
			}
				// constructs SQL statement
				String sql = "INSERT INTO photos (user_id,Actual_Photo,Cropped_Photo) values (?, ?, ?)";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, uid);						
				if (inputStream != null) {
					// fetches input stream of the upload file for the blob column
					statement.setBlob(2, inputStream);
				}
				if (thumbnail !=null)
				{
					statement.setBlob(3, cropped_inputstream);
				}

			// sends the statement to the database server
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "File uploaded and saved into database";
			}
		} catch (SQLException ex) {
			message = "ERROR: " + ex.getMessage();
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				// closes the database connection
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			// sets the message in request scope
			request.setAttribute("Message", message);
			
			// forwards to the message page
			getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
		}
	}
}