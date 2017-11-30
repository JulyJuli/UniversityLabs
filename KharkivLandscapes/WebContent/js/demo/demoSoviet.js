$(function () {
  'use strict';
  
  var images = [
	  {
		  src: 'static/images/sov/1.jpg',
		  title: 'Мост влюбленных'
	  },
	  {
		  src: 'static/images/sov/2.jpg',
		  title: 'Набережная'
	  },
	  {
		  src: 'static/images/sov/3.jpg',
		  title: 'Мост влюбленных'
	  },
	  {
		  src: 'static/images/sov/4.jpg',
		  title: 'Мост влюбленных'
	  },
	  {
		  src: 'static/images/sov/5.jpg',
		  title: 'Огни сказочного вечера'
	  },
	  {
		  src: 'static/images/sov/6.jpg',
		  title: 'Цветы - украшение сквера'
	  },
	  {
		  src: 'static/images/sov/7.jpg',
		  title: 'Набережная с высоты птичьего полета'
	  },
	  {
		  src: 'static/images/sov/8.jpg',
		  title: 'Набережная с высоты птичьего полета'
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

