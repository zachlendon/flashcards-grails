<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title><g:message code="default.list.label" args="[entityName]" />
</title>
</head>
<body>
	<div class="body">
		<h1 class="mainHeader" class="mainHeader">
			<g:message code="default.start.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message">
				${flash.message}
			</div>
		</g:if>
		<table class="zebra-striped">
			<thead>
				<tr>
					<th><g:message code="default.id.label" /></th>
					<th><g:message code="default.name.label" /></th>
				</tr>
			</thead>
			<tbody>
				<g:each in="${lessons}" var="lesson">
					<tr>
						<td>
							${lesson.id}
						</td>
						<td><g:link name="lesson-${lesson.id}" action="start" id="${lesson.id}">
								${lesson.name}
							</g:link></td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</div>
</body>
</html>
