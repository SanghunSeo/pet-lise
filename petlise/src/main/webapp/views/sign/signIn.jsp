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
    <link rel="stylesheet" href="/css/sign/signIn.css" />
    <title>Pet LiSe</title>
  </head>
  <body>
    <main class="container">
      <div class="dogImage">
        <a href="#">
          <img src="/images/login-logo.png" alt="로고" />
        </a>
        <img src="/images/dogs.svg" alt="강아지" />
      </div>
      <div class="loginWrapper">
        <form class="loginform">
          <p>로그인</p>
          <div class="emailWrapper">
            <p>E-mail</p>
            <input type="email" />
          </div>
          <div class="passwordWrapper">
            <p>Password</p>
            <input type="password" />
          </div>
          <button>이메일로 로그인하기</button>
        </form>
        <div class="findlink">
          <a href="/findId">아이디 찾기</a>
          <span></span>
          <a href="/findPw">비밀번호 찾기</a>
        </div>
        <div class="line"></div>
        <div class="snsWrapper">
          <p>다음 계정으로 간편 로그인</p>
          <a href="#">
            <embed src="/images/google.svg" alt="구글아이콘" />
            <span>Google로 로그인</span>
          </a>
          <a href="#">
            <embed src="/images/kakao.svg" alt="카카오아이콘" />
            <span>카카오 계정으로 로그인</span>
          </a>
        </div>
        <div class="movetosignup">
          <span>회원이 아니신가요?</span>
          <a href="/signup">회원가입 하기</a>
        </div>
      </div>
    </main>
  </body>
</html>