<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/blueimp-gallery.css">
<link rel="stylesheet" href="css/blueimp-gallery-indicator.css">
<link rel="stylesheet" href="css/blueimp-gallery-video.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="static/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="static/bootstrap-responsive.css" rel="stylesheet">
<link href="static/bootstrap.css" rel="stylesheet">
<link href="static/basic.css" rel="stylesheet">


<style>
body {
  text-align: center;
 }

 #left { text-align: left; }
 #right { text-align: right; }
  
</style>
</head>

<body>

	<%@ include file="/static/jspf/header.jspf"%>

	<div class="container">
		<div class="hero-unit">
			<div id="left">
				<h2>ХАТОБ</h2>
				<br></div>
				<div id="links" class="links"></div>

				<div id="blueimp-gallery" class="blueimp-gallery">
					<div class="slides"></div>
					<h3 class="title"></h3>
					<a class="prev">‹</a> <a class="next">›</a> <a class="close">×</a>
					<a class="play-pause"></a>
					<ol class="indicator"></ol>

			</div>

			<p style="clear: both"></p>
			<div id="left">
				<h3>
					<br> Описание:
				</h3>

				<p>Харьковский национальный академический театр оперы и балета
					им. Н.В.Лысенка, или более известный в Харькове, как ХАТОБ,
					поистине считается «жемчужиной», которую стараются увидеть и
					посетить все туристы и приезжие города. Основан ХАТОБ был в 1925
					году на базе, существовавшей тогда оперной антрепризы, которая
					впервые за всю историю украинской культуры поставила оперы Н.В.
					Лысенка: «Рождественская ночь» и «Утопленница», по мотивам
					произведений Н.В. Гоголя.</p>
			</div>
			<br>
			<div align="right">
				<a href="http://lifekharkov.com/xarkovskij-gorod-masterov/"><em>Источник</em></a>
			</div>




		</div>
		<!-- end of the hero-unit-->
		<%@ include file="/static/jspf/footer.jspf"%>
	</div>
	<!-- end of the container-->
	<script src="js/blueimp-helper.js"></script>
	<script src="js/blueimp-gallery.js"></script>
	<script src="js/blueimp-gallery-fullscreen.js"></script>
	<script src="js/blueimp-gallery-indicator.js"></script>
	<script src="js/blueimp-gallery-youtube.js"></script>
	<script src="js/vendor/jquery.js"></script>
	<script src="js/jquery.blueimp-gallery.js"></script>
	<script src="js/demo/demoKHATOB.js"></script>
</body>
</html>
