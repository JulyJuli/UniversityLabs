$(function () {
  'use strict';
  
  var images = [
	  {
		  src: 'static/images/parkSh/1.jpg',
		  title: 'Каскад'
	  },
	  {
		  src: 'static/images/parkSh/2.jpg',
		  title: 'Вход в ХАТОБ'
	  },
	  {
		  src: 'static/images/parkSh/3.jpg',
		  title: 'Светящийся музыкальный фонтан'
	  },
	  {
		  src: 'static/images/parkSh/4.jpg',
		  title: 'Памятник футбольному мячу'
	  },
	  {
		  src: 'static/images/parkSh/5.jpg',
		  title: 'Памятник 50 параллель'
	  },
	  {
		  src: 'static/images/parkSh/6.jpg',
		  title: 'Весна на главной аллее'
	  },
	  {
		  src: 'static/images/parkSh/7.jpg',
		  title: 'Памятник Т.Г.Шевченко'
	  },
	  {
		  src: 'static/images/parkSh/8.jpg',
		  title: 'Великолепный фонтан'
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

