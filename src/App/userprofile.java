package App;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userprofile
 */
@WebServlet("/userprofile")
public class userprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userprofile() {
        super();
        
        
        
        
       
        
        
        
        
        
        
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();
		
		    String u=request.getParameter("username");
		
		    Connection con=GetCon.getCon();
	    	PreparedStatement ps;
	    	ResultSet rs = null;
	    	
	    		try {
					ps = con.prepareStatement("SELECT * FROM user where username=?");
					ps.setString(1,u);
					rs = ps.executeQuery();
					int i=1;
					while(rs.next())
		    		{
					//	out.println(rs.getString(1));
						
		    		}
	    		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    
		    
		    
		    
		    
		 out.println("<!DOCTYPE html>\n" + 
		 		"<html lang=\"en\">\n" + 
		 		"	<head>\n" + 
		 		"		<meta charset=\"utf-8\" />\n" + 
		 		"		<title> Admin</title>\n" + 
		 		"\n" + 
		 		"		<meta name=\"description\" content=\"Common form elements and layouts\" />\n" + 
		 		"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" + 
		 		"\n" + 
		 		"		<!--basic styles-->\n" + 
		 		"\n" + 
		 		"		<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n" + 
		 		"		<link href=\"assets/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" />\n" + 
		 		"\n" + 
		 		"		<!--[if IE 7]>\n" + 
		 		"		  <link rel=\"stylesheet\" href=\"assets/css/font-awesome-ie7.min.css\" />\n" + 
		 		"		<![endif]-->\n" + 
		 		"\n" + 
		 		"		<!--page specific plugin styles-->\n" + 
		 		"\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/jquery-ui-1.10.3.custom.min.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/chosen.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/datepicker.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/bootstrap-timepicker.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/daterangepicker.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/colorpicker.css\" />\n" + 
		 		"\n" + 
		 		"		<!--fonts-->\n" + 
		 		"\n" + 
		 		"		<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300\" />\n" + 
		 		"\n" + 
		 		"		<!--ace styles-->\n" + 
		 		"\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/ace-responsive.min.css\" />\n" + 
		 		"		<link rel=\"stylesheet\" href=\"assets/css/ace-skins.min.css\" />\n" + 
		 		"\n" + 
		 		"		<!--[if lte IE 8]>\n" + 
		 		"		  <link rel=\"stylesheet\" href=\"assets/css/ace-ie.min.css\" />\n" + 
		 		"		<![endif]-->\n" + 
		 		"\n" + 
		 		"		<!--inline styles related to this page-->\n" + 
		 		"	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /></head>\n" + 
		 		"\n" + 
		 		"	<body>\n" + 
		 		"		<div class=\"navbar\">\n" + 
		 		"			<div class=\"navbar-inner\">\n" + 
		 		"				<div class=\"container-fluid\">\n" + 
		 		"					<a href=\"#\" class=\"brand\">\n" + 
		 		"						<small>\n" + 
		 		"							<i class=\"icon-leaf\"></i>\n" + 
		 		"							Admin\n" + 
		 		"						</small>\n" + 
		 		"					</a><!--/.brand-->\n" + 
		 		"\n" + 
		 		"					<ul class=\"nav ace-nav pull-right\">\n" + 
		 		"						<li class=\"grey\">\n" + 
		 		"							<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
		 		"								<i class=\"icon-tasks\"></i>\n" + 
		 		"								<span class=\"badge badge-grey\">4</span>\n" + 
		 		"							</a>\n" + 
		 		"\n" + 
		 		"							<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n" + 
		 		"								<li class=\"nav-header\">\n" + 
		 		"									<i class=\"icon-ok\"></i>\n" + 
		 		"									4 Tasks to complete\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">Software Update</span>\n" + 
		 		"											<span class=\"pull-right\">65%</span>\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"progress progress-mini \">\n" + 
		 		"											<div style=\"width:65%\" class=\"bar\"></div>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">Hardware Upgrade</span>\n" + 
		 		"											<span class=\"pull-right\">35%</span>\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"progress progress-mini progress-danger\">\n" + 
		 		"											<div style=\"width:35%\" class=\"bar\"></div>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">Unit Testing</span>\n" + 
		 		"											<span class=\"pull-right\">15%</span>\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"progress progress-mini progress-warning\">\n" + 
		 		"											<div style=\"width:15%\" class=\"bar\"></div>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">Bug Fixes</span>\n" + 
		 		"											<span class=\"pull-right\">90%</span>\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"progress progress-mini progress-success progress-striped active\">\n" + 
		 		"											<div style=\"width:90%\" class=\"bar\"></div>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										See tasks with details\n" + 
		 		"										<i class=\"icon-arrow-right\"></i>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"							</ul>\n" + 
		 		"						</li>\n" + 
		 		"\n" + 
		 		"						<li class=\"purple\">\n" + 
		 		"							<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
		 		"								<i class=\"icon-bell-alt icon-animated-bell\"></i>\n" + 
		 		"								<span class=\"badge badge-important\">8</span>\n" + 
		 		"							</a>\n" + 
		 		"\n" + 
		 		"							<ul class=\"pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-closer\">\n" + 
		 		"								<li class=\"nav-header\">\n" + 
		 		"									<i class=\"icon-warning-sign\"></i>\n" + 
		 		"									8 Notifications\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">\n" + 
		 		"												<i class=\"btn btn-mini no-hover btn-pink icon-comment\"></i>\n" + 
		 		"												New Comments\n" + 
		 		"											</span>\n" + 
		 		"											<span class=\"pull-right badge badge-info\">+12</span>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<i class=\"btn btn-mini btn-primary icon-user\"></i>\n" + 
		 		"										Bob just signed up as an editor ...\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">\n" + 
		 		"												<i class=\"btn btn-mini no-hover btn-success icon-shopping-cart\"></i>\n" + 
		 		"												New Orders\n" + 
		 		"											</span>\n" + 
		 		"											<span class=\"pull-right badge badge-success\">+8</span>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<div class=\"clearfix\">\n" + 
		 		"											<span class=\"pull-left\">\n" + 
		 		"												<i class=\"btn btn-mini no-hover btn-info icon-twitter\"></i>\n" + 
		 		"												Followers\n" + 
		 		"											</span>\n" + 
		 		"											<span class=\"pull-right badge badge-info\">+11</span>\n" + 
		 		"										</div>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										See all notifications\n" + 
		 		"										<i class=\"icon-arrow-right\"></i>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"							</ul>\n" + 
		 		"						</li>\n" + 
		 		"\n" + 
		 		"						<li class=\"green\">\n" + 
		 		"							<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
		 		"								<i class=\"icon-envelope icon-animated-vertical\"></i>\n" + 
		 		"								<span class=\"badge badge-success\">5</span>\n" + 
		 		"							</a>\n" + 
		 		"\n" + 
		 		"							<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n" + 
		 		"								<li class=\"nav-header\">\n" + 
		 		"									<i class=\"icon-envelope-alt\"></i>\n" + 
		 		"									5 Messages\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<img src=\"assets/avatars/avatar.png\" class=\"msg-photo\" alt=\"Alex's Avatar\" />\n" + 
		 		"										<span class=\"msg-body\">\n" + 
		 		"											<span class=\"msg-title\">\n" + 
		 		"												<span class=\"blue\">Alex:</span>\n" + 
		 		"												Ciao sociis natoque penatibus et auctor ...\n" + 
		 		"											</span>\n" + 
		 		"\n" + 
		 		"											<span class=\"msg-time\">\n" + 
		 		"												<i class=\"icon-time\"></i>\n" + 
		 		"												<span>a moment ago</span>\n" + 
		 		"											</span>\n" + 
		 		"										</span>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<img src=\"assets/avatars/avatar3.png\" class=\"msg-photo\" alt=\"Susan's Avatar\" />\n" + 
		 		"										<span class=\"msg-body\">\n" + 
		 		"											<span class=\"msg-title\">\n" + 
		 		"												<span class=\"blue\">Susan:</span>\n" + 
		 		"												Vestibulum id ligula porta felis euismod ...\n" + 
		 		"											</span>\n" + 
		 		"\n" + 
		 		"											<span class=\"msg-time\">\n" + 
		 		"												<i class=\"icon-time\"></i>\n" + 
		 		"												<span>20 minutes ago</span>\n" + 
		 		"											</span>\n" + 
		 		"										</span>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<img src=\"assets/avatars/avatar4.png\" class=\"msg-photo\" alt=\"Bob's Avatar\" />\n" + 
		 		"										<span class=\"msg-body\">\n" + 
		 		"											<span class=\"msg-title\">\n" + 
		 		"												<span class=\"blue\">Bob:</span>\n" + 
		 		"												Nullam quis risus eget urna mollis ornare ...\n" + 
		 		"											</span>\n" + 
		 		"\n" + 
		 		"											<span class=\"msg-time\">\n" + 
		 		"												<i class=\"icon-time\"></i>\n" + 
		 		"												<span>3:15 pm</span>\n" + 
		 		"											</span>\n" + 
		 		"										</span>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										See all messages\n" + 
		 		"										<i class=\"icon-arrow-right\"></i>\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"							</ul>\n" + 
		 		"						</li>\n" + 
		 		"\n" + 
		 		"						<li class=\"light-blue\">\n" + 
		 		"							<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n" + 
		 		"								<img class=\"nav-user-photo\" src=\"assets/avatars/user.jpg\" alt=\"Jason's Photo\" />\n" + 
		 		"								<span class=\"user-info\">\n" + 
		 		"									<small>Welcome,</small>\n" + 
		 		"									Jason\n" + 
		 		"								</span>\n" + 
		 		"\n" + 
		 		"								<i class=\"icon-caret-down\"></i>\n" + 
		 		"							</a>\n" + 
		 		"\n" + 
		 		"							<ul class=\"user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer\">\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<i class=\"icon-cog\"></i>\n" + 
		 		"										Settings\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<i class=\"icon-user\"></i>\n" + 
		 		"										Profile\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"\n" + 
		 		"								<li class=\"divider\"></li>\n" + 
		 		"\n" + 
		 		"								<li>\n" + 
		 		"									<a href=\"#\">\n" + 
		 		"										<i class=\"icon-off\"></i>\n" + 
		 		"										Logout\n" + 
		 		"									</a>\n" + 
		 		"								</li>\n" + 
		 		"							</ul>\n" + 
		 		"						</li>\n" + 
		 		"					</ul><!--/.ace-nav-->\n" + 
		 		"				</div><!--/.container-fluid-->\n" + 
		 		"			</div><!--/.navbar-inner-->\n" + 
		 		"		</div>\n" + 
		 		"\n" + 
		 		"		<div class=\"main-container container-fluid\">\n" + 
		 		"			<a class=\"menu-toggler\" id=\"menu-toggler\" href=\"#\">\n" + 
		 		"				<span class=\"menu-text\"></span>\n" + 
		 		"			</a>\n" + 
		 		"\n" + 
		 		"			<div class=\"sidebar\" id=\"sidebar\">\n" + 
		 		"				<div class=\"sidebar-shortcuts\" id=\"sidebar-shortcuts\">\n" + 
		 		"					<div class=\"sidebar-shortcuts-large\" id=\"sidebar-shortcuts-large\">\n" + 
		 		"						<button class=\"btn btn-small btn-success\">\n" + 
		 		"							<i class=\"icon-signal\"></i>\n" + 
		 		"						</button>\n" + 
		 		"\n" + 
		 		"						<button class=\"btn btn-small btn-info\">\n" + 
		 		"							<i class=\"icon-pencil\"></i>\n" + 
		 		"						</button>\n" + 
		 		"\n" + 
		 		"						<button class=\"btn btn-small btn-warning\">\n" + 
		 		"							<i class=\"icon-group\"></i>\n" + 
		 		"						</button>\n" + 
		 		"\n" + 
		 		"						<button class=\"btn btn-small btn-danger\">\n" + 
		 		"							<i class=\"icon-cogs\"></i>\n" + 
		 		"						</button>\n" + 
		 		"					</div>\n" + 
		 		"\n" + 
		 		"					<div class=\"sidebar-shortcuts-mini\" id=\"sidebar-shortcuts-mini\">\n" + 
		 		"						<span class=\"btn btn-success\"></span>\n" + 
		 		"\n" + 
		 		"						<span class=\"btn btn-info\"></span>\n" + 
		 		"\n" + 
		 		"						<span class=\"btn btn-warning\"></span>\n" + 
		 		"\n" + 
		 		"						<span class=\"btn btn-danger\"></span>\n" + 
		 		"					</div>\n" + 
		 		"				</div><!--#sidebar-shortcuts-->\n" + 
		 		"\n" + 
		 		"				<ul class=\"nav nav-list\">\n" + 
		 		"					<li>\n" + 
		 		"						<a href=\"admin.html\">\n" + 
		 		"							<i class=\"icon-dashboard\"></i>\n" + 
		 		"							<span class=\"menu-text\"> Dashboard </span>\n" + 
		 		"						</a>\n" + 
		 		"					</li>\n" + 
		 		"\n" + 
		 		"					\n" + 
		 		"\n" + 
		 		"					\n" + 
		 		"\n" + 
		 		"					<li>\n" + 
		 		"						<a href=\"users.html\">\n" + 
		 		"							<i class=\"icon-list\"></i>\n" + 
		 		"							<span class=\"menu-text\"> USERS </span>\n" + 
		 		"						</a>\n" + 
		 		"					</li>\n" + 
		 		"\n" + 
		 		"					\n" + 
		 		"\n" + 
		 		"					\n" + 
		 		"\n" + 
		 		"					\n" + 
		 		"					\n" + 
		 		"				</ul><!--/.nav-list-->\n" + 
		 		"\n" + 
		 		"				<div class=\"sidebar-collapse\" id=\"sidebar-collapse\">\n" + 
		 		"					<i class=\"icon-double-angle-left\"></i>\n" + 
		 		"				</div>\n" + 
		 		"			</div>\n" + 
		 		"\n" + 
		 		"			<div class=\"main-content\">\n" + 
		 		"				<div class=\"breadcrumbs\" id=\"breadcrumbs\">\n" + 
		 		"					<ul class=\"breadcrumb\">\n" + 
		 		"						<li>\n" + 
		 		"							<i class=\"icon-home home-icon\"></i>\n" + 
		 		"							<a href=\"#\">Home</a>\n" + 
		 		"\n" + 
		 		"							<span class=\"divider\">\n" + 
		 		"								<i class=\"icon-angle-right arrow-icon\"></i>\n" + 
		 		"							</span>\n" + 
		 		"						</li>\n" + 
		 		"\n" + 
		 		"						\n" + 
		 		"						<li class=\"active\">User Name</li>\n" + 
		 		"					</ul><!--.breadcrumb-->\n" + 
		 		"\n" + 
		 		"					<div class=\"nav-search\" id=\"nav-search\">\n" + 
		 		"						<form class=\"form-search\" />\n" + 
		 		"							<span class=\"input-icon\">\n" + 
		 		"								<input type=\"text\" placeholder=\"Search ...\" class=\"input-small nav-search-input\" id=\"nav-search-input\" autocomplete=\"off\" />\n" + 
		 		"								<i class=\"icon-search nav-search-icon\"></i>\n" + 
		 		"							</span>\n" + 
		 		"						</form>\n" + 
		 		"					</div><!--#nav-search-->\n" + 
		 		"				</div>\n" + 
		 		"\n" + 
		 		"				<div class=\"page-content\">\n" + 
		 		"					<div class=\"page-header position-relative\">\n" + 
		 		"						<h1>\n" + 
		 		"							User Account\n" + 
		 		"							<small>\n" + 
		 		"								<i class=\"icon-double-angle-right\"></i>\n" + 
		 		"								Upload the user photoes and update the user wallet \n" + 
		 		"							</small>\n" + 
		 		"						</h1>\n" + 
		 		"					</div><!--/.page-header-->\n" + 
		 		"\n" );
		 
		 out.println("<div class=\"row-fluid\">\n" + 
		 		"						<div class=\"span12\">\n" + 
		 		"							<!--PAGE CONTENT BEGINS-->\n" + 
		 		"\n" + 
		 		"							<div class=\"row-fluid\">\n" + 
		 		"								<ul class=\"ace-thumbnails\">\n" + 
		 		"									<li>\n" + 
		 		"										<a href=\"assets/images/gallery/image-1.jpg\" title=\"Photo Title\" data-rel=\"colorbox\">\n" + 
		 		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-1.jpg\" />\n" + 
		 		
		 		"										</a>\n" + 
		 		"\n" + 
		 		
		 		"									</li>\n" + 
		 		"									</ul>\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"							</div>");
		 
	out.println("    "+	 
		 		"					<div class=\"row-fluid\">\n" + 
		 		"						<div class=\"span12\">\n" + 
		 		"							<!--PAGE CONTENT BEGINS-->\n" + 
		 		"\n" + 
		 		"							<form class=\"form-horizontal\" />\n" + 
		 		"								<div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-field-1\">User Name</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=");
	              out.println(u);   
	            
	            	out.println(	 "/>\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-field-2\">Password </label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"password\" id=\"form-input-readonly\" placeholder=\"Password\" />\n" + 
		 		"										<span class=\"help-inline\">Inline help text</span>\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-input-readonly\">Whats App Number</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"Ph No\" />\n" + 
		 		"										\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"\n" + 
		 		"                                 <div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-input-readonly\">Email</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"Email\" />\n" + 
		 		"										\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								 <div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-input-readonly\">Date Of Birth</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"DOB\" />\n" + 
		 		"										\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								 <div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-input-readonly\">College</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"\" />\n" + 
		 		"										\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"								 <div class=\"control-group\">\n" + 
		 		"									<label class=\"control-label\" for=\"form-input-readonly\">Role</label>\n" + 
		 		"\n" + 
		 		"									<div class=\"controls\">\n" + 
		 		"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"\" />\n" + 
		 		"										\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		
				"								 <div class=\"control-group\">\n" + 
				"									<label class=\"control-label\" for=\"form-input-readonly\">Year</label>\n" + 
				"\n" + 
				"									<div class=\"controls\">\n" + 
				"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"\" />\n" + 
				"										\n" + 
				"									</div>\n" + 
				"								</div>\n" + 
				"								 <div class=\"control-group\">\n" + 
				"									<label class=\"control-label\" for=\"form-input-readonly\">Course</label>\n" + 
				"\n" + 
				"									<div class=\"controls\">\n" + 
				"										<input readonly=\"\" type=\"text\" id=\"form-input-readonly\" placeholder=\"\" />\n" + 
				"										\n" + 
				"									</div>\n" + 
				"								</div>\n" + 
 	
		 		
		 		"\n" + 
		 		"\n" + 
		 		"								<div class=\"hr\"></div>\n" + 
		 		"\n" + 
		 		"								\n" + 
		 		"\n" + 
		 		"								\n" + 
		 		"								\n" + 
		 		"								\n" + 
		 		"\n" + 
		 		"								\n" + 
		 		"<a href=\"/PhotoApp/Upload.jsp?uname=");
		 		out.println(u);
		        out.println(""
		        + ""
		 		+ "\"> upload photo  </a>" +
		 				 		"\n" );
		 		
		 				 		
out.println("<div class=\"row-fluid\">\n" + 
		"						<div class=\"span12\">\n" + 
		"							<!--PAGE CONTENT BEGINS-->\n" + 
		"\n" + 
		"							<div class=\"row-fluid\">\n" + 
		"								<ul class=\"ace-thumbnails\">\n" + 
		"									<li>\n" + 
		"										<a href=\"assets/images/gallery/image-1.jpg\" title=\"Photo Title\" data-rel=\"colorbox\">\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-1.jpg\" />\n" + 
		"											<div class=\"tags\">\n" + 
		"												<span class=\"label label-info\">breakfast</span>\n" + 
		"												<span class=\"label label-important\">fruits</span>\n" + 
		"												<span class=\"label label-success\">toast</span>\n" + 
		"												<span class=\"label label-warning arrowed-in\">diet</span>\n" + 
		"											</div>\n" + 
		"										</a>\n" + 
		"\n" + 
		"										<div class=\"tools\">\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-link\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-paper-clip\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-pencil\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-remove red\"></i>\n" + 
		"											</a>\n" + 
		"										</div>\n" + 
		"									</li>\n" + 
		"\n" + 
		"									<li>\n" + 
		"										<a href=\"assets/images/gallery/image-2.jpg\" data-rel=\"colorbox\">\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-2.jpg\" />\n" + 
		"											<div class=\"text\">\n" + 
		"												<div class=\"inner\">Sample Caption on Hover</div>\n" + 
		"											</div>\n" + 
		"										</a>\n" + 
		"									</li>\n" + 
		"\n" + 
		"									<li>\n" + 
		"										<a href=\"assets/images/gallery/image-3.jpg\" data-rel=\"colorbox\">\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-3.jpg\" />\n" + 
		"											<div class=\"text\">\n" + 
		"												<div class=\"inner\">Sample Caption on Hover</div>\n" + 
		"											</div>\n" + 
		"										</a>\n" + 
		"\n" + 
		"										<div class=\"tools tools-bottom\">\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-link\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-paper-clip\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-pencil\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-remove red\"></i>\n" + 
		"											</a>\n" + 
		"										</div>\n" + 
		"									</li>\n" + 
		"\n" + 
		"									<li>\n" + 
		"										<a href=\"assets/images/gallery/image-4.jpg\" data-rel=\"colorbox\">\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-4.jpg\" />\n" + 
		"											<div class=\"tags\">\n" + 
		"												<span class=\"label label-info arrowed\">fountain</span>\n" + 
		"												<span class=\"label label-important\">recreation</span>\n" + 
		"											</div>\n" + 
		"										</a>\n" + 
		"\n" + 
		"										<div class=\"tools tools-top\">\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-link\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-paper-clip\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-pencil\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-remove red\"></i>\n" + 
		"											</a>\n" + 
		"										</div>\n" + 
		"									</li>\n" + 
		"\n" + 
		"									<li>\n" + 
		"										<div>\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-5.jpg\" />\n" + 
		"											<div class=\"text\">\n" + 
		"												<div class=\"inner\">\n" + 
		"													<span>Some Title!</span>\n" + 
		"\n" + 
		"													<br />\n" + 
		"													<a href=\"assets/images/gallery/image-5.jpg\" data-rel=\"colorbox\">\n" + 
		"														<i class=\"icon-zoom-in\"></i>\n" + 
		"													</a>\n" + 
		"\n" + 
		"													<a href=\"#\">\n" + 
		"														<i class=\"icon-user\"></i>\n" + 
		"													</a>\n" + 
		"\n" + 
		"													<a href=\"#\">\n" + 
		"														<i class=\"icon-share-alt\"></i>\n" + 
		"													</a>\n" + 
		"												</div>\n" + 
		"											</div>\n" + 
		"										</div>\n" + 
		"									</li>\n" + 
		"\n" + 
		"									<li>\n" + 
		"										<a href=\"assets/images/gallery/image-6.jpg\" data-rel=\"colorbox\">\n" + 
		"											<img alt=\"150x150\" src=\"assets/images/gallery/thumb-6.jpg\" />\n" + 
		"										</a>\n" + 
		"\n" + 
		"										<div class=\"tools tools-right\">\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-link\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-paper-clip\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-pencil\"></i>\n" + 
		"											</a>\n" + 
		"\n" + 
		"											<a href=\"#\">\n" + 
		"												<i class=\"icon-remove red\"></i>\n" + 
		"											</a>\n" + 
		"										</div>\n" + 
		"									</li>\n" + 
		"\n" + 
	
		"\n" + 
	
		"								</ul>\n" + 
		"							</div><!--PAGE CONTENT ENDS-->\n" + 
		"						</div><!--/.span-->\n" + 
		"					</div><!--/.row-fluid--> ");


out.println("<div class=\"row-fluid\">\n" + 
		"								<div class=\"span12\">\n" + 
		"									<table id=\"sample-table-1\" class=\"table table-striped table-bordered table-hover\">\n" + 
		"										<thead>\n" + 
		"											<tr>\n" + 
		"												<th class=\"center\">\n" + 
													" Sl NO "	+	
		"												</th>\n" + 

		"												<th>Photos</th>\n" + 
		"												<th class=\"hidden-480\">Category</th>\n" + 
		"\n" + 
		"												<th class=\"hidden-phone\">\n" + 
		 "                   Price            "+
		"												</th>\n" + 
		"												<th class=\"hidden-480\">Time</th>\n" + 
		"\n" + 
		"												<th>Save</th>\n" + 
		"											</tr>\n" + 
		"										</thead>\n" + 
		"\n" + 
		"										<tbody>\n" + 
		"											<tr>\n" + 
		"												<td class=\"center\">\n" + 
		"1"+
		"												</td>\n" + 
		"                                                                           " + 
		"												<td>\n" + 
		"													<a href=\"#\">ace.com</a>\n" + 
		"												</td>\n" + 
		"												<td>$45</td>\n" + 
		"												<td class=\"hidden-480\">3,330</td>\n" + 
		"												<td class=\"hidden-phone\">Feb 12</td>\n" + 
		"\n" + 
		"												<td class=\"hidden-480\">\n" + 
		"													<span class=\"label label-warning\">Expiring</span>\n" + 
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<div class=\"hidden-phone visible-desktop btn-group\">\n" + 
		"														<button class=\"btn btn-mini btn-success\">\n" + 
		"															<i class=\"icon-ok bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-info\">\n" + 
		"															<i class=\"icon-edit bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-danger\">\n" + 
		"															<i class=\"icon-trash bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-warning\">\n" + 
		"															<i class=\"icon-flag bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"													</div>\n" + 
		"\n" + 
		"													<div class=\"hidden-desktop visible-phone\">\n" + 
		"														<div class=\"inline position-relative\">\n" + 
		"															<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		"																<i class=\"icon-cog icon-only bigger-110\"></i>\n" + 
		"															</button>\n" + 
		"\n" + 
		"															<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		"																		<span class=\"blue\">\n" + 
		"																			<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		"																		<span class=\"green\">\n" + 
		"																			<i class=\"icon-edit bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		"																		<span class=\"red\">\n" + 
		"																			<i class=\"icon-trash bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"															</ul>\n" + 
		"														</div>\n" + 
		"													</div>\n" + 
		"												</td>\n" + 
		"											</tr>\n" + 
		"\n" + 
		"											<tr>\n" + 
		"												<td class=\"center\">\n" + 
														  "2 " +
														  
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<a href=\"#\">base.com</a>\n" + 
		"												</td>\n" + 
		"												<td>$35</td>\n" + 
		"												<td class=\"hidden-480\">2,595</td>\n" + 
		"												<td class=\"hidden-phone\">Feb 18</td>\n" + 
		"\n" + 
		"												<td class=\"hidden-480\">\n" + 
		"													<span class=\"label label-success\">Registered</span>\n" + 
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<div class=\"hidden-phone visible-desktop btn-group\">\n" + 
		"														<button class=\"btn btn-mini btn-success\">\n" + 
		"															<i class=\"icon-ok bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-info\">\n" + 
		"															<i class=\"icon-edit bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-danger\">\n" + 
		"															<i class=\"icon-trash bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-warning\">\n" + 
		"															<i class=\"icon-flag bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"													</div>\n" + 
		"\n" + 
		"													<div class=\"hidden-desktop visible-phone\">\n" + 
		"														<div class=\"inline position-relative\">\n" + 
		"															<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		"																<i class=\"icon-cog icon-only bigger-110\"></i>\n" + 
		"															</button>\n" + 
		"\n" + 
		"															<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		"																		<span class=\"blue\">\n" + 
		"																			<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		"																		<span class=\"green\">\n" + 
		"																			<i class=\"icon-edit bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		"																		<span class=\"red\">\n" + 
		"																			<i class=\"icon-trash bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"															</ul>\n" + 
		"														</div>\n" + 
		"													</div>\n" + 
		"												</td>\n" + 
		"											</tr>\n" + 
		"\n" + 
		"											<tr>\n" + 
		"												<td class=\"center\">\n" + 
		"												3	"+
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<a href=\"#\">max.com</a>\n" + 
		"												</td>\n" + 
		"												<td>$60</td>\n" + 
		"												<td class=\"hidden-480\">4,400</td>\n" + 
		"												<td class=\"hidden-phone\">Mar 11</td>\n" + 
		"\n" + 
		"												<td class=\"hidden-480\">\n" + 
		"													<span class=\"label label-warning\">Expiring</span>\n" + 
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<div class=\"hidden-phone visible-desktop btn-group\">\n" + 
		"														<button class=\"btn btn-mini btn-success\">\n" + 
		"															<i class=\"icon-ok bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-info\">\n" + 
		"															<i class=\"icon-edit bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-danger\">\n" + 
		"															<i class=\"icon-trash bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-warning\">\n" + 
		"															<i class=\"icon-flag bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"													</div>\n" + 
		"\n" + 
		"													<div class=\"hidden-desktop visible-phone\">\n" + 
		"														<div class=\"inline position-relative\">\n" + 
		"															<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		"																<i class=\"icon-cog icon-only bigger-110\"></i>\n" + 
		"															</button>\n" + 
		"\n" + 
		"															<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		"																		<span class=\"blue\">\n" + 
		"																			<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		"																		<span class=\"green\">\n" + 
		"																			<i class=\"icon-edit bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		"																		<span class=\"red\">\n" + 
		"																			<i class=\"icon-trash bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"															</ul>\n" + 
		"														</div>\n" + 
		"													</div>\n" + 
		"												</td>\n" + 
		"											</tr>\n" + 
		"\n" + 
		"											<tr>\n" + 
		"												<td class=\"center\">\n" + 
		"   4 "+
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<a href=\"#\">best.com</a>\n" + 
		"												</td>\n" + 
		"												<td>$75</td>\n" + 
		"												<td class=\"hidden-480\">6,500</td>\n" + 
		"												<td class=\"hidden-phone\">Apr 03</td>\n" + 
		"\n" + 
		"												<td class=\"hidden-480\">\n" + 
		"													<span class=\"label label-inverse arrowed-in\">Flagged</span>\n" + 
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<div class=\"hidden-phone visible-desktop btn-group\">\n" + 
		"														<button class=\"btn btn-mini btn-success\">\n" + 
		"															<i class=\"icon-ok bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-info\">\n" + 
		"															<i class=\"icon-edit bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-danger\">\n" + 
		"															<i class=\"icon-trash bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-warning\">\n" + 
		"															<i class=\"icon-flag bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"													</div>\n" + 
		"\n" + 
		"													<div class=\"hidden-desktop visible-phone\">\n" + 
		"														<div class=\"inline position-relative\">\n" + 
		"															<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		"																<i class=\"icon-cog icon-only bigger-110\"></i>\n" + 
		"															</button>\n" + 
		"\n" + 
		"															<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		"																		<span class=\"blue\">\n" + 
		"																			<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		"																		<span class=\"green\">\n" + 
		"																			<i class=\"icon-edit bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		"																		<span class=\"red\">\n" + 
		"																			<i class=\"icon-trash bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"															</ul>\n" + 
		"														</div>\n" + 
		"													</div>\n" + 
		"												</td>\n" + 
		"											</tr>\n" + 
		"\n" + 
		"											<tr>\n" + 
		"												<td class=\"center\">\n" + 
		"5 "+
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<a href=\"#\">pro.com</a>\n" + 
		"												</td>\n" + 
		"												<td>$55</td>\n" + 
		"												<td class=\"hidden-480\">4,250</td>\n" + 
		"												<td class=\"hidden-phone\">Jan 21</td>\n" + 
		"\n" + 
		"												<td class=\"hidden-480\">\n" + 
		"													<span class=\"label label-success\">Registered</span>\n" + 
		"												</td>\n" + 
		"\n" + 
		"												<td>\n" + 
		"													<div class=\"hidden-phone visible-desktop btn-group\">\n" + 
		"														<button class=\"btn btn-mini btn-success\">\n" + 
		"															<i class=\"icon-ok bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-info\">\n" + 
		"															<i class=\"icon-edit bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-danger\">\n" + 
		"															<i class=\"icon-trash bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"\n" + 
		"														<button class=\"btn btn-mini btn-warning\">\n" + 
		"															<i class=\"icon-flag bigger-120\"></i>\n" + 
		"														</button>\n" + 
		"													</div>\n" + 
		"\n" + 
		"													<div class=\"hidden-desktop visible-phone\">\n" + 
		"														<div class=\"inline position-relative\">\n" + 
		"															<button class=\"btn btn-minier btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		"																<i class=\"icon-cog icon-only bigger-110\"></i>\n" + 
		"															</button>\n" + 
		"\n" + 
		"															<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		"																		<span class=\"blue\">\n" + 
		"																			<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		"																		<span class=\"green\">\n" + 
		"																			<i class=\"icon-edit bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"\n" + 
		"																<li>\n" + 
		"																	<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		"																		<span class=\"red\">\n" + 
		"																			<i class=\"icon-trash bigger-120\"></i>\n" + 
		"																		</span>\n" + 
		"																	</a>\n" + 
		"																</li>\n" + 
		"															</ul>\n" + 
		"														</div>\n" + 
		"													</div>\n" + 
		"												</td>\n" + 
		"											</tr>\n" + 
		"										</tbody>\n" + 
		"									</table>\n" + 
		"								</div><!--/span-->\n" + 
		"							</div><!--/row-->\n" + 
		""); 

out.println("" +
		 		
		 		"									\n" + 
		 		"\n" + 
		 		"									\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<hr />\n" + 
		 		"								\n" + 
		 		"\n" + 
		 		"							\n" + 
		 		"\n" + 
		 		"							\n" + 
		 		"							<div class=\"hr hr-18 dotted hr-double\"></div>\n" + 
		 		"							<h4 class=\"header green\">Update Wallet Amount</h4>\n" + 
		 		"\n" + 
		 		"							<div class=\"row-fluid\">\n" + 
		 		"								<div class=\"span5\">\n" + 
		 		"									<div class=\"widget-box\">\n" + 
		 		"										<div class=\"widget-header\">\n" + 
		 		"											<h4>100</h4>\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"widget-body\">\n" + 
		 		"											<div class=\"widget-main no-padding\">\n" + 
		 		"												<form />\n" + 
		 		"													<!--<legend>Form</legend>-->\n" + 
		 		"\n" + 
		 		"													<fieldset>\n" + 
		 		"														<label>Enter Amount</label>\n" + 
		 		"\n" + 
		 		"														<input type=\"Number\" placeholder=\"Type something&hellip;\" />\n" + 
		 		"														<span class=\"help-block\">Update the user wallet amount</span>\n" + 
		 		"\n" + 
		 		"														\n" + 
		 		"													</fieldset>\n" + 
		 		"\n" + 
		 		"													<div class=\"form-actions center\">\n" + 
		 		"														<button onclick=\"return false;\" class=\"btn btn-small btn-success\">\n" + 
		 		"															Submit\n" + 
		 		"															<i class=\"icon-arrow-right icon-on-right bigger-110\"></i>\n" + 
		 		"														</button>\n" + 
		 		"													</div>\n" + 
		 		"												</form>\n" + 
		 		"											</div>\n" + 
		 		"										</div>\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<div class=\"span7\">\n" + 
		 		"									\n" + 
		 		"\n" + 
		 		"									<div class=\"space-6\"></div>\n" + 
		 		"\n" + 
		 		"									\n" + 
		 		"								</div>\n" + 
		 		"							\n" + 
		 		"\n" + 
		 		"							<div id=\"modal-form\" class=\"modal hide\" tabindex=\"-1\">\n" + 
		 		"								<div class=\"modal-header\">\n" + 
		 		"									<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" + 
		 		"									<h4 class=\"blue bigger\">Please fill the following form fields</h4>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<div class=\"modal-body overflow-visible\">\n" + 
		 		"									<div class=\"row-fluid\">\n" + 
		 		"										<div class=\"span5\">\n" + 
		 		"											<div class=\"space\"></div>\n" + 
		 		"\n" + 
		 		"											<input type=\"file\" />\n" + 
		 		"										</div>\n" + 
		 		"\n" + 
		 		"										<div class=\"vspace\"></div>\n" + 
		 		"\n" + 
		 		"										<div class=\"span7\">\n" + 
		 		"											<div class=\"control-group\">\n" + 
		 		"												<label for=\"form-field-select-3\">Location</label>\n" + 
		 		"\n" + 
		 		"												<div class=\"controls\">\n" + 
		 		"													<select class=\"chzn-select\" data-placeholder=\"Choose a Country...\">\n" + 
		 		"														<option value=\"\" />\n" + 
		 		"														<option value=\"AL\" />Alabama\n" + 
		 		"														<option value=\"AK\" />Alaska\n" + 
		 		"														<option value=\"AZ\" />Arizona\n" + 
		 		"														<option value=\"AR\" />Arkansas\n" + 
		 		"														<option value=\"CA\" />California\n" + 
		 		"														<option value=\"CO\" />Colorado\n" + 
		 		"														<option value=\"CT\" />Connecticut\n" + 
		 		"														<option value=\"DE\" />Delaware\n" + 
		 		"														<option value=\"FL\" />Florida\n" + 
		 		"														<option value=\"GA\" />Georgia\n" + 
		 		"														<option value=\"HI\" />Hawaii\n" + 
		 		"														<option value=\"ID\" />Idaho\n" + 
		 		"														<option value=\"IL\" />Illinois\n" + 
		 		"														<option value=\"IN\" />Indiana\n" + 
		 		"														<option value=\"IA\" />Iowa\n" + 
		 		"														<option value=\"KS\" />Kansas\n" + 
		 		"														<option value=\"KY\" />Kentucky\n" + 
		 		"														<option value=\"LA\" />Louisiana\n" + 
		 		"														<option value=\"ME\" />Maine\n" + 
		 		"														<option value=\"MD\" />Maryland\n" + 
		 		"														<option value=\"MA\" />Massachusetts\n" + 
		 		"														<option value=\"MI\" />Michigan\n" + 
		 		"														<option value=\"MN\" />Minnesota\n" + 
		 		"														<option value=\"MS\" />Mississippi\n" + 
		 		"														<option value=\"MO\" />Missouri\n" + 
		 		"														<option value=\"MT\" />Montana\n" + 
		 		"														<option value=\"NE\" />Nebraska\n" + 
		 		"														<option value=\"NV\" />Nevada\n" + 
		 		"														<option value=\"NH\" />New Hampshire\n" + 
		 		"														<option value=\"NJ\" />New Jersey\n" + 
		 		"														<option value=\"NM\" />New Mexico\n" + 
		 		"														<option value=\"NY\" />New York\n" + 
		 		"														<option value=\"NC\" />North Carolina\n" + 
		 		"														<option value=\"ND\" />North Dakota\n" + 
		 		"														<option value=\"OH\" />Ohio\n" + 
		 		"														<option value=\"OK\" />Oklahoma\n" + 
		 		"														<option value=\"OR\" />Oregon\n" + 
		 		"														<option value=\"PA\" />Pennsylvania\n" + 
		 		"														<option value=\"RI\" />Rhode Island\n" + 
		 		"														<option value=\"SC\" />South Carolina\n" + 
		 		"														<option value=\"SD\" />South Dakota\n" + 
		 		"														<option value=\"TN\" />Tennessee\n" + 
		 		"														<option value=\"TX\" />Texas\n" + 
		 		"														<option value=\"UT\" />Utah\n" + 
		 		"														<option value=\"VT\" />Vermont\n" + 
		 		"														<option value=\"VA\" />Virginia\n" + 
		 		"														<option value=\"WA\" />Washington\n" + 
		 		"														<option value=\"WV\" />West Virginia\n" + 
		 		"														<option value=\"WI\" />Wisconsin\n" + 
		 		"														<option value=\"WY\" />Wyoming\n" + 
		 		"													</select>\n" + 
		 		"												</div>\n" + 
		 		"											</div>\n" + 
		 		"\n" + 
		 		"											<div class=\"control-group\">\n" + 
		 		"												<label class=\"control-label\" for=\"form-field-username\">Username</label>\n" + 
		 		"\n" + 
		 		"												<div class=\"controls\">\n" + 
		 		"													<input type=\"text\" id=\"form-field-username\" placeholder=\"Username\" value=\"alexdoe\" />\n" + 
		 		"												</div>\n" + 
		 		"											</div>\n" + 
		 		"\n" + 
		 		"											<div class=\"control-group\">\n" + 
		 		"												<label class=\"control-label\" for=\"form-field-first\">Name</label>\n" + 
		 		"\n" + 
		 		"												<div class=\"controls\">\n" + 
		 		"													<input class=\"input-small\" type=\"text\" id=\"form-field-first\" placeholder=\"First Name\" value=\"Alex\" />\n" + 
		 		"													<input class=\"input-small\" type=\"text\" id=\"form-field-last\" placeholder=\"Last Name\" value=\"Doe\" />\n" + 
		 		"												</div>\n" + 
		 		"											</div>\n" + 
		 		"										</div>\n" + 
		 		"									</div>\n" + 
		 		"								</div>\n" + 
		 		"\n" + 
		 		"								<div class=\"modal-footer\">\n" + 
		 		"									<button class=\"btn btn-small\" data-dismiss=\"modal\">\n" + 
		 		"										<i class=\"icon-remove\"></i>\n" + 
		 		"										Cancel\n" + 
		 		"									</button>\n" + 
		 		"\n" + 
		 		"									<button class=\"btn btn-small btn-primary\">\n" + 
		 		"										<i class=\"icon-ok\"></i>\n" + 
		 		"										Save\n" + 
		 		"									</button>\n" + 
		 		"								</div>\n" + 
		 		"							</div><!--PAGE CONTENT ENDS-->\n" + 
		 		"						</div><!--/.span-->\n" + 
		 		"					</div><!--/.row-fluid-->\n" + 
		 		"				</div><!--/.page-content-->\n" + 
		 		"\n" + 
		 		"				<div class=\"ace-settings-container\" id=\"ace-settings-container\">\n" + 
		 		"					<div class=\"btn btn-app btn-mini btn-warning ace-settings-btn\" id=\"ace-settings-btn\">\n" + 
		 		"						<i class=\"icon-cog bigger-150\"></i>\n" + 
		 		"					</div>\n" + 
		 		"\n" + 
		 		"					<div class=\"ace-settings-box\" id=\"ace-settings-box\">\n" + 
		 		"						<div>\n" + 
		 		"							<div class=\"pull-left\">\n" + 
		 		"								<select id=\"skin-colorpicker\" class=\"hide\">\n" + 
		 		"									<option data-class=\"default\" value=\"#438EB9\" />#438EB9\n" + 
		 		"									<option data-class=\"skin-1\" value=\"#222A2D\" />#222A2D\n" + 
		 		"									<option data-class=\"skin-2\" value=\"#C6487E\" />#C6487E\n" + 
		 		"									<option data-class=\"skin-3\" value=\"#D0D0D0\" />#D0D0D0\n" + 
		 		"								</select>\n" + 
		 		"							</div>\n" + 
		 		"							<span>&nbsp; Choose Skin</span>\n" + 
		 		"						</div>\n" + 
		 		"\n" + 
		 		"						<div>\n" + 
		 		"							<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-header\" />\n" + 
		 		"							<label class=\"lbl\" for=\"ace-settings-header\"> Fixed Header</label>\n" + 
		 		"						</div>\n" + 
		 		"\n" + 
		 		"						<div>\n" + 
		 		"							<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-sidebar\" />\n" + 
		 		"							<label class=\"lbl\" for=\"ace-settings-sidebar\"> Fixed Sidebar</label>\n" + 
		 		"						</div>\n" + 
		 		"\n" + 
		 		"						<div>\n" + 
		 		"							<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-breadcrumbs\" />\n" + 
		 		"							<label class=\"lbl\" for=\"ace-settings-breadcrumbs\"> Fixed Breadcrumbs</label>\n" + 
		 		"						</div>\n" + 
		 		"\n" + 
		 		"						<div>\n" + 
		 		"							<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-rtl\" />\n" + 
		 		"							<label class=\"lbl\" for=\"ace-settings-rtl\"> Right To Left (rtl)</label>\n" + 
		 		"						</div>\n" + 
		 		"					</div>\n" + 
		 		"				</div><!--/#ace-settings-container-->\n" + 
		 		"			</div><!--/.main-content-->\n" + 
		 		"		</div><!--/.main-container-->\n" + 
		 		"\n" + 
		 		"		<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-small btn-inverse\">\n" + 
		 		"			<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\n" + 
		 		"		</a>\n" + 
		 		"\n" + 
		 		"		<!--basic scripts-->\n" + 
		 		"\n" + 
		 		"		<!--[if !IE]>-->\n" + 
		 		"\n" + 
		 		"		<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n" + 
		 		"\n" + 
		 		"		<!--<![endif]-->\n" + 
		 		"\n" + 
		 		"		<!--[if IE]>\n" + 
		 		"<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n" + 
		 		"<![endif]-->\n" + 
		 		"\n" + 
		 		"		<!--[if !IE]>-->\n" + 
		 		"\n" + 
		 		"		<script type=\"text/javascript\">\n" + 
		 		"			window.jQuery || document.write(\"<script src='assets/js/jquery-2.0.3.min.js'>\"+\"<\"+\"/script>\");\n" + 
		 		"		</script>\n" + 
		 		"\n" + 
		 		"		<!--<![endif]-->\n" + 
		 		"\n" + 
		 		"		<!--[if IE]>\n" + 
		 		"<script type=\"text/javascript\">\n" + 
		 		" window.jQuery || document.write(\"<script src='assets/js/jquery-1.10.2.min.js'>\"+\"<\"+\"/script>\");\n" + 
		 		"</script>\n" + 
		 		"<![endif]-->\n" + 
		 		"\n" + 
		 		"		<script type=\"text/javascript\">\n" + 
		 		"			if(\"ontouchend\" in document) document.write(\"<script src='assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n" + 
		 		"		</script>\n" + 
		 		"		<script src=\"assets/js/bootstrap.min.js\"></script>\n" + 
		 		"\n" + 
		 		"		<!--page specific plugin scripts-->\n" + 
		 		"\n" + 
		 		"		<!--[if lte IE 8]>\n" + 
		 		"		  <script src=\"assets/js/excanvas.min.js\"></script>\n" + 
		 		"		<![endif]-->\n" + 
		 		"\n" + 
		 		"		<script src=\"assets/js/jquery-ui-1.10.3.custom.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/jquery.ui.touch-punch.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/chosen.jquery.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/fuelux/fuelux.spinner.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/date-time/bootstrap-datepicker.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/date-time/bootstrap-timepicker.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/date-time/moment.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/date-time/daterangepicker.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/bootstrap-colorpicker.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/jquery.knob.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/jquery.autosize-min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/jquery.inputlimiter.1.3.1.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/jquery.maskedinput.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/bootstrap-tag.min.js\"></script>\n" + 
		 		"\n" + 
		 		"		<!--ace scripts-->\n" + 
		 		"\n" + 
		 		"		<script src=\"assets/js/ace-elements.min.js\"></script>\n" + 
		 		"		<script src=\"assets/js/ace.min.js\"></script>\n" + 
		 		"\n" + 
		 		"		<!--inline scripts related to this page-->\n" + 
		 		"\n" + 
		 		"		<script type=\"text/javascript\">\n" + 
		 		"			$(function() {\n" + 
		 		"				$('#id-disable-check').on('click', function() {\n" + 
		 		"					var inp = $('#form-input-readonly').get(0);\n" + 
		 		"					if(inp.hasAttribute('disabled')) {\n" + 
		 		"						inp.setAttribute('readonly' , 'true');\n" + 
		 		"						inp.removeAttribute('disabled');\n" + 
		 		"						inp.value=\"This text field is readonly!\";\n" + 
		 		"					}\n" + 
		 		"					else {\n" + 
		 		"						inp.setAttribute('disabled' , 'disabled');\n" + 
		 		"						inp.removeAttribute('readonly');\n" + 
		 		"						inp.value=\"This text field is disabled!\";\n" + 
		 		"					}\n" + 
		 		"				});\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"				$(\".chzn-select\").chosen(); \n" + 
		 		"				\n" + 
		 		"				$('[data-rel=tooltip]').tooltip({container:'body'});\n" + 
		 		"				$('[data-rel=popover]').popover({container:'body'});\n" + 
		 		"				\n" + 
		 		"				$('textarea[class*=autosize]').autosize({append: \"\\n\"});\n" + 
		 		"				$('textarea[class*=limited]').each(function() {\n" + 
		 		"					var limit = parseInt($(this).attr('data-maxlength')) || 100;\n" + 
		 		"					$(this).inputlimiter({\n" + 
		 		"						\"limit\": limit,\n" + 
		 		"						remText: '%n character%s remaining...',\n" + 
		 		"						limitText: 'max allowed : %n.'\n" + 
		 		"					});\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				$.mask.definitions['~']='[+-]';\n" + 
		 		"				$('.input-mask-date').mask('99/99/9999');\n" + 
		 		"				$('.input-mask-phone').mask('(999) 999-9999');\n" + 
		 		"				$('.input-mask-eyescript').mask('~9.99 ~9.99 999');\n" + 
		 		"				$(\".input-mask-product\").mask(\"a*-999-a999\",{placeholder:\" \",completed:function(){alert(\"You typed the following: \"+this.val());}});\n" + 
		 		"				\n" + 
		 		"				\n" + 
		 		"				\n" + 
		 		"				$( \"#input-size-slider\" ).css('width','200px').slider({\n" + 
		 		"					value:1,\n" + 
		 		"					range: \"min\",\n" + 
		 		"					min: 1,\n" + 
		 		"					max: 6,\n" + 
		 		"					step: 1,\n" + 
		 		"					slide: function( event, ui ) {\n" + 
		 		"						var sizing = ['', 'input-mini', 'input-small', 'input-medium', 'input-large', 'input-xlarge', 'input-xxlarge'];\n" + 
		 		"						var val = parseInt(ui.value);\n" + 
		 		"						$('#form-field-4').attr('class', sizing[val]).val('.'+sizing[val]);\n" + 
		 		"					}\n" + 
		 		"				});\n" + 
		 		"			\n" + 
		 		"				$( \"#input-span-slider\" ).slider({\n" + 
		 		"					value:1,\n" + 
		 		"					range: \"min\",\n" + 
		 		"					min: 1,\n" + 
		 		"					max: 11,\n" + 
		 		"					step: 1,\n" + 
		 		"					slide: function( event, ui ) {\n" + 
		 		"						var val = parseInt(ui.value);\n" + 
		 		"						$('#form-field-5').attr('class', 'span'+val).val('.span'+val).next().attr('class', 'span'+(12-val)).val('.span'+(12-val));\n" + 
		 		"					}\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				\n" + 
		 		"				$( \"#slider-range\" ).css('height','200px').slider({\n" + 
		 		"					orientation: \"vertical\",\n" + 
		 		"					range: true,\n" + 
		 		"					min: 0,\n" + 
		 		"					max: 100,\n" + 
		 		"					values: [ 17, 67 ],\n" + 
		 		"					slide: function( event, ui ) {\n" + 
		 		"						var val = ui.values[$(ui.handle).index()-1]+\"\";\n" + 
		 		"			\n" + 
		 		"						if(! ui.handle.firstChild ) {\n" + 
		 		"							$(ui.handle).append(\"<div class='tooltip right in' style='display:none;left:15px;top:-8px;'><div class='tooltip-arrow'></div><div class='tooltip-inner'></div></div>\");\n" + 
		 		"						}\n" + 
		 		"						$(ui.handle.firstChild).show().children().eq(1).text(val);\n" + 
		 		"					}\n" + 
		 		"				}).find('a').on('blur', function(){\n" + 
		 		"					$(this.firstChild).hide();\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				$( \"#slider-range-max\" ).slider({\n" + 
		 		"					range: \"max\",\n" + 
		 		"					min: 1,\n" + 
		 		"					max: 10,\n" + 
		 		"					value: 2\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				$( \"#eq > span\" ).css({width:'90%', 'float':'left', margin:'15px'}).each(function() {\n" + 
		 		"					// read initial values from markup and remove that\n" + 
		 		"					var value = parseInt( $( this ).text(), 10 );\n" + 
		 		"					$( this ).empty().slider({\n" + 
		 		"						value: value,\n" + 
		 		"						range: \"min\",\n" + 
		 		"						animate: true\n" + 
		 		"						\n" + 
		 		"					});\n" + 
		 		"				});\n" + 
		 		"			\n" + 
		 		"				\n" + 
		 		"				$('#id-input-file-1 , #id-input-file-2').ace_file_input({\n" + 
		 		"					no_file:'No File ...',\n" + 
		 		"					btn_choose:'Choose',\n" + 
		 		"					btn_change:'Change',\n" + 
		 		"					droppable:false,\n" + 
		 		"					onchange:null,\n" + 
		 		"					thumbnail:false //| true | large\n" + 
		 		"					//whitelist:'gif|png|jpg|jpeg'\n" + 
		 		"					//blacklist:'exe|php'\n" + 
		 		"					//onchange:''\n" + 
		 		"					//\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				$('#id-input-file-3').ace_file_input({\n" + 
		 		"					style:'well',\n" + 
		 		"					btn_choose:'Drop files here or click to choose',\n" + 
		 		"					btn_change:null,\n" + 
		 		"					no_icon:'icon-cloud-upload',\n" + 
		 		"					droppable:true,\n" + 
		 		"					thumbnail:'small'\n" + 
		 		"					//,icon_remove:null//set null, to hide remove/reset button\n" + 
		 		"					/**,before_change:function(files, dropped) {\n" + 
		 		"						//Check an example below\n" + 
		 		"						//or examples/file-upload.html\n" + 
		 		"						return true;\n" + 
		 		"					}*/\n" + 
		 		"					/**,before_remove : function() {\n" + 
		 		"						return true;\n" + 
		 		"					}*/\n" + 
		 		"					,\n" + 
		 		"					preview_error : function(filename, error_code) {\n" + 
		 		"						//name of the file that failed\n" + 
		 		"						//error_code values\n" + 
		 		"						//1 = 'FILE_LOAD_FAILED',\n" + 
		 		"						//2 = 'IMAGE_LOAD_FAILED',\n" + 
		 		"						//3 = 'THUMBNAIL_FAILED'\n" + 
		 		"						//alert(error_code);\n" + 
		 		"					}\n" + 
		 		"			\n" + 
		 		"				}).on('change', function(){\n" + 
		 		"					//console.log($(this).data('ace_input_files'));\n" + 
		 		"					//console.log($(this).data('ace_input_method'));\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"			\n" + 
		 		"				//dynamically change allowed formats by changing before_change callback function\n" + 
		 		"				$('#id-file-format').removeAttr('checked').on('change', function() {\n" + 
		 		"					var before_change\n" + 
		 		"					var btn_choose\n" + 
		 		"					var no_icon\n" + 
		 		"					if(this.checked) {\n" + 
		 		"						btn_choose = \"Drop images here or click to choose\";\n" + 
		 		"						no_icon = \"icon-picture\";\n" + 
		 		"						before_change = function(files, dropped) {\n" + 
		 		"							var allowed_files = [];\n" + 
		 		"							for(var i = 0 ; i < files.length; i++) {\n" + 
		 		"								var file = files[i];\n" + 
		 		"								if(typeof file === \"string\") {\n" + 
		 		"									//IE8 and browsers that don't support File Object\n" + 
		 		"									if(! (/\\.(jpe?g|png|gif|bmp)$/i).test(file) ) return false;\n" + 
		 		"								}\n" + 
		 		"								else {\n" + 
		 		"									var type = $.trim(file.type);\n" + 
		 		"									if( ( type.length > 0 && ! (/^image\\/(jpe?g|png|gif|bmp)$/i).test(type) )\n" + 
		 		"											|| ( type.length == 0 && ! (/\\.(jpe?g|png|gif|bmp)$/i).test(file.name) )//for android's default browser which gives an empty string for file.type\n" + 
		 		"										) continue;//not an image so don't keep this file\n" + 
		 		"								}\n" + 
		 		"								\n" + 
		 		"								allowed_files.push(file);\n" + 
		 		"							}\n" + 
		 		"							if(allowed_files.length == 0) return false;\n" + 
		 		"			\n" + 
		 		"							return allowed_files;\n" + 
		 		"						}\n" + 
		 		"					}\n" + 
		 		"					else {\n" + 
		 		"						btn_choose = \"Drop files here or click to choose\";\n" + 
		 		"						no_icon = \"icon-cloud-upload\";\n" + 
		 		"						before_change = function(files, dropped) {\n" + 
		 		"							return files;\n" + 
		 		"						}\n" + 
		 		"					}\n" + 
		 		"					var file_input = $('#id-input-file-3');\n" + 
		 		"					file_input.ace_file_input('update_settings', {'before_change':before_change, 'btn_choose': btn_choose, 'no_icon':no_icon})\n" + 
		 		"					file_input.ace_file_input('reset_input');\n" + 
		 		"				});\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"				$('#spinner1').ace_spinner({value:0,min:0,max:200,step:10, btn_up_class:'btn-info' , btn_down_class:'btn-info'})\n" + 
		 		"				.on('change', function(){\n" + 
		 		"					//alert(this.value)\n" + 
		 		"				});\n" + 
		 		"				$('#spinner2').ace_spinner({value:0,min:0,max:10000,step:100, icon_up:'icon-caret-up', icon_down:'icon-caret-down'});\n" + 
		 		"				$('#spinner3').ace_spinner({value:0,min:-100,max:100,step:10, icon_up:'icon-plus', icon_down:'icon-minus', btn_up_class:'btn-success' , btn_down_class:'btn-danger'});\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"				\n" + 
		 		"				$('.date-picker').datepicker().next().on(ace.click_event, function(){\n" + 
		 		"					$(this).prev().focus();\n" + 
		 		"				});\n" + 
		 		"				$('#id-date-range-picker-1').daterangepicker().prev().on(ace.click_event, function(){\n" + 
		 		"					$(this).next().focus();\n" + 
		 		"				});\n" + 
		 		"				\n" + 
		 		"				$('#timepicker1').timepicker({\n" + 
		 		"					minuteStep: 1,\n" + 
		 		"					showSeconds: true,\n" + 
		 		"					showMeridian: false\n" + 
		 		"				})\n" + 
		 		"				\n" + 
		 		"				$('#colorpicker1').colorpicker();\n" + 
		 		"				$('#simple-colorpicker-1').ace_colorpicker();\n" + 
		 		"			\n" + 
		 		"				\n" + 
		 		"				$(\".knob\").knob();\n" + 
		 		"				\n" + 
		 		"				\n" + 
		 		"				//we could just set the data-provide=\"tag\" of the element inside HTML, but IE8 fails!\n" + 
		 		"				var tag_input = $('#form-field-tags');\n" + 
		 		"				if(! ( /msie\\s*(8|7|6)/.test(navigator.userAgent.toLowerCase())) ) \n" + 
		 		"					tag_input.tag({placeholder:tag_input.attr('placeholder')});\n" + 
		 		"				else {\n" + 
		 		"					//display a textarea for old IE, because it doesn't support this plugin or another one I tried!\n" + 
		 		"					tag_input.after('<textarea id=\"'+tag_input.attr('id')+'\" name=\"'+tag_input.attr('name')+'\" rows=\"3\">'+tag_input.val()+'</textarea>').remove();\n" + 
		 		"					//$('#form-field-tags').autosize({append: \"\\n\"});\n" + 
		 		"				}\n" + 
		 		"			\n" + 
		 		"			\n" + 
		 		"				/////////\n" + 
		 		"				$('#modal-form input[type=file]').ace_file_input({\n" + 
		 		"					style:'well',\n" + 
		 		"					btn_choose:'Drop files here or click to choose',\n" + 
		 		"					btn_change:null,\n" + 
		 		"					no_icon:'icon-cloud-upload',\n" + 
		 		"					droppable:true,\n" + 
		 		"					thumbnail:'large'\n" + 
		 		"				})\n" + 
		 		"				\n" + 
		 		"				//chosen plugin inside a modal will have a zero width because the select element is originally hidden\n" + 
		 		"				//and its width cannot be determined.\n" + 
		 		"				//so we set the width after modal is show\n" + 
		 		"				$('#modal-form').on('show', function () {\n" + 
		 		"					$(this).find('.chzn-container').each(function(){\n" + 
		 		"						$(this).find('a:first-child').css('width' , '200px');\n" + 
		 		"						$(this).find('.chzn-drop').css('width' , '210px');\n" + 
		 		"						$(this).find('.chzn-search input').css('width' , '200px');\n" + 
		 		"					});\n" + 
		 		"				})\n" + 
		 		"				/**\n" + 
		 		"				//or you can activate the chosen plugin after modal is shown\n" + 
		 		"				//this way select element has a width now and chosen works as expected\n" + 
		 		"				$('#modal-form').on('shown', function () {\n" + 
		 		"					$(this).find('.modal-chosen').chosen();\n" + 
		 		"				})\n" + 
		 		"				*/\n" + 
		 		"			\n" + 
		 		"			});\n" + 
		 		"		</script>\n" + 
		 		"	</body>\n" + 
		 		"</html>\n" + 
		 		"");
	        
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
