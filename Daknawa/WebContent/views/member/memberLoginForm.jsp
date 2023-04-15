<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
    .h1 { text-align : center; }

    .input, .button {
        width : 320px;
        height : 40px;
        border-style : solid;
        border-width : 2px;
    }

    .input {
        box-sizing : border-box;
        margin-bottom : 5px;
    }

    .button {
        background-color : black;
        color : white;
        margin : 30px 0px 5px 0px;
        cursor : pointer;
    }

    .button:hover {
        background-color : gray;
    }

    .pass>a, .sign>a {
        text-decoration : none;
        color : black;
    }

    .div1 {
        width : 320px;
        text-align: right;
        margin : auto;
    }

    .div2 { font-size : 12px; }

    .pass {
        text-align : center;
        width : 100%;
        margin-left : 60px;
    }

    .sign {
        text-align : right;
        width : 30%;
    }
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<form id="login-form" action="login.me" method="post">

        <br><br><br><br><br><br><br><br><br><br><br><br>
        
        <h1 class="h1">로그인</h1>

        <br>

        <div class="div1">

        <table>
            <tr>
                <td style="text-align: left;">아이디 *</td>
            </tr>
            <tr>
                <td><input type="text" name="userId" class="input" minlength="5" maxlength="12" required></td>
            </tr>
            <tr>
                <td style="text-align: left;">비밀번호 *</td>
            </tr>
            <tr>
                <td><input type="password" name="userPwd" class="input" minlength="8" maxlength="15" required></td>
            </tr>
            <tr>
                <td><button type="submit" class="button">로그인하기</button></td>
            </tr>
        </table>
        <div class="div2" style="display : flex;">
            <div class="pass">
                <a href="">비밀번호 찾기</a>
            </div>
            <div class="sign">
                <a href="<%= contextPath %>/enrollForm.me" class="member-enroll">회원 가입</a>
            </div>
        </div>
        </div>

    </form>
	
	

</body>
</html>