<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateBoard.jsp</title>
</head>
<body>
	<form method="post" action="/updateBoard">
		<table border="1">
			<tr>
				<td>board_No</td>
				<td><input type="text" readonly="readonly" name="boardNo" value="${board.boardNo}"></td>
			</tr>
			
			<tr>
				<td>board_title</td>
				<td><input type="text" name="boardTitle" value="${board.boardTitle}"></td>
			</tr>
			
			<tr>
				<td>board_content</td>
				<td><input type="text" name="boardContent" value="${board.boardContent}"></td>
			</tr>
			
			<tr>
				<td>board_user</td>
				<td><input type="text" name="boardUser" value="${board.boardUser}"></td>
			</tr>
		</table>
				<button type="submit">수정</button>
	</form>
</body>
</html>