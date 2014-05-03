<%@ page import="co.gameit.curriculum.Curriculum" %>



<div class="fieldcontain ${hasErrors(bean: curriculumInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="curriculum.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${curriculumInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: curriculumInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="curriculum.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${curriculumInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: curriculumInstance, field: 'tasks', 'error')} ">
	<label for="tasks">
		<g:message code="curriculum.tasks.label" default="Tasks" />
		
	</label>
	<g:select name="tasks" from="${co.gameit.task.Task.list()}" multiple="multiple" optionKey="id" size="5" value="${curriculumInstance?.tasks*.id}" class="many-to-many"/>
</div>

