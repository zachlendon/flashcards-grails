<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="mainMobile" />
    </head>
    <body>
	   	<content tag="buttons">
	    	<a href="${createLink(uri: '/')}" data-icon="back" data-direction="reverse" data-theme="d"><g:message code="default.home.label"/></a>
	   	</content>
	   	
	   	<content tag="title">
	    	<g:message code="default.header.lessons.label"/>
	   	</content>
       
		<g:if test="${lessons.size == 0}">
    		<p><strong><g:message code="default.lessons.empty"/>.</strong></p>
		</g:if>
		<g:if test="${lessons.size > 0}">
			<ul data-role="listview" data-theme="d">
       			<g:each in="${lessons}" status="i" var="lesson">
          			<li><a name="lesson-${lesson.id}" href="<g:createLink action="start" params="[title: lesson.name]" id="${lesson.id}" />" data-ajax='false'>${lesson.name}</a>  <span class="ui-li-count">${lesson.cards.size()}</span></li>
       			</g:each>
       		</ul>
      	</g:if>
    </body>
</html>
