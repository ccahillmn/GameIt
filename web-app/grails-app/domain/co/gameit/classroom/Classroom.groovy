package co.gameit.classroom

import co.gameit.curriculum.Curriculum
import co.gameit.user.User

class Classroom {

    Integer grade
    String subject
    static hasMany = [students: User,
                      curricula: Curriculum]
    static belongsTo = [teacher: User]

    Date dateCreated
    Date lastUpdated

    static constraints = {
        grade nullable: false, blank: false
        subject nullable: false, blank: false
        students nullable: true, blank: true
        curricula nullable: false, blank: false
    }

    String toString() {
        return "$subject, $grade grade"
    }
}
