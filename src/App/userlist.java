package App;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userlist
 */
@WebServlet("/userlist")
public class userlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		/**
		 * html code goes here
		 *  **/
		
		
		 
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();
		
		
		
		 out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" + 
				"			<html lang=\"en\">\n" + 
				"				<head>\n" + 
				"					<meta charset=\"utf-8\" />\n" + 
				"					<title>Admin</title>\n" + 
				"\n" + 
				"					<meta name=\"description\" content=\"Static &amp; Dynamic Tables\" />\n" + 
				"					<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" + 
				"\n" + 
				"					<!--basic styles-->\n" + 
				"\n" + 
				"					<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n" + 
				"					<link href=\"assets/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\n" + 
				"					<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" />\n" + 
				"\n" + 
				"					<!--[if IE 7]>\n" + 
				"					  <link rel=\"stylesheet\" href=\"assets/css/font-awesome-ie7.min.css\" />\n" + 
				"					<![endif]-->\n" + 
				"\n" + 
				"					<!--page specific plugin styles-->\n" + 
				"\n" + 
				"					<!--fonts-->\n" + 
				"\n" + 
				"					<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300\" />\n" + 
				"\n" + 
				"					<!--ace styles-->\n" + 
				"\n" + 
				"					<link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" />\n" + 
				"					<link rel=\"stylesheet\" href=\"assets/css/ace-responsive.min.css\" />\n" + 
				"					<link rel=\"stylesheet\" href=\"assets/css/ace-skins.min.css\" />\n" + 
				"\n" + 
				"					<!--[if lte IE 8]>\n" + 
				"					  <link rel=\"stylesheet\" href=\"assets/css/ace-ie.min.css\" />\n" + 
				"					<![endif]-->\n" + 
				"\n" + 
				"					<!--inline styles related to this page-->\n" + 
				"				<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /></head>\n" + 
				"\n" + 
				"				<body>\n" + 
				"					<div class=\"navbar\">\n" + 
				"						<div class=\"navbar-inner\">\n" + 
				"							<div class=\"container-fluid\">\n" + 
				"								<a href=\"#\" class=\"brand\">\n" + 
				"									<small>\n" + 
				"										<i class=\"icon-leaf\"></i>\n" + 
				"										Super Admin\n" + 
				"									</small>\n" + 
				"								</a><!--/.brand-->\n" + 
				"\n" + 
				"								<ul class=\"nav ace-nav pull-right\">\n" + 
				"									<li class=\"grey\">\n" + 
				"										<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
				"											<i class=\"icon-tasks\"></i>\n" + 
				"											<span class=\"badge badge-grey\">4</span>\n" + 
				"										</a>\n" + 
				"\n" + 
				"										<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n" + 
				"											<li class=\"nav-header\">\n" + 
				"												<i class=\"icon-ok\"></i>\n" + 
				"												4 Tasks to complete\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">Software Update</span>\n" + 
				"														<span class=\"pull-right\">65%</span>\n" + 
				"													</div>\n" + 
				"\n" + 
				"													<div class=\"progress progress-mini \">\n" + 
				"														<div style=\"width:65%\" class=\"bar\"></div>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">Hardware Upgrade</span>\n" + 
				"														<span class=\"pull-right\">35%</span>\n" + 
				"													</div>\n" + 
				"\n" + 
				"													<div class=\"progress progress-mini progress-danger\">\n" + 
				"														<div style=\"width:35%\" class=\"bar\"></div>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">Unit Testing</span>\n" + 
				"														<span class=\"pull-right\">15%</span>\n" + 
				"													</div>\n" + 
				"\n" + 
				"													<div class=\"progress progress-mini progress-warning\">\n" + 
				"														<div style=\"width:15%\" class=\"bar\"></div>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">Bug Fixes</span>\n" + 
				"														<span class=\"pull-right\">90%</span>\n" + 
				"													</div>\n" + 
				"\n" + 
				"													<div class=\"progress progress-mini progress-success progress-striped active\">\n" + 
				"														<div style=\"width:90%\" class=\"bar\"></div>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													See tasks with details\n" + 
				"													<i class=\"icon-arrow-right\"></i>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"										</ul>\n" + 
				"									</li>\n" + 
				"\n" + 
				"									<li class=\"purple\">\n" + 
				"										<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
				"											<i class=\"icon-bell-alt icon-animated-bell\"></i>\n" + 
				"											<span class=\"badge badge-important\">8</span>\n" + 
				"										</a>\n" + 
				"\n" + 
				"										<ul class=\"pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-closer\">\n" + 
				"											<li class=\"nav-header\">\n" + 
				"												<i class=\"icon-warning-sign\"></i>\n" + 
				"												8 Notifications\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">\n" + 
				"															<i class=\"btn btn-mini no-hover btn-pink icon-comment\"></i>\n" + 
				"															New Comments\n" + 
				"														</span>\n" + 
				"														<span class=\"pull-right badge badge-info\">+12</span>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<i class=\"btn btn-mini btn-primary icon-user\"></i>\n" + 
				"													Bob just signed up as an editor ...\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">\n" + 
				"															<i class=\"btn btn-mini no-hover btn-success icon-shopping-cart\"></i>\n" + 
				"															New Orders\n" + 
				"														</span>\n" + 
				"														<span class=\"pull-right badge badge-success\">+8</span>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<div class=\"clearfix\">\n" + 
				"														<span class=\"pull-left\">\n" + 
				"															<i class=\"btn btn-mini no-hover btn-info icon-twitter\"></i>\n" + 
				"															Followers\n" + 
				"														</span>\n" + 
				"														<span class=\"pull-right badge badge-info\">+11</span>\n" + 
				"													</div>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													See all notifications\n" + 
				"													<i class=\"icon-arrow-right\"></i>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"										</ul>\n" + 
				"									</li>\n" + 
				"\n" + 
				"									<li class=\"green\">\n" + 
				"										<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n" + 
				"											<i class=\"icon-envelope icon-animated-vertical\"></i>\n" + 
				"											<span class=\"badge badge-success\">5</span>\n" + 
				"										</a>\n" + 
				"\n" + 
				"										<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n" + 
				"											<li class=\"nav-header\">\n" + 
				"												<i class=\"icon-envelope-alt\"></i>\n" + 
				"												5 Messages\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<img src=\"assets/avatars/avatar.png\" class=\"msg-photo\" alt=\"Alex's Avatar\" />\n" + 
				"													<span class=\"msg-body\">\n" + 
				"														<span class=\"msg-title\">\n" + 
				"															<span class=\"blue\">Alex:</span>\n" + 
				"															Ciao sociis natoque penatibus et auctor ...\n" + 
				"														</span>\n" + 
				"\n" + 
				"														<span class=\"msg-time\">\n" + 
				"															<i class=\"icon-time\"></i>\n" + 
				"															<span>a moment ago</span>\n" + 
				"														</span>\n" + 
				"													</span>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<img src=\"assets/avatars/avatar3.png\" class=\"msg-photo\" alt=\"Susan's Avatar\" />\n" + 
				"													<span class=\"msg-body\">\n" + 
				"														<span class=\"msg-title\">\n" + 
				"															<span class=\"blue\">Susan:</span>\n" + 
				"															Vestibulum id ligula porta felis euismod ...\n" + 
				"														</span>\n" + 
				"\n" + 
				"														<span class=\"msg-time\">\n" + 
				"															<i class=\"icon-time\"></i>\n" + 
				"															<span>20 minutes ago</span>\n" + 
				"														</span>\n" + 
				"													</span>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<img src=\"assets/avatars/avatar4.png\" class=\"msg-photo\" alt=\"Bob's Avatar\" />\n" + 
				"													<span class=\"msg-body\">\n" + 
				"														<span class=\"msg-title\">\n" + 
				"															<span class=\"blue\">Bob:</span>\n" + 
				"															Nullam quis risus eget urna mollis ornare ...\n" + 
				"														</span>\n" + 
				"\n" + 
				"														<span class=\"msg-time\">\n" + 
				"															<i class=\"icon-time\"></i>\n" + 
				"															<span>3:15 pm</span>\n" + 
				"														</span>\n" + 
				"													</span>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													See all messages\n" + 
				"													<i class=\"icon-arrow-right\"></i>\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"										</ul>\n" + 
				"									</li>\n" + 
				"\n" + 
				"									<li class=\"light-blue\">\n" + 
				"										<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n" + 
				"											<img class=\"nav-user-photo\" src=\"assets/avatars/user.jpg\" alt=\"Jason's Photo\" />\n" + 
				"											<span class=\"user-info\">\n" + 
				"												<small>Welcome,</small>\n" + 
				"												Jason\n" + 
				"											</span>\n" + 
				"\n" + 
				"											<i class=\"icon-caret-down\"></i>\n" + 
				"										</a>\n" + 
				"\n" + 
				"										<ul class=\"user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer\">\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<i class=\"icon-cog\"></i>\n" + 
				"													Settings\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<i class=\"icon-user\"></i>\n" + 
				"													Profile\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"\n" + 
				"											<li class=\"divider\"></li>\n" + 
				"\n" + 
				"											<li>\n" + 
				"												<a href=\"#\">\n" + 
				"													<i class=\"icon-off\"></i>\n" + 
				"													Logout\n" + 
				"												</a>\n" + 
				"											</li>\n" + 
				"										</ul>\n" + 
				"									</li>\n" + 
				"								</ul><!--/.ace-nav-->\n" + 
				"							</div><!--/.container-fluid-->\n" + 
				"						</div><!--/.navbar-inner-->\n" + 
				"					</div>\n" + 
				"\n" + 
				"					<div class=\"main-container container-fluid\">\n" + 
				"						<a class=\"menu-toggler\" id=\"menu-toggler\" href=\"#\">\n" + 
				"							<span class=\"menu-text\"></span>\n" + 
				"						</a>\n" + 
				"\n" + 
				"						<div class=\"sidebar\" id=\"sidebar\">\n" + 
				"							<div class=\"sidebar-shortcuts\" id=\"sidebar-shortcuts\">\n" + 
				"								<div class=\"sidebar-shortcuts-large\" id=\"sidebar-shortcuts-large\">\n" + 
				"									<button class=\"btn btn-small btn-success\">\n" + 
				"										<i class=\"icon-signal\"></i>\n" + 
				"									</button>\n" + 
				"\n" + 
				"									<button class=\"btn btn-small btn-info\">\n" + 
				"										<i class=\"icon-pencil\"></i>\n" + 
				"									</button>\n" + 
				"\n" + 
				"									<button class=\"btn btn-small btn-warning\">\n" + 
				"										<i class=\"icon-group\"></i>\n" + 
				"									</button>\n" + 
				"\n" + 
				"									<button class=\"btn btn-small btn-danger\">\n" + 
				"										<i class=\"icon-cogs\"></i>\n" + 
				"									</button>\n" + 
				"								</div>\n" + 
				"\n" + 
				"								<div class=\"sidebar-shortcuts-mini\" id=\"sidebar-shortcuts-mini\">\n" + 
				"									<span class=\"btn btn-success\"></span>\n" + 
				"\n" + 
				"									<span class=\"btn btn-info\"></span>\n" + 
				"\n" + 
				"									<span class=\"btn btn-warning\"></span>\n" + 
				"\n" + 
				"									<span class=\"btn btn-danger\"></span>\n" + 
				"								</div>\n" + 
				"							</div><!--#sidebar-shortcuts-->\n" + 
				"\n" + 
				"							<ul class=\"nav nav-list\">\n" + 
				"								<li>\n" + 
				"									<a href=\"admin.html\">\n" + 
				"										<i class=\"icon-dashboard\"></i>\n" + 
				"										<span class=\"menu-text\"> Dashboard </span>\n" + 
				"									</a>\n" + 
				"								</li>\n" + 
				"\n" + 
				"								\n" + 
				"\n" + 
				"								<li class=\"active\">\n" + 
				"									<a href=\"users.html\">\n" + 
				"										<i class=\"icon-list\"></i>\n" + 
				"										<span class=\"menu-text\"> USERS </span>\n" + 
				"									</a>\n" + 
				"								</li>\n" + 
				"\n" + 
				"								\n" + 
				"\n" + 
				"							</ul><!--/.nav-list-->\n" + 
				"\n" + 
				"							<div class=\"sidebar-collapse\" id=\"sidebar-collapse\">\n" + 
				"								<i class=\"icon-double-angle-left\"></i>\n" + 
				"							</div>\n" + 
				"						</div>\n" + 
				"\n" + 
				"						<div class=\"main-content\">\n" + 
				"							<div class=\"breadcrumbs\" id=\"breadcrumbs\">\n" + 
				"								<ul class=\"breadcrumb\">\n" + 
				"									<li>\n" + 
				"										<i class=\"icon-home home-icon\"></i>\n" + 
				"										<a href=\"#\">Home</a>\n" + 
				"\n" + 
				"										<span class=\"divider\">\n" + 
				"											<i class=\"icon-angle-right arrow-icon\"></i>\n" + 
				"										</span>\n" + 
				"									</li>\n" + 
				"									<li class=\"active\">Tables</li>\n" + 
				"								</ul><!--.breadcrumb-->\n" + 
				"\n" + 
				"								<div class=\"nav-search\" id=\"nav-search\">\n" + 
				"									<form class=\"form-search\" />\n" + 
				"										<span class=\"input-icon\">\n" + 
				"											<input type=\"text\" placeholder=\"Search ...\" class=\"input-small nav-search-input\" id=\"nav-search-input\" autocomplete=\"off\" />\n" + 
				"											<i class=\"icon-search nav-search-icon\"></i>\n" + 
				"										</span>\n" + 
				"									</form>\n" + 
				"								</div><!--#nav-search-->\n" + 
				"							</div>\n" + 
				"\n" + 
				"							<div class=\"page-content\">\n" + 
				"								<div class=\"page-header position-relative\">\n" + 
				"									<h1>\n" + 
				"										Tables\n" + 
				"										<small>\n" + 
				"											<i class=\"icon-double-angle-right\"></i>\n" + 
				"											Users List\n" + 
				"										</small>\n" + 
				"									</h1>\n" + 
				"								</div><!--/.page-header-->\n" + 
				"\n" + 
				"								<div class=\"row-fluid\">\n" + 
				"									<div class=\"span12\">\n" + 
				"										<!--PAGE CONTENT BEGINS-->\n" + 
				"\n" + 
				"										\n" + 
				"										\n" + 
				"\n" + 
				"										<div class=\"row-fluid\">\n" + 
				"											<h3 class=\"header smaller lighter blue\">Users Table</h3>\n" + 
				"											<div class=\"table-header\">\n" + 
				"												Results for \"Latest Registered users\"\n" + 
				"											</div>\n" + 
				"\n" + 
				"											<table id=\"sample-table-2\" class=\"table table-striped table-bordered table-hover\">\n" + 
				"												<thead>\n" + 
				"													<tr>\n" + 
				"														<th class=\"center\">\n" + 
				"															<label>\n" + 
				"																<input type=\"checkbox\" />\n" + 
				"																<span class=\"lbl\"></span>\n" + 
				"															</label>\n" + 
				"														</th>\n" + 
				"														<th>User Name</th>\n" + 	
				"														<th>User Id</th>\n" + 
				"														<th>NO of Photoes</th>\n" + 
				"														<th>Download Photoes</th>\n" + 
				"														<th>Sold Photos</th>\n" + 
				"														<th>Sale Amount</th>\n" + 
				"														<th class=\"hidden-480\">Visits</th>\n" + 
				"\n" + 
				"														<th class=\"hidden-phone\">\n" + 
				"															<i class=\"icon-time bigger-110 hidden-phone\"></i>\n" + 
				"															Update\n" + 
				"														</th>\n" + 
				"														<th class=\"hidden-480\">Status</th>\n" + 
				"\n" + 
				"														<th></th>\n" + 
				"													</tr>\n" + 
				"												</thead>\n" + 
				"\n" + 
				"												<tbody>\n" + 
				"												\n" + 
				"												\n" + 
				"										\n" + 
				"\n");
		 
		 
		 
		 
		 Connection con=GetCon.getCon();
	    	PreparedStatement ps;
	    	ResultSet rs = null;
	    	
	    		try {
					ps = con.prepareStatement("SELECT username FROM user");
					rs = ps.executeQuery();
					
					while(rs.next())
		    		{
		    			
		    		System.out.println(rs.getString(1));	
		    		String Var=rs.getString(1);
		    		
		    		
		    		 out.println(""
		    			 		+ "												<tr>\n" + 
		    					"														<td class=\"center\">\n" + 
		    					"															<label>\n" + 
		    					"																<input type=\"checkbox\" />\n" + 
		    					"																<span class=\"lbl\"></span>\n" + 
		    					"															</label>\n" + 
		    					"														</td>\n" + 
		    					"\n" + 
		    					"														<td>\n" + 
		    					"															<a href=\"/PhotoApp/userprofile?username=");
		    		 out.println(rs.getString(1));
		    		 out.println("\">");
		    					
		    		 out.println(rs.getString(1));
		    		 out.println("</a>\n" + 
		    					"														</td>\n" + 
		    					"														<td>45</td>\n" + 
		    					"														<td class=\"hidden-480\">33</td>\n" + 
		    					"														<td class=\"hidden-phone\">10</td>\n" + 
		    					"														<td class=\"hidden-phone\">2</td>\n" + 
		    					"														<td class=\"hidden-phone\">22</td>\n" +
		    					"														<td class=\"hidden-phone\">215</td>\n" + 
		    					"\n" + 
		    					"														<td class=\"hidden-480\">\n" + 
		    					"															<span class=\"label label-warning\">Expiring</span>\n" + 
		    					"														</td>\n" + 
		    					"\n" + 
		    					"														<td class=\"td-actions\">\n" + 
		    					"															<div class=\"hidden-phone visible-desktop action-buttons\">\n" + 
		    					"																<a class=\"blue\" href=\"#\">\n" + 
		    					"																	<i class=\"icon-zoom-in bigger-130\"></i>\n" + 
		    					"																</a>\n" + 
		    					"\n" + 
		    					"																<a class=\"green\" href=\"#\">\n" + 
		    					"																	<i class=\"icon-pencil bigger-130\"></i>\n" + 
		    					"																</a>\n" + 
		    					"\n" + 
		    					"																<a class=\"red\" href=\"#\">\n" + 
		    					"																	<i class=\"icon-trash bigger-130\"></i>\n" + 
		    					"																</a>\n" + 
		    					"															</div>\n" + 
		    					"\n" + 
		    					"															<div class=\"hidden-desktop visible-phone\">\n" + 
		    					"																<div class=\"inline position-relative\">\n" + 
		    					"																	<button class=\"btn btn-minier btn-yellow dropdown-toggle\" data-toggle=\"dropdown\">\n" + 
		    					"																		<i class=\"icon-caret-down icon-only bigger-120\"></i>\n" + 
		    					"																	</button>\n" + 
		    					"\n" + 
		    					"																	<ul class=\"dropdown-menu dropdown-icon-only dropdown-yellow pull-right dropdown-caret dropdown-close\">\n" + 
		    					"																		<li>\n" + 
		    					"																			<a href=\"#\" class=\"tooltip-info\" data-rel=\"tooltip\" title=\"View\">\n" + 
		    					"																				<span class=\"blue\">\n" + 
		    					"																					<i class=\"icon-zoom-in bigger-120\"></i>\n" + 
		    					"																				</span>\n" + 
		    					"																			</a>\n" + 
		    					"																		</li>\n" + 
		    					"\n" + 
		    					"																		<li>\n" + 
		    					"																			<a href=\"#\" class=\"tooltip-success\" data-rel=\"tooltip\" title=\"Edit\">\n" + 
		    					"																				<span class=\"green\">\n" + 
		    					"																					<i class=\"icon-edit bigger-120\"></i>\n" + 
		    					"																				</span>\n" + 
		    					"																			</a>\n" + 
		    					"																		</li>\n" + 
		    					"\n" + 
		    					"																		<li>\n" + 
		    					"																			<a href=\"#\" class=\"tooltip-error\" data-rel=\"tooltip\" title=\"Delete\">\n" + 
		    					"																				<span class=\"red\">\n" + 
		    					"																					<i class=\"icon-trash bigger-120\"></i>\n" + 
		    					"																				</span>\n" + 
		    					"																			</a>\n" + 
		    					"																		</li>\n" + 
		    					"																	</ul>\n" + 
		    					"																</div>\n" + 
		    					"															</div>\n" + 
		    					"														</td>\n" + 
		    					"													</tr>\n" );
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    			
		    		}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 out.println("\n" + 
				"													\n" + 
				"													\n" + 
				"												</tbody>\n" + 
				"											</table>\n" + 
				"										</div>\n" + 
				"\n" + 
				"										<div id=\"modal-table\" class=\"modal hide fade\" tabindex=\"-1\">\n" + 
				"											<div class=\"modal-header no-padding\">\n" + 
				"												<div class=\"table-header\">\n" + 
				"													<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" + 
				"													Results for \"Latest Registered Domains\"\n" + 
				"												</div>\n" + 
				"											</div>\n" + 
				"\n" + 
				"											<div class=\"modal-body no-padding\">\n" + 
				"												<div class=\"row-fluid\">\n" + 
				"													<table class=\"table table-striped table-bordered table-hover no-margin-bottom no-border-top\">\n" + 
				"														<thead>\n" + 
				"															<tr>\n" + 
				"																<th>Domain</th>\n" + 
				"																<th>Price</th>\n" + 
				"																<th>Clicks</th>\n" + 
				"\n" + 
				"																<th>\n" + 
				"																	<i class=\"icon-time bigger-110\"></i>\n" + 
				"																	Update\n" + 
				"																</th>\n" + 
				"															</tr>\n" + 
				"														</thead>\n" + 
				"\n" + 
				"														<tbody>\n" + 
				"															<tr>\n" + 
				"																<td>\n" + 
				"																	<a href=\"#\">ace.com</a>\n" + 
				"																</td>\n" + 
				"																<td>$45</td>\n" + 
				"																<td>3,330</td>\n" + 
				"																<td>Feb 12</td>\n" + 
				"															</tr>\n" + 
				"\n" + 
				"															<tr>\n" + 
				"																<td>\n" + 
				"																	<a href=\"#\">base.com</a>\n" + 
				"																</td>\n" + 
				"																<td>$35</td>\n" + 
				"																<td>2,595</td>\n" + 
				"																<td>Feb 18</td>\n" + 
				"															</tr>\n" + 
				"\n" + 
				"															<tr>\n" + 
				"																<td>\n" + 
				"																	<a href=\"#\">max.com</a>\n" + 
				"																</td>\n" + 
				"																<td>$60</td>\n" + 
				"																<td>4,400</td>\n" + 
				"																<td>Mar 11</td>\n" + 
				"															</tr>\n" + 
				"\n" + 
				"															<tr>\n" + 
				"																<td>\n" + 
				"																	<a href=\"#\">best.com</a>\n" + 
				"																</td>\n" + 
				"																<td>$75</td>\n" + 
				"																<td>6,500</td>\n" + 
				"																<td>Apr 03</td>\n" + 
				"															</tr>\n" + 
				"\n" + 
				"															<tr>\n" + 
				"																<td>\n" + 
				"																	<a href=\"#\">pro.com</a>\n" + 
				"																</td>\n" + 
				"																<td>$55</td>\n" + 
				"																<td>4,250</td>\n" + 
				"																<td>Jan 21</td>\n" + 
				"															</tr>\n" + 
				"														</tbody>\n" + 
				"													</table>\n" + 
				"												</div>\n" + 
				"											</div>\n" + 
				"\n" + 
				"											<div class=\"modal-footer\">\n" + 
				"												<button class=\"btn btn-small btn-danger pull-left\" data-dismiss=\"modal\">\n" + 
				"													<i class=\"icon-remove\"></i>\n" + 
				"													Close\n" + 
				"												</button>\n" + 
				"\n" + 
				"												<div class=\"pagination pull-right no-margin\">\n" + 
				"													<ul>\n" + 
				"														<li class=\"prev disabled\">\n" + 
				"															<a href=\"#\">\n" + 
				"																<i class=\"icon-double-angle-left\"></i>\n" + 
				"															</a>\n" + 
				"														</li>\n" + 
				"\n" + 
				"														<li class=\"active\">\n" + 
				"															<a href=\"#\">1</a>\n" + 
				"														</li>\n" + 
				"\n" + 
				"														<li>\n" + 
				"															<a href=\"#\">2</a>\n" + 
				"														</li>\n" + 
				"\n" + 
				"														<li>\n" + 
				"															<a href=\"#\">3</a>\n" + 
				"														</li>\n" + 
				"\n" + 
				"														<li class=\"next\">\n" + 
				"															<a href=\"#\">\n" + 
				"																<i class=\"icon-double-angle-right\"></i>\n" + 
				"															</a>\n" + 
				"														</li>\n" + 
				"													</ul>\n" + 
				"												</div>\n" + 
				"											</div>\n" + 
				"										</div><!--PAGE CONTENT ENDS-->\n" + 
				"									</div><!--/.span-->\n" + 
				"								</div><!--/.row-fluid-->\n" + 
				"							</div><!--/.page-content-->\n" + 
				"\n" + 
				"							<div class=\"ace-settings-container\" id=\"ace-settings-container\">\n" + 
				"								<div class=\"btn btn-app btn-mini btn-warning ace-settings-btn\" id=\"ace-settings-btn\">\n" + 
				"									<i class=\"icon-cog bigger-150\"></i>\n" + 
				"								</div>\n" + 
				"\n" + 
				"								<div class=\"ace-settings-box\" id=\"ace-settings-box\">\n" + 
				"									<div>\n" + 
				"										<div class=\"pull-left\">\n" + 
				"											<select id=\"skin-colorpicker\" class=\"hide\">\n" + 
				"												<option data-class=\"default\" value=\"#438EB9\" />#438EB9\n" + 
				"												<option data-class=\"skin-1\" value=\"#222A2D\" />#222A2D\n" + 
				"												<option data-class=\"skin-2\" value=\"#C6487E\" />#C6487E\n" + 
				"												<option data-class=\"skin-3\" value=\"#D0D0D0\" />#D0D0D0\n" + 
				"											</select>\n" + 
				"										</div>\n" + 
				"										<span>&nbsp; Choose Skin</span>\n" + 
				"									</div>\n" + 
				"\n" + 
				"									<div>\n" + 
				"										<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-header\" />\n" + 
				"										<label class=\"lbl\" for=\"ace-settings-header\"> Fixed Header</label>\n" + 
				"									</div>\n" + 
				"\n" + 
				"									<div>\n" + 
				"										<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-sidebar\" />\n" + 
				"										<label class=\"lbl\" for=\"ace-settings-sidebar\"> Fixed Sidebar</label>\n" + 
				"									</div>\n" + 
				"\n" + 
				"									<div>\n" + 
				"										<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-breadcrumbs\" />\n" + 
				"										<label class=\"lbl\" for=\"ace-settings-breadcrumbs\"> Fixed Breadcrumbs</label>\n" + 
				"									</div>\n" + 
				"\n" + 
				"									<div>\n" + 
				"										<input type=\"checkbox\" class=\"ace-checkbox-2\" id=\"ace-settings-rtl\" />\n" + 
				"										<label class=\"lbl\" for=\"ace-settings-rtl\"> Right To Left (rtl)</label>\n" + 
				"									</div>\n" + 
				"								</div>\n" + 
				"							</div><!--/#ace-settings-container-->\n" + 
				"						</div><!--/.main-content-->\n" + 
				"					</div><!--/.main-container-->\n" + 
				"\n" + 
				"					<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-small btn-inverse\">\n" + 
				"						<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\n" + 
				"					</a>\n" + 
				"\n" + 
				"					<!--basic scripts-->\n" + 
				"\n" + 
				"					<!--[if !IE]>-->\n" + 
				"\n" + 
				"					<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n" + 
				"\n" + 
				"					<!--<![endif]-->\n" + 
				"\n" + 
				"					<!--[if IE]>\n" + 
				"			<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n" + 
				"			<![endif]-->\n" + 
				"\n" + 
				"					<!--[if !IE]>-->\n" + 
				"\n" + 
				"					<script type=\"text/javascript\">\n" + 
				"						window.jQuery || document.write(\"<script src='assets/js/jquery-2.0.3.min.js'>\"+\"<\"+\"/script>\");\n" + 
				"					</script>\n" + 
				"\n" + 
				"					<!--<![endif]-->\n" + 
				"\n" + 
				"					<!--[if IE]>\n" + 
				"			<script type=\"text/javascript\">\n" + 
				"			 window.jQuery || document.write(\"<script src='assets/js/jquery-1.10.2.min.js'>\"+\"<\"+\"/script>\");\n" + 
				"			</script>\n" + 
				"			<![endif]-->\n" + 
				"\n" + 
				"					<script type=\"text/javascript\">\n" + 
				"						if(\"ontouchend\" in document) document.write(\"<script src='assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n" + 
				"					</script>\n" + 
				"					<script src=\"assets/js/bootstrap.min.js\"></script>\n" + 
				"\n" + 
				"					<!--page specific plugin scripts-->\n" + 
				"\n" + 
				"					<script src=\"assets/js/jquery.dataTables.min.js\"></script>\n" + 
				"					<script src=\"assets/js/jquery.dataTables.bootstrap.js\"></script>\n" + 
				"\n" + 
				"					<!--ace scripts-->\n" + 
				"\n" + 
				"					<script src=\"assets/js/ace-elements.min.js\"></script>\n" + 
				"					<script src=\"assets/js/ace.min.js\"></script>\n" + 
				"\n" + 
				"					<!--inline scripts related to this page-->\n" + 
				"\n" + 
				"					<script type=\"text/javascript\">\n" + 
				"						$(function() {\n" + 
				"							var oTable1 = $('#sample-table-2').dataTable( {\n" + 
				"							\"aoColumns\": [\n" + 
				"						      { \"bSortable\": false },\n" + 
				"						      null, null,null, null, null,\n" + 
				"							  { \"bSortable\": false }\n" + 
				"							] } );\n" + 
				"							\n" + 
				"							\n" + 
				"							$('table th input:checkbox').on('click' , function(){\n" + 
				"								var that = this;\n" + 
				"								$(this).closest('table').find('tr > td:first-child input:checkbox')\n" + 
				"								.each(function(){\n" + 
				"									this.checked = that.checked;\n" + 
				"									$(this).closest('tr').toggleClass('selected');\n" + 
				"								});\n" + 
				"									\n" + 
				"							});\n" + 
				"						\n" + 
				"						\n" + 
				"							$('[data-rel=\"tooltip\"]').tooltip({placement: tooltip_placement});\n" + 
				"							function tooltip_placement(context, source) {\n" + 
				"								var $source = $(source);\n" + 
				"								var $parent = $source.closest('table')\n" + 
				"								var off1 = $parent.offset();\n" + 
				"								var w1 = $parent.width();\n" + 
				"						\n" + 
				"								var off2 = $source.offset();\n" + 
				"								var w2 = $source.width();\n" + 
				"						\n" + 
				"								if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';\n" + 
				"								return 'left';\n" + 
				"							}\n" + 
				"						})\n" + 
				"					</script>\n" + 
				"				</body>\n" + 
				"			</html>");
		

			 
			

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
