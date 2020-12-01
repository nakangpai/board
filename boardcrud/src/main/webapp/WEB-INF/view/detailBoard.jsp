<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detailBoard</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<td>번호</td>
			<td>${detailBoard.boardNo}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${detailBoard.boardTitle}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${detailBoard.boardContent}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${detailBoard.boardUser}</td>
		</tr>
		<tr>
			<td>게시 날짜</td>
			<td>${detailBoard.boardDate}</td>
		</tr>
	</table>
	<div>
		<span><a href="/board"><button type="button">목록</button></a></span>
		<span><a href="/updateBoard?boardNo=${detailBoard.boardNo}"><button type="button">수정</button></a></span>
		<span><a href="/deleteBoard?boardNo=${detailBoard.boardNo}"><button type="button">삭제</button></a></span>
	</div>
</body>
</html>