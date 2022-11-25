<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script defer src="/js/un.js"></script>
<c:import url="../temp/boot.jsp"></c:import>
</head>
<body>
    <div id="dep">
        <select id="depnum">
        </select>
        <button id="idbtn">생성</button>
    </div>
    <div id="input">
        <input type="text" id="getID" readonly>
    </div>
    <div id=mailf>
    	<form action="../mail/mail" method="post">
        <table>
            <tr>
                <td>메일 주소</td>
                <td>
                    <input type="text" name="address" placeholder="이메일 주소를 입력하세요">
                </td>
            </tr>
            <tr>
                <td>제목</td>
                <td>
                    <input type="text" name="title" placeholder="제목을 입력하세요">
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td>
                    <textarea name="contents" placeholder="보낼 내용을 입력하세요">귀하의 사번은 []입니다.
                    </textarea>
                </td>
            </tr>
        </table>
        <button>발송</button>
    	</form>
    </div>
</body>
</html>