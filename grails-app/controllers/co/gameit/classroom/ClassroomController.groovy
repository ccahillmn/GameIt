package co.gameit.classroom

import org.springframework.dao.DataIntegrityViolationException

class ClassroomController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [classroomInstanceList: Classroom.list(params), classroomInstanceTotal: Classroom.count()]
    }

    def create() {
        [classroomInstance: new Classroom(params)]
    }

    def save() {
        def classroomInstance = new Classroom(params)
        if (!classroomInstance.save(flush: true)) {
            render(view: "create", model: [classroomInstance: classroomInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'classroom.label', default: 'Classroom'), classroomInstance.id])
        redirect(action: "show", id: classroomInstance.id)
    }

    def show(Long id) {
        def classroomInstance = Classroom.get(id)
        if (!classroomInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "list")
            return
        }

        [classroomInstance: classroomInstance]
    }

    def edit(Long id) {
        def classroomInstance = Classroom.get(id)
        if (!classroomInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "list")
            return
        }

        [classroomInstance: classroomInstance]
    }

    def update(Long id, Long version) {
        def classroomInstance = Classroom.get(id)
        if (!classroomInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (classroomInstance.version > version) {
                classroomInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'classroom.label', default: 'Classroom')] as Object[],
                          "Another user has updated this Classroom while you were editing")
                render(view: "edit", model: [classroomInstance: classroomInstance])
                return
            }
        }

        classroomInstance.properties = params

        if (!classroomInstance.save(flush: true)) {
            render(view: "edit", model: [classroomInstance: classroomInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'classroom.label', default: 'Classroom'), classroomInstance.id])
        redirect(action: "show", id: classroomInstance.id)
    }

    def delete(Long id) {
        def classroomInstance = Classroom.get(id)
        if (!classroomInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "list")
            return
        }

        try {
            classroomInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'classroom.label', default: 'Classroom'), id])
            redirect(action: "show", id: id)
        }
    }
}
