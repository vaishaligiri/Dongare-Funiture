<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="AdminMaster.jsp"></jsp:include>
<br><br>

	<div class="column2 col-lg-10 col-md-10 col-sm-12">
		
	
<select name='maintype' style='width:400px;height:30px;'>
       <option>Select Main Type</option>
</select><br><br>
<input type='text' name='subtype' value='' style='width:400px;height:30px;' /><br><br>
<input type='submit' name='s' value='Add New SubType' style='width:400px;height:30px;'/>


			</div>
		</div>
	</div>
</body>
</html>