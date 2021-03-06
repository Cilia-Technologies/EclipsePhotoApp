<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
		<title>Gallery - super Admin</title>

		<meta name="description" content="responsive photo gallery using colorbox" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!--basic styles-->

		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link href="assets/css/bootstrap-responsive.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="assets/css/style.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!--page specific plugin styles-->

		<link rel="stylesheet" href="assets/css/colorbox.css" />

		<!--fonts-->

		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

		<!--ace styles-->

		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-responsive.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!--inline styles related to this page-->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="App.GetCon"%>
<%@ page import="java.util.ArrayList"%>

<%
HttpSession sessionsa = request.getSession(false);
if(sessionsa==null){
	out.print("Please login first");  
    request.getRequestDispatcher("login.html").include(request, response);
}
String suser = (String)sessionsa.getAttribute("USER");
%>
<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a href="#" class="brand">
						<small>
						<i class="icon-leaf"></i>
							LANG00RLENS
						</small>
					</a><!--/.brand-->

				<ul class="nav ace-nav pull-right">
					<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
<!-- 							<img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" />  -->
								<span class="user-info">
									<small>Welcome,</small>
									Jason
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer">
								<li>
									<a href="<%=request.getContextPath()%>/LogoutServlet">
										<i class="icon-off"></i>
										Logout
									</a>
								</li>
							</ul>
					</li>
				</ul><!--/.ace-nav-->
					
					
				</div><!--/.container-fluid-->
			</div><!--/.navbar-inner-->
		</div>

		<div class="main-container container-fluid">
			<a class="menu-toggler" id="menu-toggler" href="#">
				<span class="menu-text"></span>
			</a>

			<div class="sidebar" id="sidebar">
				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-small btn-success">
							<i class="icon-signal"></i>
						</button>

						<button class="btn btn-small btn-info">
							<i class="icon-pencil"></i>
						</button>

						<button class="btn btn-small btn-warning">
							<i class="icon-group"></i>
						</button>

						<button class="btn btn-small btn-danger">
							<i class="icon-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span>

						<span class="btn btn-info"></span>

						<span class="btn btn-warning"></span>

						<span class="btn btn-danger"></span>
					</div>
				</div><!--#sidebar-shortcuts-->

				<ul class="nav nav-list">
					<li class="active">
						<a href="gallery.jsp">
							<i class="icon-picture"></i>
							<span class="menu-text"> Gallery </span>
						</a>
					</li>
					

					
							<li >
								<a href="UserHomeServlet">
									<i class="icon-double-angle-right"></i>
									PROFILE
								</a>
							</li>

						   <li>
								<a href="pricing.html">
									<i class="icon-double-angle-right"></i>
									RECHARGE
								</a>
							</li>
					
                     <li>
						<a href="#">
							<i class="icon-picture"></i>
							<span class="menu-text"> FAQ </span>
						</a>
					</li>
					
				</ul><!--/.nav-list-->

				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"></i>
				</div>
			</div>

			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="icon-home home-icon"></i>
							<a href="UserHomeServlet">Home</a>

							<span class="divider">
								<i class="icon-angle-right arrow-icon"></i>
							</span>
						</li>
						<li class="active">Gallery</li>
					</ul><!--.breadcrumb-->

				</div>

				<div class="page-content">
<div class="page-header position-relative">
						<h1>
							WALLET AMOUNT
							<small>
								<i class="icon-double-angle-right">
								 340.00</i>
							  
							</small>
						</h1>
					</div><!--/.page-header-->
					
														
													

					
	






<% ArrayList<Integer> photo = new ArrayList<Integer>(); 
Connection con=GetCon.getCon();
PreparedStatement ps;
try {
	ps = con.prepareStatement("SELECT photo_id FROM photos P INNER JOIN user U ON P.user_id=U.user_id WHERE username=?");
	ps.setString(1,suser);
	ResultSet rs=ps.executeQuery();
		while(rs.next())
		{		
			photo.add(rs.getInt(1));
		}
	}
	catch(Exception e){System.out.println(e);}

%>


<%  int count=photo.size()-1; int i,b,a,j;%>

                
 <ul class="slides">
