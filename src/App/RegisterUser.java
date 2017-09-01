package App;

import java.sql.*;
import App.GetCon;
public class RegisterUser {
static int status=0;
//int accountno=1;
public static int register(String username,String password,String email, String college,double phone,String dob){
	//public static int register(String email,String password,String gender,String country,String name){

	Connection con=GetCon.getCon();
	PreparedStatement ps;
	try {
		ps = con.prepareStatement("Insert into user(username,email,DOB,watsapp_num,college_name,password) values(?,?,?,?,?,?)");
		ps.setString(1,username);
		ps.setString(2,email);
		ps.setString(3,dob);
		ps.setDouble(4,phone);
		ps.setString(5,college);
		ps.setString(6,password);
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return status;
	
  }
}

