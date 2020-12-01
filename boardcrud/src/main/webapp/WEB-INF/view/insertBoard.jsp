<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertBoard.jsp</title>
</head>
<body>
	<div>
		<a href="/board"><button type="button">목록</button></a>
	</div>
	<form method="post" action="/insertBoard">
		<table border="1">
			<tr>
				<td>board_title</td>
				<td><input type="text" name="boardTitle"></td>
			</tr>
			
			<tr>
				<td>board_content</td>
				<td><input type="text" name="boardContent"></td>
			</tr>
			
			<tr>
				<td>board_user</td>
				<td><input type="text" name="boardUser"></td>
			</tr>
		</table>
		<button type="submit">등록</button>
	</form>
</body>
</html>