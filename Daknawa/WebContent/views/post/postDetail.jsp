<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>게시글 게시판</title>
        <style>
    
    
    .body-1 {
        margin: 0;
        padding: 0;
        font-family: 'Noto Sans KR', sans-serif;
    }

    
    .class-1 {
        margin: 20px ;
        max-width: 960px;
        display: flex;
        flex-wrap: wrap;
    }
    
    .section-1 {
        flex-basis: 50%;
        padding: 10px;
    }
        
    img {
        max-width: 100%;
        height: auto;
    }
    
    
    .outer {
        margin: 8%;
        margin-top: 5%;
    }
    
    .table-1 {
    border-collapse: collapse;
    width: 100%;
    }
    
    .tr-1, .tr-2 {
    border: 1px solid #ddd;
    padding: 20px;
    text-align: left;
    }
    </style>
    </head>
    <body class="body-1">
        <%@ include file="../common/menubar.jsp" %>
    
        <main class="class-1">
            <section class="section-1">
                <h2 align="center">게시글 내용</h2>
                    <div class="outer">
                        <table class="table-1">
                            <thead> 
                                <tr class="tr-1">
                                    <th class="table-active">번호</th>
                                    <th class="table-active">글제목</th>
                                    <th class="table-active">작성자</th>
                                    <th class="table-active">조회수</th>
                                    <th class="table-active">작성일</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="tr-2">
                                    <td>1</td>
                                    <td>첫 번째 글</td>
                                    <td>작성자1</td>
                                    <td>10</td>
                                    <td>2023-04-04</td>
                                </tr>
                                <tr>
                                    <td colspan="5">
                                        <textarea name="content-text" id="boardtext1" cols="200" rows="40" style="resize: none"></textarea>
                                    </td>                
                                </tr>
                              
                            </tbody> 
                        </table>
                        </div>    
            
        </main>
        </footer>
    </body>
    </html>
    
    
    
    
    
    </body>
    </html>