<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>17商城</title>
<link type="text/css" href="../css/css.css" rel="stylesheet" />
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/js.js"></script>
<script src="../js/wb.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
 $(function(){
	 $(".vipNav dd:first").show();
	 })
</script>
</head>
<%
	HttpSession s = request.getSession();
%>
<body>
 <div class="mianCont">
  <div class="top">
   <span>您好！欢迎来到校园电脑商城 请&nbsp; <a href="../login.jsp">[登录]</a>&nbsp;
			<a href="../register.jsp">[注册]</a>&nbsp;		
			</span>
		    <span class="topRight"> 
		     <a href="personal?account=<%=s.getAttribute("member")%>">我的校园电脑商城</a>&nbsp;|
		     <a href="personal?account=<%=s.getAttribute("member")%>">会员中心</a>&nbsp;|
			</span>
  </div><!--top/-->
  <div class="lsg">
   <h1 class="logo"><a href="#"><img src="../images/LOGO.png" width="217" height="90" /></a></h1>
   <form action="vagueselect" method="get" class="subBox">
    <div class="subBoxDiv">
     <input type="text" name="goodsName" class="subLeft" />
     <input type="image" src="../images/subimg.png" width="63" height="34" class="sub" />
     <div class="hotWord">
               大家都在找：
       <c:forEach items="${alltype}" var="alltype">  
        <a href="listshop?typeId=${alltype.typeId}">${alltype.goodsType}</a>&nbsp;
		</c:forEach>
     </div><!--hotWord/-->
    </div><!--subBoxDiv/-->
   </form><!--subBox/-->
   <div class="gouwuche">
    <div class="gouCar">
					 <c:if test="${empty member}">
					 <a  onclick="aClick()">我要卖&nbsp;|</a>
                </c:if>  
				<c:if test="${not empty member}">
                    <a href="../sale.jsp">我要卖&nbsp;|</a>
                </c:if>  
                <c:if test="${empty member}">
					 <a  onclick="aClick()">我要买&nbsp;|</a>
                </c:if>  
				<c:if test="${not empty member}">
                    <a href="../shopneed.jsp">我要买&nbsp;|</a>
                </c:if>  
				</div>
   </div><!--gouwuche/-->
  </div><!--lsg/-->
  <div class="pnt">
   <div class="pntLeft">
    <h2 class="Title">所有商品分类</h2>
   </div><!--pntLeft/-->
   <div class="pntRight">
    <ul class="nav">
    <li><a href="../NewFile.jsp">商城首页</a></li>
    <li><a href="listnewcomputer?goodsCategory=1">全新电脑</a></li>
	<li><a href="listnewcomputer?goodsCategory=2">二手电脑</a></li>
	<li class="navCur"><a href="shopneedmessage">需求电脑</a></li>
	<li>
		<c:if test="${empty member}">
		 <a  onclick="aClick()">会员中心</a>
        </c:if>  
	   <c:if test="${not empty member}">
         <a href="personal?account=<%=s.getAttribute("member")%>">会员中心</a>
       </c:if>  
   </li>
     <div class="clears"></div>
     <div class="phone">TEL：021-12345678</div>
    </ul><!--nav/-->
   </div><!--pntRight/-->
   <div class="clears"></div>
  </div><!--pnt/-->
  <div class="positions">
   当前位置：<a href="#">首页</a> &gt; <a href="vip.html">电脑需求</a>&gt;
  </div><!--positions/-->
  <div class="cont">
	<div class="contLeft">
				<ul class="leftPorNav">
				    <c:forEach items="${alltype}" var="alltype">
					<li><a href="listshop?typeId=${alltype.typeId}">${alltype.goodsType}</a></li>
					</c:forEach>	
				</ul>
				<!--InPorNav/-->
			</div>
   <div class="contRight">
    <div class="jilu">
				总计 <span>${pageInfo.getTotal()}</span> 个记录
	</div>
    <%
						String path = request.getContextPath();
						String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
								+ path + "/";
					%>
    <table class="vipOrder">
     <tr>
      <th>用户名</th>
      <th>商品名称</th>
      <th>交易方式</th>
      <th>联系方式</th>
      <th>发布时间</th>
      <th>操作</th>
     </tr>
    <c:forEach items="${pageInfo.list}" var="pageInfo">
     <tr>
      <td>${pageInfo.account}</td>
      <td>${pageInfo.goodsName}</td>
      <td>${pageInfo.tradeMode}</td>
      <td>${pageInfo.contact}</td>
      <td><fmt:formatDate value="${pageInfo.relaseTime}" pattern="yyyy-MM-dd"/></td>
      <%-- <td>${pageInfo.relaseTime}</td> --%>
      <td><a href="shopneedinfo?mseeageId=${pageInfo.mseeageId}">查看</a></td>
     </tr>
     </c:forEach>
    </table><!--vipOrder/-->
    <br />
  <!-- 显示分页信息块 -->
					<div class="scott">
						<!-- 显示分页信息文字 -->
						<div class="inHelp1">
						<h5>当前第${pageInfo.pageNum}页，总共${pageInfo.pages}页</h5>
						</div>
						<br>
						<!-- 显示分页条 -->
						<a href="shopneedmessage?pn=1">首页</a>
						<c:if test="${pageInfo.hasPreviousPage}">
						<a href="shopneedmessage?pn=${pageInfo.pageNum-1}">&laquo;</a>
						</c:if> 
						<c:forEach items="${pageInfo.navigatepageNums}" var="pageNum" >	
						<a href="shopneedmessage?pn=${pageNum}">${pageNum}</a> 
						</c:forEach>
						<c:if test="${pageInfo.hasNextPage}">
						<a href="shopneedmessage?pn=${pageInfo.pageNum+1}">&raquo;</a>
						</c:if>  
						<a href="shopneedmessage?pn=${pageInfo.pages}">尾页</a>
					</div>
    <br />
   </div><!--contRight/-->
   <div class="clears"></div>
  </div><!--cont/-->
  <div class="inHelp">
   <div class="inHLeft">
    <h4>帮助中心</h4>
    <ul class="inHeList">
     <li><a href="#">购物指南</a></li>
     <li><a href="#">支付方式</a></li>
     <li><a href="#">售后服务</a></li>
     <li><a href="#">企业简介</a></li>
     <div class="clears"></div>
    </ul><!--inHeList/-->
   </div><!--inHLeft/-->
   <div class="inHLeft">
    <h4>会员服务</h4>
    <ul class="inHeList">
     <li><a href="#">会员注册</a></li>
     <li><a href="#">会员登录</a></li>
     <li><a href="#">购物车</a></li>
     <li><a href="#">我的订单</a></li>
     <div class="clears"></div>
    </ul><!--inHeList/-->
   </div><!--inHLeft/-->
   <div class="inHRight">
    <h4>全国统一免费服务热线</h4>
    <div class="telBox">400-0000-0000</div>
    <div class="weibo">
    <wb:follow-button uid="2991975565" type="red_1" width="67" height="24" ></wb:follow-button>
    </div>
   </div><!--inHRight/-->
   <div class="clears"></div>
  </div><!--inHelp/-->
  <div class="footer">
   <p>
   <a href="#">进入17官网</a>&nbsp;|&nbsp;
   <a href="#">商城首页</a>&nbsp;|&nbsp;
   <a href="#">促销中心</a>&nbsp;|&nbsp;
   <a href="#">我的订单</a>&nbsp;|&nbsp;
   <a href="#">新闻动态</a>&nbsp;|&nbsp;
   <a href="#">会员中心</a>&nbsp;|&nbsp;
   <a href="#">帮助中心</a>
   </p>
  </div><!--footer/-->
 </div><!--mianCont/-->
 <a href="#" class="backTop">&nbsp;</a>
</body>
<script type="text/javascript"> 
	    function aClick () {  
	    	
	         alert("请先登录！");
	    }  
	</script>
</html>