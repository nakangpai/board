<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
</head>
<body>

	<h2>게시판 글 목록</h2>
	<div>
		<a href="/insertBoard"><button type="button"> 작성</button></a>
	</div>
	<table border="">
		<thead>
			<tr>
				<th>board_no</th>
				<th>board_title</th>
				<th>board_content</th>
				<th>board_user</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${boardList}">
				<tr>
					<td>${c.boardNo}</td>
					<td><a href="/detailBoard?boardNo=${c.boardNo}">${c.boardTitle}</a></td>
					<td>${c.boardContent}</td>
					<td>${c.boardUser}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>