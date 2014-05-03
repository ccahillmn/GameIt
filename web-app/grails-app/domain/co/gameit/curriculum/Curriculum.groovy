package co.gameit.curriculum

import co.gameit.task.Task

class Curriculum {

    String name
    String description
    static hasMany = [tasks: Task]

    static constraints = {
        name nullable: false, blank: false
        description nullable: false, blank: false
        tasks nullable: true, blank: true
    }

    String toString() {
        return name
    }
}
