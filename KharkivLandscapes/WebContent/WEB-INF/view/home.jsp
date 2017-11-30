<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> ${myapp.title} </title>
	<meta charset="utf8">  
  	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  
  <!-- Bootstrap -->

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="static/bootstrap.min.css" rel="stylesheet" media="screen">
  <link href="static/bootstrap-responsive.css" rel="stylesheet">
  <link href="static/bootstrap.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="static/basic.css" rel="stylesheet">
<style>

 #left { text-align: left; }
 #right { text-align: right; }

</style>
</head>
<body>

<%@ include file="/static/jspf/header.jspf"%>
  
  <div class="container">

  <div class="hero-unit">
  <div>
  <h2 class="text-center"><em>${myapp.title}</em></h2> </div>
  <br/>
  
  <div class="row">
    <div class="col-xs-4"><a href="${pageContext.request.contextPath}/khatob">
					ХАТОБ<br>
					<img src="static/images/khatobK.jpg" class="thumb">
				</a></div>
    <div class="col-xs-4"><a href="${pageContext.request.contextPath}/parkG">
					Парк Горького<br>
					<img src="static/images/parkGK.jpg" class="thumb">
				</a></div>
    <div class="col-xs-4"><a href="${pageContext.request.contextPath}/parkSh">
					Парк Шевченко<br>
					<img src="static/images/parkShK.jpg" class="thumb">
				</a></div>
    </div>
    <br>
    <div class="row">
    <div class="col-xs-4 col-sm-offset-2""><a href="${pageContext.request.contextPath}/sovet">
					Сквер Стрелка<br>
					<img src="static/images/sovK.jpg" class="thumb">
				</a></div>
     <div class="col-xs-4" ><a href="${pageContext.request.contextPath}/zoo">
					Фельдман Экопарк<br>
					<img src="static/images/zooK.jpg" class="thumb">
				</a></div>
  </div>
	
		<p style="clear:both"></p>
 

  </div> <!-- end of the hero-unit-->

 <%@ include file="/static/jspf/footer.jspf"%>
  </div>
 
</body>

</html>
