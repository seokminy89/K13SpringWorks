<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<script>
    $(function(){
        $('#btnBoard').click(function(){
            $.ajax({
                type : 'get', //전송방식
                url : '../restapi/boardView.do', //요청URL
                data : {num : $('#num').val()}, //파라미터는 게시물의 일련번호
                contentType : "text/html;charset:utf-8", //컨텐츠타입
                dataType : 'json', //콜백 데이터 타입.
                success : sucCallBack, //요청에 성공했을때 호출되는 콜백 함수
                error : errCallBack //실패했을때의 콜백 함수.
            });
        });
            /*
            trigger() 함수는 특정 이벤트를 자동으로 발생시켜준다.
            아래의 경우 페이지가 로드되면 해당 버튼을 클릭해 준다.
            */
        $('#btnBoard').trigger('click');
    });
    function sucCallBack(resData){
    	let tableData = "";
        //콜백받은 데이터를 각각의 td태그에 삽입한다.
        $('#td1').html(resData.num);
        $('#td2').html(resData.id);
        $('#td3').html(resData.postdate);
        $('#td4').html(resData.visitcount);
        $('#td5').html(resData.title);
        $('#td6').html(resData.content);
    }
    //실패했을때의 콜백 함수
    function errCallBack(errData){
        console.log(errData.status+":"+errData.statusText);
    }
</script>
<body>
<div class="container">
    <h2>게시판 API 활용하여 내용 출력하기</h2>
    <table class="table table-bordered">
        <tr>
            <th>번호</th><td id="td1"></td>
            <th>아이디</th><td id="td2"></td>
        </tr>
            <th>작성일</th><td id="td3"></td>
            <th>조회수</th><td id="td4"></td>
        <tr>
        </tr>
            <th>제목</th><td colspan="3" id="td5"></td>
        <tr>
        </tr>
            <th>제목</th><td colspan="3" id="td6"></td>
        <tr>
    </table>
    <div>
        <input type="text" id="num" value="9">
        <input type="button" value="내용불러오기" id="btnBoard" />
    </div>
</div>
</body>
</html>