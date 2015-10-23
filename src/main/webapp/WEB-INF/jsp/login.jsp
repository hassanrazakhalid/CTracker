<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
</head>
<body>

	<form action="${BaseURL}loginSubmitted.html" method="post">

		<table>
		<tr><td>Email:   </td><td><input type="text" name="email">  </td></tr>
		<tr><td>Password:   </td><td><input type="text" name="password">  </td></tr>
		<tr> <td align="center"><input type="submit" value="Login"> </td> </tr>
		</table>  
	</form>
	<p>My first body</p>
	<a href="http://localhost:8080/FirstTileApp/page2.html">Page 2</a>

</body>
</html>