<html>
    <head>
        <title>Welcome to Flash Cards</title>
        <meta name="layout" content="mainMobile" />
    </head>
    <body>

        <sec:ifLoggedIn>

            <content tag="buttons">
                <a name="logout" href="${createLink(uri: '/logout')}" data-direction="forward" data-theme="d"><g:message code="button.logout.label"/></a>
            </content>
        </sec:ifLoggedIn>

        <sec:ifNotLoggedIn>
            <content tag="buttons">
                <a name="login" href="${createLink(uri: '/login/auth')}" data-direction="forward" data-theme="d"><g:message code="button.login.label"/></a>
            </content>
        </sec:ifNotLoggedIn>

    	<ul data-role="listview" data-theme="d">
    		<li data-role="list-divider"><g:message code="default.menu.header" /></li>
			<li><g:link controller="lessonMobile" action="lessons" class="list lessons"><g:message code="default.button.lessons.label" /></g:link></li>
		</ul>
		
		<content tag="footer">
			<div data-role="footer" data-position="fixed" data-theme="c">
				<h6><a href="http://bit.ly/gh-fc">GitHub</a></h6>
			</div>
		</content>
    </body>
</html>
