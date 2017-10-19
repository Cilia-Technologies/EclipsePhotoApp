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

import java.awt.Color;
import java.awt.Font;

import net.coobird.thumbnailator.filters.Caption;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)	// upload file's size up to 16MB
public class FileUploadDBServlet extends HttpServlet {
	
	// database connection settings
	private String dbURL = "jdbc:mysql://localhost:3306/PhotoApp";
	private String dbUser = "root";
	private String dbPass = "password";
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// gets values of text fields
		String user = request.getParameter("username");		
		
		InputStream inputStream = null;
		InputStream inputStream1 = null;// input stream of the upload file
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
			inputStream1 = filePart.getInputStream();
		}
		BufferedImage image= ImageIO.read(inputStream);
		BufferedImage thumbnail = Scalr.resize(image, Scalr.Method.SPEED, Scalr.Mode.FIT_TO_WIDTH,150, 100, Scalr.OP_ANTIALIAS);
//Watermark logic
		String caption = "LANGOORLENS";
		Font font = new Font("Monospaced", Font.PLAIN, 14);
		Color c = Color.black;
		Position position = Positions.CENTER;
		int insetPixels = 0;
		Caption filter = new Caption(caption, font, c, position, insetPixels);
				
		BufferedImage captionedImage = filter.apply(thumbnail);
//Watermark logic ends here
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(captionedImage, "jpg", os);
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
				if (captionedImage !=null)
				{
					statement.setBlob(3, cropped_inputstream);
				}
				if (inputStream != null) {
					// fetches input stream of the upload file for the blob column
					statement.setBlob(2, inputStream1);
					System.out.println("Inputstream"+inputStream);
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