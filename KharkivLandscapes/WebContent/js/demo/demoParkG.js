$(function () {
  'use strict';
  
  var images = [
	  {
		  src: 'static/images/parkG/1.jpg',
		  title: 'Фонтан желаний'
	  },
	  {
		  src: 'static/images/parkG/2.jpg',
		  title: 'Сказочное колесо обозрния'
	  },
	  {
		  src: 'static/images/parkG/3.jpg',
		  title: 'Золотые руки мастеров'
	  },
	  {
		  src: 'static/images/parkG/4.jpg',
		  title: 'Канатная дорога'
	  },
	  {
		  src: 'static/images/parkG/5.jpg',
		  title: 'Главная аллея'
	  },
	  {
		  src: 'static/images/parkG/6.jpg',
		  title: 'Сказочный аттракцион'
	  },
	  {
		  src: 'static/images/parkG/7.jpg',
		  title: 'Огни вечернего парка'
	  },
	  {
		  src: 'static/images/parkG/8.jpg',
		  title: 'Зеркальная струя'
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

