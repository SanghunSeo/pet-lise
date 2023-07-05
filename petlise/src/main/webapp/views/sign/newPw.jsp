<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="icon" href="/images/favicon.ico" />
    <link rel="apple-touch-icon" href="/images/favicon.ico" />
    <link rel="stylesheet" href="/css/style.css" />
    <link rel="stylesheet" href="/css/sign/findpw.css" />
    <title>Pet LiSe</title>
  </head>
  <body>
    <main class="container">
      <div class="dogImage">
        <a href="/signin">
          <img src="/images/login-logo.png" alt="로고" />
        </a>
        <img src="/images/dogs.svg" alt="강아지" />
      </div>
      <div class="loginWrapper">
        <div class="tabMenu">
          <a href="/findid">아이디 찾기</a>
          <span></span>
          <a href="/findpw">비밀번호 찾기</a>
        </div>
        <form class="loginform">
          <div class="divWrapper">
            <div class="inputWrapper">
              <p>새 비밀번호</p>
              <input type="password" />

              <p>새 비밀번호 확인</p>
              <input type="password" />
            </div>
          </div>
          <button>확인</button>
        </form>
      </div>
    </main>
  </body>
</html>
