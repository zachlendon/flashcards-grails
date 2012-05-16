<!doctype html>
<!-- Conditional comment for mobile ie7 http://blogs.msdn.com/b/iemobile/ -->
<!-- Appcache Facts http://appcachefacts.info/ -->
<!--[if IEMobile 7 ]>    <html class="no-js iem7" manifest="default.appcache?v=1"> <![endif]-->
<!--[if (gt IEMobile 7)|!(IEMobile)]><!--> <html class="no-js" manifest="default.appcache?v=1"> <!--<![endif]-->

<head>
  <meta charset="utf-8">

  <title><g:layoutTitle default="Flash Cards" /></title>
  <meta name="description" content="">
  <meta name="author" content="">
  
  <!-- Mobile viewport optimization http://goo.gl/b9SaQ -->
  <meta name="HandheldFriendly" content="True">
  <meta name="MobileOptimized" content="320"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
  <!-- Home screen icon  Mathias Bynens http://goo.gl/6nVq0 -->
  <!-- For iPhone 4 with high-resolution Retina display: -->
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${resource(dir:'mobile/img/h',file:'apple-touch-icon.png')}">
  <!-- For first-generation iPad: -->
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${resource(dir:'mobile/img/m',file:'apple-touch-icon.png')}">
  <!-- For non-Retina iPhone, iPod Touch, and Android 2.1+ devices: -->
  <link rel="apple-touch-icon-precomposed" href="${resource(dir:'mobile/img/l',file:'apple-touch-icon-precomposed.png')}">
  <!-- For nokia devices: -->
  <link rel="shortcut icon" href="${resource(dir:'mobile/img/l',file:'apple-touch-icon.png')}">
  
  <!--iOS web app, deletable if not needed -->
  <!--<meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <link rel="apple-touch-startup-image" href="${resource(dir:'mobile/img/l',file:'splash.png')}">-->
  
  <!-- Mobile IE allows us to activate ClearType technology for smoothing fonts for easy reading -->
  <meta http-equiv="cleartype" content="on">
	
	<!-- more tags for your 'head' to consider https://gist.github.com/849231 -->
  
  <!-- Main Stylesheet -->
  <link rel="stylesheet" href="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.css" />
  
  <!-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects -->
  <script src="${resource(dir:'mobile/js/libs',file:'modernizr-custom.js')}"></script>
</head>

<body>
	<!-- Start of first page -->
	<div data-role="page" data-position="fixed">
		<div data-role="header">
			<g:pageProperty name="page.buttons" />
			<h1 class="mainHeader"><g:pageProperty name="page.title" default="Flash Cards" /></h1>
		</div>
		<!-- /header -->

		<div data-role="content" style="<g:pageProperty name="page.style" />">
			<g:layoutBody />
		</div>
		<!-- /content -->
		
		<g:pageProperty name="page.footer"/>
		<!-- /footer -->
	</div>
	<!-- /page -->

  <!-- JavaScript at the bottom for fast page loading -->

  <!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary -->
  <script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
  <script>window.jQuery || document.write("<script src='${resource(dir:'mobile/js/libs',file:'jquery-1.6.2.min.js')}'>\x3C/script>")</script>
  <script src="http://code.jquery.com/mobile/1.0b3/jquery.mobile-1.0b3.min.js"></script>
  <g:pageProperty name="page.customScripts" />
  
  <!-- scripts concatenated and minified via ant build script -->
  <script src="${resource(dir:'mobile/js/mylibs',file:'helper.js')}"></script>
  <!-- end concatenated and minified scripts-->
  
  <script>
    // iPhone Scale Bug Fix, read this when using http://www.blog.highub.com/mobile-2/a-fix-for-iphone-viewport-scale-bug/
    MBP.scaleFix();
    
    // Media Queries Polyfill https://github.com/shichuan/mobile-html5-boilerplate/wiki/Media-Queries-Polyfill
    yepnope({
      test : Modernizr.mq('(min-width)'),
      nope : ['${resource(dir:'mobile/js/libs',file:'respond.min.js')}']
    });
  </script>
  
  <!-- Debugger - remove for production -->
  <!-- <script src="https://getfirebug.com/firebug-lite.js"></script> -->
  
  <!-- mathiasbynens.be/notes/async-analytics-snippet Change UA-XXXXX-X to be your site's ID -->
  <script>
    var _gaq=[["_setAccount","UA-1387377-19"],["_trackPageview"]];
    (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];g.async=1;
    g.src=("https:"==location.protocol?"//ssl":"//www")+".google-analytics.com/ga.js";
    s.parentNode.insertBefore(g,s)}(document,"script"));
  </script>

</body>
</html>
