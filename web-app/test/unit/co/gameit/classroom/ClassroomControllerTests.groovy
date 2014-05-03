package co.gameit.classroom



import org.junit.*
import grails.test.mixin.*

@TestFor(ClassroomController)
@Mock(Classroom)
class ClassroomControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/classroom/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.classroomInstanceList.size() == 0
        assert model.classroomInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.classroomInstance != null
    }

    void testSave() {
        controller.save()

        assert model.classroomInstance != null
        assert view == '/classroom/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/classroom/show/1'
        assert controller.flash.message != null
        assert Classroom.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/classroom/list'

        populateValidParams(params)
        def classroom = new Classroom(params)

        assert classroom.save() != null

        params.id = classroom.id

        def model = controller.show()

        assert model.classroomInstance == classroom
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/classroom/list'

        populateValidParams(params)
        def classroom = new Classroom(params)

        assert classroom.save() != null

        params.id = classroom.id

        def model = controller.edit()

        assert model.classroomInstance == classroom
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/classroom/list'

        response.reset()

        populateValidParams(params)
        def classroom = new Classroom(params)

        assert classroom.save() != null

        // test invalid parameters in update
        params.id = classroom.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/classroom/edit"
        assert model.classroomInstance != null

        classroom.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/classroom/show/$classroom.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        classroom.clearErrors()

        populateValidParams(params)
        params.id = classroom.id
        params.version = -1
        controller.update()

        assert view == "/classroom/edit"
        assert model.classroomInstance != null
        assert model.classroomInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/classroom/list'

        response.reset()

        populateValidParams(params)
        def classroom = new Classroom(params)

        assert classroom.save() != null
        assert Classroom.count() == 1

        params.id = classroom.id

        controller.delete()

        assert Classroom.count() == 0
        assert Classroom.get(classroom.id) == null
        assert response.redirectedUrl == '/classroom/list'
    }
}
