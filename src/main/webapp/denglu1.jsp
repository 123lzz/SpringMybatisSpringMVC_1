<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>校园二手-登录</title>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
        <!-- 这里css和icon的地址要加public 不然node加载不出来，如果有更新css要把public里面的也更新 -->
        <link rel="stylesheet" href="css/denglu1.css">
        <script src="js/iconfont.js"></script>
</head>
 <body>
        <div class="hero">
            <div class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <button type="button" class="toggle-btn" onclick="login()">登录</button>
                    <button type="button" class="toggle-btn" onclick="register()">注册</button>
                </div>
                <div class="social-icons">
                    <svg class="icon" aria-hidden="true">
                        <use xlink:href="#icon-weixin"></use>
                    </svg>
                    <svg class="icon" aria-hidden="true">
                        <use xlink:href="#icon-qq"></use>
                    </svg>
                    <svg class="icon" aria-hidden="true">
                        <use xlink:href="#icon-weibo"></use>
                    </svg>
                </div>
                <form id="login" class="input-group" action="<%=request.getContextPath() %>/login" method="post">
                    <input type="text" class="input-field" name="login_id" placeholder="学号" required>
                    <input type="text" class="input-field" placeholder="密码" name="login_pwd" required>
                    <input type="checkbox" class="check-box"><span>记住密码</span>
                    <button type="submit" class="submit-btn" id="login_btn">登录</button>
                </form>
                <form id="register" class="input-group" action="<%=request.getContextPath() %>/sign" method="post">
                    <input type="text" class="input-field" name="sign_id" placeholder="学号" required>
                    <input type="text" class="input-field" name="sign_phone" placeholder="联系方式" required>
                    <input type="text" class="input-field" name="sign_pwd" placeholder="密码" required>
                    <input type="checkbox" class="check-box"><span>我同意接受协议</span>
                    <button type="submit" class="submit-btn" id="sign_btn">注册</button>
                </form>
            </div>
        
            <script>
                var x =document.getElementById("login");
                var y =document.getElementById("register");
                var z =document.getElementById("btn");

                function register(){
                    x.style.left="-400px";
                    y.style.left="50px";
                    z.style.left="110px";
                }
                function login(){
                    x.style.left="50px";
                    y.style.left="450px";
                    z.style.left="0";
                }



            </script>
    </body>
</html>