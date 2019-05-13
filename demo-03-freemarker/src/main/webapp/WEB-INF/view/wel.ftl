<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<#list userList as u>
	${u_index} username:${u.username} password:${u.password}
		</br>
	</#list>
</body>
</html>