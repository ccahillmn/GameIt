package co.gameit.curriculum

import grails.plugins.springsecurity.Secured
import org.springframework.dao.DataIntegrityViolationException

class CurriculumController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    @Secured(["ROLE_TEACHER"])
    def index() {
        redirect(action: "list", params: params)
    }

    @Secured(["ROLE_TEACHER"])
    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [curriculumInstanceList: Curriculum.list(params), curriculumInstanceTotal: Curriculum.count()]
    }

    @Secured(["ROLE_TEACHER"])
    def create() {
        [curriculumInstance: new Curriculum(params)]
    }

    @Secured(["ROLE_TEACHER"])
    def save() {
        def curriculumInstance = new Curriculum(params)
        if (!curriculumInstance.save(flush: true)) {
            render(view: "create", model: [curriculumInstance: curriculumInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), curriculumInstance.id])
        redirect(action: "show", id: curriculumInstance.id)
    }

    @Secured(["ROLE_TEACHER"])
    def show(Long id) {
        def curriculumInstance = Curriculum.get(id)
        if (!curriculumInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "list")
            return
        }

        [curriculumInstance: curriculumInstance]
    }

    @Secured(["ROLE_TEACHER"])
    def edit(Long id) {
        def curriculumInstance = Curriculum.get(id)
        if (!curriculumInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "list")
            return
        }

        [curriculumInstance: curriculumInstance]
    }

    @Secured(["ROLE_TEACHER"])
    def update(Long id, Long version) {
        def curriculumInstance = Curriculum.get(id)
        if (!curriculumInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (curriculumInstance.version > version) {
                curriculumInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'curriculum.label', default: 'Curriculum')] as Object[],
                          "Another user has updated this Curriculum while you were editing")
                render(view: "edit", model: [curriculumInstance: curriculumInstance])
                return
            }
        }

        curriculumInstance.properties = params

        if (!curriculumInstance.save(flush: true)) {
            render(view: "edit", model: [curriculumInstance: curriculumInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), curriculumInstance.id])
        redirect(action: "show", id: curriculumInstance.id)
    }

    @Secured(["ROLE_TEACHER"])
    def delete(Long id) {
        def curriculumInstance = Curriculum.get(id)
        if (!curriculumInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "list")
            return
        }

        try {
            curriculumInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'curriculum.label', default: 'Curriculum'), id])
            redirect(action: "show", id: id)
        }
    }
}
