$(function () {
  'use strict';
  
  var images = [
	  {
		  src: 'static/images/zoo/1.jpg',
		  title: 'Один из обитателей экопарка'
	  },
	  {
		  src: 'static/images/zoo/2.jpg',
		  title: 'Главный вход'
	  },
	  {
		  src: 'static/images/zoo/3.jpg',
		  title: 'Здесь всегда много людей'
	  },
	  {
		  src: 'static/images/zoo/4.jpg',
		  title: 'Красота и свежесть'
	  },
	  {
		  src: 'static/images/zoo/5.jpeg',
		  title: 'Черепашки'
	  },
	  {
		  src: 'static/images/zoo/6.jpg',
		  title: 'Уже друзья'
	  },
	  {
		  src: 'static/images/zoo/7.jpg',
		  title: 'Потрясающая клумба'
	  },
	  {
		  src: 'static/images/zoo/8.jpg',
		  title: 'Живая изгородь'
	  }
  ]

  onInit();
  
  function onInit() {  
	var carouselLinks = []
    var linksContainer = $('#links')
	
	  $.each(images, function(index, photo){
		  
			$('<a/>')
				.append($('<img style="height: 175px; width: 175px; margin-right: 2px">').prop('src', photo.src))
				.prop('href', photo.src)
				.prop('title', photo.title)
				.attr('data-gallery', '')
				.appendTo(linksContainer)
		  carouselLinks.push({
			href: photo.src,
			title: photo.title
		  })
		  
	  })

	blueimp.Gallery(carouselLinks, {
      container: '#blueimp-image-carousel',
      carousel: true
    })
  }
 });

