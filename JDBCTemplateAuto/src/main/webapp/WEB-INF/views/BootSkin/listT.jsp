<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/resources/commons/header.jsp" %>
<body>
<div class="container">
    <!-- Top영역 -->
    <%@ include file="/resources/commons/top.jsp" %>
    <!-- Body영역 -->
    <div class="row">
        <!-- Left메뉴영역 -->
        <%@ include file="/resources/commons/left.jsp" %>
        <!-- Contents영역 -->
        <div class="col-9 pt-3">
            <h3>게시판 목록 - <small>자유게시판</small></h3>
            <!-- 검색 -->
            <div class="row">
                <form action="">
                    <div class="input-group ms-auto" style="width: 400px;">
                        <select name="searchColumn" class="form-control">
                            <option value="title">제목</option>
                            <option value="contents">내용</option>
                        </select>
                        <input type="text" name="searchWord" class="form-control" placeholder="Search" style="width: 200px;">
                        <button class="btn btn-success" type="submit" value="검색하기">
                            <i class="bi-search" style="font-size: 1rem; color: white;"></i>
                        </button>
                    </div>
                </form>
            </div>
            <!-- 게시판 리스트 -->
            <div class="row mt-3 mx-1">
                <table class="table table-bordered table-hover table-striped">
                <thead>
                    <tr class="text-center">
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회수</th>
                     	<!--<th>첨부</th> -->
                    </tr>
                </thead>
                <tbody>
					<c:choose>
						<c:when test="${empty listRows }">
							<tr>
								<td colspan="6" class="text-center">
									등록된 게시물이 없습니다 ^^*
								</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach items="${listRows }" var="row" 
								varStatus="loop">
								<!-- 리스트반복시작 -->
								<tr>
									<td class="text-center">${row.virtualNum }</td>
									<td class="text-left">
										<a href="./view.do?idx=${row.idx}
											&nowPage=${nowPage}">${row.title}</a>
									</td>
									<td class="text-center">${row.name }</td>
									<td class="text-center">${row.postdate }</td>
									<td class="text-center">${row.hits }</td>
									<!-- <td class="text-center">--</td> -->
								</tr>
								<!-- 리스트반복끝 -->
							</c:forEach>
						</c:otherwise>
					</c:choose>
                </tbody>
                </table>
            </div>
            <!-- 각종버튼 -->
            <div class="row">
                <div class="col d-flex justify-content-end">
                    <button type="button" class="btn btn-primary" onclick="location.href='./write.do';">글쓰기</button>
                     <button type="button" class="btn btn-warning" onclick="location.href='./list.do';">목록보기</button>
                </div>
            </div>
            <!-- 페이지 번호 -->
            <div class="row mt-3">
				<div class="col">
					<ul class="pagination justify-content-center">
						${pagingImg }
					</ul>
				</div>
			</div>
            
            <!-- <div class="row mt-3">
                <div class="col">
                    <ul class="pagination justify-content-center">
                        <li class="page-item"><a class="page-link" href="#">
                            <i class='bi bi-skip-backward-fill'></i>
                        </a></li>
                        <li class="page-item"><a class="page-link" href="#">
                            <i class='bi bi-skip-start-fill'></i>
                        </a></li>
                        <li class="page-item active"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item"><a class="page-link" href="#">
                            <i class='bi bi-skip-end-fill'></i>
                        </a></li>
                        <li class="page-item"><a class="page-link" href="#">
                            <i class='bi bi-skip-forward-fill'></i>
                        </a></li>
                    </ul>
                </div>
            </div> -->
        </div>
    </div>
    <!-- Copyright영역 -->
    <%@ include file="/resources/commons/copyright.jsp" %>
</div>
</body>
</html>