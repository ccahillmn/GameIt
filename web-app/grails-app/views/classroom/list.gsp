
<%@ page import="co.gameit.classroom.Classroom" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'classroom.label', default: 'Classroom')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-classroom" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-classroom" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="grade" title="${message(code: 'classroom.grade.label', default: 'Grade')}" />
					
						<g:sortableColumn property="subject" title="${message(code: 'classroom.subject.label', default: 'Subject')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'classroom.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'classroom.lastUpdated.label', default: 'Last Updated')}" />
					
						<th><g:message code="classroom.teacher.label" default="Teacher" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${classroomInstanceList}" status="i" var="classroomInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${classroomInstance.id}">${fieldValue(bean: classroomInstance, field: "grade")}</g:link></td>
					
						<td>${fieldValue(bean: classroomInstance, field: "subject")}</td>
					
						<td><g:formatDate date="${classroomInstance.dateCreated}" /></td>
					
						<td><g:formatDate date="${classroomInstance.lastUpdated}" /></td>
					
						<td>${fieldValue(bean: classroomInstance, field: "teacher")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${classroomInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
