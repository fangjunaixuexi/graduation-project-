<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${pageContext.request.contextPath }css/shop.css" type="text/css" rel="stylesheet" />

<link href="${pageContext.request.contextPath }/skin/default/skin.css" rel="stylesheet" id="skin" />
<link href="${pageContext.request.contextPath }/css/Sellerber.css" type="text/css"  rel="stylesheet" />
<link href="${pageContext.request.contextPath }/css/bkg_ui.css" type="text/css"  rel="stylesheet" />
<link href="${pageContext.request.contextPath }/font/css/font-awesome.min.css"  rel="stylesheet" />
<script src="${pageContext.request.contextPath }/js/jquery-1.9.1.min.js" type="text/javascript" ></script>
<script src="${pageContext.request.contextPath }/js/layer/layer.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/Sellerber.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/shopFrame.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.cookie.js"></script>
<title>用户登录</title>
</head>

<body class="login-layout Reg_log_style">
<div class="logintop">    
    <span>欢迎来到学生管理平台</span>    
    <ul>
    <li><a href="#">返回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    <div class="loginbody">
<div class="login-container">
	<div class="center"> <label style="font-size: 35px">学生信息管理系统</label></div>
							<div class="space-6"></div>
							<div class="position-relative">
								<div id="login-box" class="login-box widget-box no-border visible">				
                                  <div class="login-main">
                                  <div class="clearfix">
                                  <div class="login_icon"><img src="${pageContext.request.contextPath }/images/login_img.png" /></div>
									<form id="userForm" style=" width:300px; float:right; margin-right:50px;" action="${pageContext.request.contextPath}/student/toexamine">
                                    <h4 class="title_name"><img src="${pageContext.request.contextPath }/images/login_title.png" /></h4>
										<fieldset>
										<ul>
   <li class="frame_style form_error"><label class="user_icon"></label><input name="user_name" type="text"  id="user_name" placeholder="用户名"/></li>
   <li class="frame_style form_error"><label class="password_icon"></label><input name="user_password" type="password"  id="user_password" placeholder="密码"/></li>
  </ul>
    <div class="space"></div>
                              <div class="clearfix">
                               
                                  <div><font color="red" id="message"></font></div>

                                  <button type="submit" class="login_btn" > 登&nbsp;陆 </button>
                              </div>

                              <div class="space-4"></div>
                          </fieldset>
                      </form>
</div>
                     
          
          <!-- /widget-body -->
          </div><!-- /login-box -->
      </div><!-- /position-relative -->
  </div>
 </div>
                        <div class="loginbm">版权所有  <a href=""></a> </div><strong></strong>
</body>
</html>