<% for (i=0; i<=count; i++)
{ %>
	
		   
		
    <input type="radio" name="radio-btn" id="img-<%= i %>" checked />
  	  <li class="slide-container">
  	  
  	  		
  	  
		<div  class="slide">
		
				
		    
			<a href="downloadFileServlet?DN=<%= photo.get(i) %>">  
			<img src="DisplayImage?ID=<%= photo.get(i) %>"/>
			</a>	
			
            <span style="width:175px;padding-bottom:3px;border-color: #edf2f6;" class="btn btn-info btn-small tooltip-info" onclick="DownloadImage?DN=<%= photo.get(i) %>" data-rel="popover" data-placement="bottom" title="Some Info" data-content=" photo is uploading to server.">TIME LEFT : <p  id="demo"></p></span>
		    <span style="width:175px;border-color: #edf2f6" class="btn btn-info btn-small tooltip-info" onclick="DownloadImage?DN=<%= photo.get(i) %>" data-rel="popover" data-placement="bottom" title="Some Info" data-content=" photo is uploading to server.">PRICE : 32.00</span>
			
			<span style="width:175px;padding-bottom:3px;border-color: #edf2f6" class="btn btn-info btn-small tooltip-info" onclick="location.href='<%=request.getContextPath()%>/downloadFileServlet?DN=<%= photo.get(i) %>'" data-rel="popover" data-placement="bottom" icon="download" title="Some Info" data-content=" photo is uploading to server.">DOWNLOAD</span>		
        </div>
		<div class="nav">
		
		     

		<% 
				if(i == 0)
					{
						b=count;
					}
				else
				{
					b=i-1;
				}
				if(i == count)
				{
					a=0;
				}
				else
				{
					a=i+1;
				}
					
					%>
			<label for="img-<%= b %>" class="prev">&#x2039;</label>
			<label for="img-<%= a %>" class="next">&#x203a;</label>
		</div>
      </li>
<% } %>
   
 	<li class="nav-dots">
	<% for(i=0; i<=count; i++) { %>
      <label for="img-<%=i %>" class="nav-dot" id="img-dot-<%=i %>"></label>
      <% } %>
     </li>
 </ul>





</div>


										



				<div class="ace-settings-container" id="ace-settings-container">
					
					<div class="ace-settings-box" id="ace-settings-box">
						<div>
							<div class="pull-left">
								<select id="skin-colorpicker" class="hide">
									<option data-class="default" value="#438EB9" />#438EB9
									<option data-class="skin-1" value="#222A2D" />#222A2D
									<option data-class="skin-2" value="#C6487E" />#C6487E
									<option data-class="skin-3" value="#D0D0D0" />#D0D0D0
								</select>
							</div>
							<span>&nbsp; Choose Skin</span>
						</div>

						<div>
							<input type="checkbox" class="ace-checkbox-2" id="ace-settings-header" />
							<label class="lbl" for="ace-settings-header"> Fixed Header</label>
						</div>

						<div>
							<input type="checkbox" class="ace-checkbox-2" id="ace-settings-sidebar" />
							<label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
						</div>

						<div>
							<input type="checkbox" class="ace-checkbox-2" id="ace-settings-breadcrumbs" />
							<label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
						</div>

						<div>
							<input type="checkbox" class="ace-checkbox-2" id="ace-settings-rtl" />
							<label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
						</div>
					</div>
				</div><!--/#ace-settings-container-->
			</div><!--/.main-content-->
		</div><!--/.main-container-->

		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-small btn-inverse">
			<i class="icon-double-angle-up icon-only bigger-110"></i>
		</a>

		<!--basic scripts-->

		<!--[if !IE]>-->

		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

		<!--<![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]>-->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!--<![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>

		<!--page specific plugin scripts-->

		<script src="assets/js/jquery.colorbox-min.js"></script>

		<!--ace scripts-->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		<!--inline scripts related to this page-->

		<script type="text/javascript">
			$(function() {
	var colorbox_params = {
		reposition:true,
		scalePhotos:true,
		scrolling:false,
		previous:'<i class="icon-arrow-left"></i>',
		next:'<i class="icon-arrow-right"></i>',
		close:'&times;',
		current:'{current} of {total}',
		maxWidth:'100%',
		maxHeight:'100%',
		onOpen:function(){
			document.body.style.overflow = 'hidden';
		},
		onClosed:function(){
			document.body.style.overflow = 'auto';
		},
		onComplete:function(){
			$.colorbox.resize();
		}
	};

	$('.ace-thumbnails [data-rel="colorbox"]').colorbox(colorbox_params);
	$("#cboxLoadingGraphic").append("<i class='icon-spinner orange'></i>");//let's add a custom loading icon

	/**$(window).on('resize.colorbox', function() {
		try {
			//this function has been changed in recent versions of colorbox, so it won't work
			$.fn.colorbox.load();//to redraw the current frame
		} catch(e){}
	});*/
})
		</script>
		
		<script>
// Set the date we're counting down to
var countDownDate = new Date("Jan 5, 2018 15:37:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  // Get todays date and time
  var now = new Date().getTime();

  // Find the distance between now an the count down date
  var distance = countDownDate - now;

  // Time calculations for days, hours, minutes and seconds
  var days = Math.floor(distance / (1000 * 60 * 60 * 24));
  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);

  // Display the result in the element with id="demo"
  document.getElementById("demo").innerHTML = days + "d " + hours + "h "
  + minutes + "m " + seconds + "s ";

  // If the count down is finished, write some text
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("demo").innerHTML = "EXPIRED";
  }
}, 1000);
</script>
		
</body>
</html>