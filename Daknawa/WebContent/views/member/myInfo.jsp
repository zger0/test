<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .h1 {
        text-align : center;
        font-size : 50px;
    }

    .input, .button {
        width : 400px;
        height : 45px;
        border-style : solid;
        border-width : 2px;
        font-size : 14px;
    }

    .input {
        box-sizing : border-box;
        margin-bottom : 5px;
    }

    .button {
        background-color : black;
        color : white;
        margin : 20px 0px 5px 0px;
    }

    .button2 {
        width : 100px;
        height : 45px;
        border-style : solid;
        border-width : 2px;
        font-size : 14px;
        background-color : rgb(255, 37, 37);
        color : white;
        margin : 50px 0px 5px 150px;
    }

    .button:hover {
        background-color : gray;
        cursor : pointer;
    }
    
    .button2:hover {
            background-color : orangered;
            cursor : pointer;
        }

    .div1 {
        width : 400px;
        margin : auto;
    }

    
    .div1 td {
        text-align: left;
        font-size : 14px;
    }

    .gender { cursor : pointer; }
    
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>

    <form id="infoUpdate-form" action="update.me" method="post">

        <br><br><br><br>
        
        <h1 class="h1">내 정보</h1>

        <br>

        <div class="div1">

        <table>
            <tr>
                <td>아이디 *</td>
            </tr>
            <tr>
                <td><input type="text" name="userId" class="input" minlength="5" maxlength="12" placeholder="5 ~ 12 글자 이내 작성 (영문, 숫자로)" required readonly></td>
            </tr>
            <tr>
                <td>비밀번호 *</td>
            </tr>
            <tr>
                <td>
                    <button type="button" class="button" style="margin : 0px 0px 5px 0px;" onclick="location.href = '<%= contextPath %>/updatePwd.me'">변경하러가기</button>
                </td>
            </tr>
            <tr>
                <td>닉네임 설정 *</td>
            </tr>
            <tr>
                <td><input type="text" name="userNickname" class="input" minlength="2" maxlength="10" placeholder="2 ~ 10 글자 이내 작성 (영문, 숫자, 한글)" required></td>
            </tr>
            <tr>
                <td>이름 *</td>
            </tr>
            <tr>
                <td><input type="text" name="userName" class="input" minlength="2" maxlength="10" required></td>
            </tr>
            <tr>
                <td>이메일 *</td>
            </tr>
            <tr>
                <td><input type="email" name="email" class="input" required></td>
            </tr>
            <tr>
                <td>전화번호 *</td>
            </tr>
            <tr>
                <td><input type="text" name="phone" class="input" maxlength="11" placeholder="(-)를 제외한 숫자만 입력" required></td>
            </tr>
            <tr>
                <td>생년월일</td>
            </tr>
            <tr>
                <td><input type="date" name="birth" class="input" maxlength="10"></td>
            </tr>
            <tr>
                <td>성별</td>
            </tr>
            <tr>
                <td>
                    <input type="radio" name="gender" class="gender" value="남" style="width : 15px; height : 15px;"><label for="gender" style="font-size : 15px; margin-right : 15px;">남</label>
                    <input type="radio" name="gender" class="gender" value="여" style="width : 15px; height : 15px;"><label for="gender" style="font-size : 15px;">여</label>
                </td>
            </tr>
            <tr>
                <td>주소</td>
            </tr>
            <tr>
                <td><input type="text" name="address" class="input" maxlength="100"></td>
            </tr>
            <tr>
                <td><button type="submit" class="button" onclick="">수정하기</button></td>
            </tr>
            <tr>
                <td><button type="submit" class="button2" onclick="">회원탈퇴</button></td>
            </tr>
        </table>
        </div>

    </form>

</body>
</html>