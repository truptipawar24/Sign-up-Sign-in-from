<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function addUser() 
{
	document.fn.action="registration.jsp";
	document.fn.submit();
}
function deleteUser() {
	
	alert("Delete Data");
	document.fn.action="delete";
	document.fn.submit();
}
function editUser() {

	document.fn.action="edit";
	document.fn.submit();
}
	
</script>
</head>
<body>
<form name="fn">


		<table border="1" align="center">
			
			<th>Id</th>
			<th>Name</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Mobile No</th>
			<tr>
				<c:forEach items="${data}" var="user">
					<br>
					<td><input type="radio" name="uid" value="${user.uid}"></td>
					
					<td>${user.name}</td>
					<td>${user.uname}</td>
					<td>${user.password}</td>
					<td>${user.mobileno}</td>
				
					
			</tr>
			</c:forEach>

		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>
</body>
</html>
</body>
</html>