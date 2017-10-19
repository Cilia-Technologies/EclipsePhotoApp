<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload to Database Demo</title>
</head>
<body>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<% String u = request.getParameter("uname"); %>
	<center>
		<h1>Photo Upload to Database</h1>
		<h2>Profile Photo</h2>
		                    <div class="row-fluid">
						<div class="span12">
							<!--PAGE CONTENT BEGINS-->

							<div class="row-fluid">
								<ul class="ace-thumbnails">
									<li>
										<a href="assets/images/gallery/image-1.jpg" title="Photo Title" data-rel="colorbox">
											<img alt="150x150" src="assets/images/gallery/thumb-1.jpg" />
											
										</a>
										<a href="assets/images/gallery/image-1.jpg" title="Photo Title" data-rel="colorbox">
											<img alt="150x150" src="assets/images/gallery/thumb-1.jpg" />
											
										</a>
										<a href="assets/images/gallery/image-1.jpg" title="Photo Title" data-rel="colorbox">
											<img alt="150x150" src="assets/images/gallery/thumb-1.jpg" />
											
										</a>

									</li>
									
									</ul>
									
									</div>
								</div>
							</div>

		
		
		<form method="post" action="uploadServlet" enctype="multipart/form-data">
			<table border="0">
	            
	            <tr>
					<td>User ID: </td>
					<td><input type="text" name="username" readonly value="<%=u%>"  size="50"/></td>
				</tr>			
			
				<tr>
					<td>User Name: </td>
					<td><input type="text" name="username" readonly value="<%=u%>"  size="50"/></td>
				</tr>	
				
				<tr>
					<td>Prize : </td>
					<td><input type="number" name="" value=""  size="50"/></td>
				</tr>	
							
				<tr>
					<td>Portrait Photo: </td>
					<td><input type="file" name="photo" size="50"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>