$(function () {
  'use strict';
  
  var images = [
	  {
		  src: 'static/images/khatob/1.jpg',
		  title: 'Разноцветные фонтаны'
	  },
	  {
		  src: 'static/images/khatob/2.jpg',
		  title: 'Вход в ХАТОБ'
	  },
	  {
		  src: 'static/images/khatob/3.jpg',
		  title: 'Волшебный вечер'
	  },
	  {
		  src: 'static/images/khatob/4.jpg',
		  title: 'Великолепие теплого денька'
	  },
	  {
		  src: 'static/images/khatob/5.jpg',
		  title: 'Зал ХАТОБА'
	  },
	  {
		  src: 'static/images/khatob/6.jpg',
		  title: 'Сказочные огни'
	  },
	  {
		  src: 'static/images/khatob/7.jpg',
		  title: 'Памятник «Музыка Н.Лысенко»'
	  },
	  {
		  src: 'static/images/khatob/8.jpg',
		  title: 'Зеркальная струя'
	  }
  ]

  onInit();
  
  function onInit() {  
	var carouselLinks = []
    var linksContainer = $('#links')
	
	  $.each(images, function(index, photo){
		  
			$('<a/>')
				.append($('<img style="height: 225px; width: 225px; margin-right: 2px">').prop('src', photo.src))
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

