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
</head>
<style>
body {
	text-align: center;
}

#left {
	text-align: left;
}

#right {
	text-align: right;
}
</style>
<body>



	<%@ include file="/static/jspf/header.jspf"%>
	<div class="container">
		<div class="hero-unit">
			<div id="left">
				<h2>Сквер Стрелка</h2>
				<br>
			</div>
			<div id="links" class="links"></div>

			<div id="blueimp-gallery" class="blueimp-gallery">
				<div class="slides"></div>
				<h3 class="title"></h3>
				<a class="prev">‹</a> <a class="next">›</a> <a class="close">×</a> <a
					class="play-pause"></a>
				<ol class="indicator"></ol>
			</div>



			<p style="clear: both"></p>
			<div id="left">
				<h3>
					<br> Описание:
				</h3>

				<p>Одним из любимых мест горожан является сквер «Стрелка». Это
					место расположено в дельте двух главных рек города – Харьков и
					Лопань. Многочисленные деревья создают приятную тень и отгораживают
					от шума большого города.Здесь приятно проводить время вместе с
					близкими и друзьями, заводить новые знакомства. Часто в сквере
					играет живая музыка. Тогда это место приобретает особый шарм.
					Вечером сквер обволакивает романтичный туман уличных фонарей.Это
					одно из красивейших мест Харькова!</p>
			</div>
			<br>
			<div align="right">
				<a
					href="https://ua.igotoworld.com/ru/poi_object/86043_skver-strelka.htm"><em>Источник</em></a>
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
	<script src="js/demo/demoSoviet.js"></script>
</body>
</html>
