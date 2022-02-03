<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>JSON 사용하기</h1>

	<li>
		<a href="./jsonUse/jsonView.do" target="_black">
			@responseBody 어노테이션을 이용한 JSON데이터 보기
		</a>
	</li>
	
	<!--  
	여름 가을
	https://wwwact=5&oq=%EC%97%AC%EB%A6%84+%EA%B0%80%EC%9D%84&
	-->
	
	<h2>RestAPI 만들어보기</h2>
	<li>
		<a href="./restapi/boardList.do?nowPage=1" target="_black">
			리스트보기(페이지별)
		</a>
	</li>
	<li>
		<a href="./restapi/boardList.do?searchField=title&searchTxt=%EC%97%AC%EB%A6%84+%EA%B0%80%EC%9D%84" target="_black">
			검색결과보기(공백으로구분)
		</a>
	</li>
	<li>
		<a href="./restapi/boardView.do?num=67" target="_black">
			내용보기
		</a>
	</li>
	
	<h2>Ajax와 연동하기</h2>
	<li>
		<a href="./ajax/boardList.jsp" target="_blank">
			리스트보기(페이지별)
		</a>
	</li>
	<li>
		<a href="./ajax/boardView.jsp" target="_blank">
			내용보기
		</a>
	</li>
	
	<h2>회원리스트 JSON으로 출력하기</h2>
	<li>
		<a href="./android/memberObject.do" target="_blank">
			회원리스트 가져오기(객체형태)
		</a>
	</li>
	<li>
		<a href="./android/memberList.do" target="_blank">
			회원리스트 가져오기(배열형태)
		</a>
	</li>
	<li>
		<a href="./android/memberLogin.do?id=kosmo&pass=1111" target="_blank">
			회원로그인 하기(객체형태)
		</a>
	</li>
	<li>
		<a href="./restapi/boardWrite.do?title=RestAPI로작성하기1&content=내용내용&id=test1"
			target="_blank">
			글작성하기
		</a>
	</li>
</body>
</html>
