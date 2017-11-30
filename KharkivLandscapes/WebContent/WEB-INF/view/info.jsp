<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>${myapp.title}</title>
<meta charset="utf8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap -->

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="static/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="static/bootstrap-responsive.css" rel="stylesheet">
<link href="static/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="static/basic.css" rel="stylesheet">

</head>
<body>

	<%@ include file="/static/jspf/header.jspf"%>
	<div class="container">

		<div class="hero-unit">
			<div>
				<h2 class="text-center">
					<em>${myapp.title}</em>
				</h2>
			</div>
			<br />

			<p>Если Вы увидели фото, владельцем которого являетесь, напишите
				сообщение на email, указанный в контактной информации. Мы обязательно подпишем снимок или удалим - на
				Ваш выбор. Мы не заинтересованы в нарушении авторского права и,
				ни в коем случае, не хотим совершать противозаконные действия.</p>
		</div>
		<!-- end of the hero-unit-->

		<%@ include file="/static/jspf/footer.jspf"%>
	</div>

</body>

</html>
