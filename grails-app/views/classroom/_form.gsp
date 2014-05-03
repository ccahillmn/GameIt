<%@ page import="co.gameit.classroom.Classroom" %>



<div class="fieldcontain ${hasErrors(bean: classroomInstance, field: 'grade', 'error')} required">
	<label for="grade">
		<g:message code="classroom.grade.label" default="Grade" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="grade" type="number" value="${classroomInstance.grade}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: classroomInstance, field: 'subject', 'error')} required">
	<label for="subject">
		<g:message code="classroom.subject.label" default="Subject" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="subject" required="" value="${classroomInstance?.subject}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: classroomInstance, field: 'students', 'error')} ">
	<label for="students">
		<g:message code="classroom.students.label" default="Students" />
		
	</label>
	<g:select name="students" from="${co.gameit.user.User.list()}" multiple="multiple" optionKey="id" size="5" value="${classroomInstance?.students*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: classroomInstance, field: 'curricula', 'error')} required">
	<label for="curricula">
		<g:message code="classroom.curricula.label" default="Curricula" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="curricula" from="${co.gameit.curriculum.Curriculum.list()}" multiple="multiple" optionKey="id" size="5" required="" value="${classroomInstance?.curricula*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: classroomInstance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="classroom.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="teacher" name="teacher.id" from="${co.gameit.user.User.list()}" optionKey="id" required="" value="${classroomInstance?.teacher?.id}" class="many-to-one"/>
</div>

