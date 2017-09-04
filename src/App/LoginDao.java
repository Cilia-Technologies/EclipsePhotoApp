package App;

import java.io.IOException;
import java.sql.*;
import App.GetCon;
public class LoginDao {
       
    public static boolean validate(String user, String pass) {
        boolean status=false;
        Connection con=GetCon.getCon();
    	PreparedStatement ps;
    	try {
    		ps = con.prepareStatement("SELECT * FROM user WHERE username=? and password=?");
    		ps.setString(1,user);
    		ps.setString(2,pass);
    		ResultSet rs=ps.executeQuery();
    		
    		status=rs.next();
    	}
    	catch(Exception e){System.out.println(e);}  
        return status;
    }
    
        public static boolean validateUser(String user) {
            boolean status=false;
            Connection con=GetCon.getCon();
        	PreparedStatement ps;
        	try {
        		ps = con.prepareStatement("SELECT * FROM user WHERE username=?");
        		ps.setString(1,user);
        		ResultSet rs=ps.executeQuery();
        		
        		status=rs.next();
        	}
        	catch(Exception e){System.out.println(e);}  
            return status;
        
    }



}
