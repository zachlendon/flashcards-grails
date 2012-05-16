<html>
<head>
	<meta name='layout' content='main'/>
	<title><g:message code="springSecurity.login.title"/></title>
</head>

<body>
	<h1 id="loginHeader"><g:message code="springSecurity.login.header"/></h1>
	
	<g:if test='${flash.message}'>
		<div class='login_message'>${flash.message}</div>
	</g:if>
	
	<form action='${postUrl}' method='POST' id='loginForm' autocomplete='off'>
		<div class="clearfix">
			<label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
			<div class="input">
				<input type='text' class='text_' name='j_username' id='username'/>
			</div>
		</div>
	
		<div class="clearfix">
			<label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
			<div class="input">
				<input type='password' class='text_' name='j_password' id='password'/>
			</div>
		</div>
	
		<div class="clearfix">
			<label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
			<div class="input">
				<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
			</div>
		</div>
	
		<div class="actions">
			<input class="btn primary" type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
		</div>
	</form>
<script type='text/javascript'>
	<!--
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})();
	// -->
</script>
</body>
</html>
