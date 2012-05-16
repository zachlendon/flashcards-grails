<!DOCTYPE html>
<html>
<head>
<title><g:layoutTitle default="Flash Cards" /></title>
<link rel="stylesheet" href="${resource(dir:'css',file:'bootstrap-1.2.0.css')}" />
<link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
<link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
<g:layoutHead />

</head>
<body>
	<div class="topbar-wrapper">
	    <div class="topbar">
	      <div class="topbar-inner">
	        <div class="container">
	          <h3>
				<a href="${createLink(uri: '/')}"><g:message code="defullt.application.title" /></a>
			  </h3>
			<ul class="nav">
				<sec:access expression="hasRole('ROLE_ADMIN')">
					<li><g:link controller="card" class="list"><g:message code="button.card.label" /></g:link></li>
					<li><g:link controller="lesson" class="list"><g:message code="button.lesson.label" /></g:link></li>
				</sec:access>
				
				<sec:ifLoggedIn>
					<li><g:link controller='logout'><g:message code="button.logout.label" /></g:link></li>
				</sec:ifLoggedIn>
	
				<sec:ifNotLoggedIn>
					<li><g:link controller='login' action='auth' name="login"><g:message code="button.login.label" /></g:link></li>
				</sec:ifNotLoggedIn>
				
				<sec:access expression="hasRole('ROLE_ADMIN')">
					<ul class="nav secondary-nav right">
						<li class="dropdown">
							<a href="#" class="dropdown-toggle">Admin</a>
							<ul class="dropdown-menu">
								<li><g:link mapping="exportlessons" class="export"><g:message code="button.exporLesson.label" /></g:link></li>
								<li><g:link controller="lesson" action="upload" class="import"><g:message code="button.importLesson.label" /></g:link></li>
              				</ul>
						</li>
					</ul>
				</sec:access>
				
			  </ul>
	        </div>
	      </div><!-- /topbar-inner -->
	    </div><!-- /topbar -->
	  </div>
	  <div class="container">
		<g:layoutBody />
		
		<footer> 
        	<p>&copy; <g:link base="http://kgrodzicki.com">kgrodzicki.com</g:link>  2011 | <g:link base="https://github.com/kgrodzicki/flashcards-grails">Fork me on github</g:link></p> 
      	</footer> 
	</div>
	
  	<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary -->
  	<script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
	<script>window.jQuery || document.write("<script src='${resource(dir:'mobile/js/libs',file:'jquery-1.6.2.min.js')}'>\x3C/script>")</script>
	<g:javascript library="application" />
	
	<script>
	    	var _gaq=[["_setAccount","UA-1387377-19"],["_trackPageview"]];
	    	(function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];g.async=1;
	    	g.src=("https:"==location.protocol?"//ssl":"//www")+".google-analytics.com/ga.js";
	    	s.parentNode.insertBefore(g,s)}(document,"script"));
	</script>
</body>
</html>