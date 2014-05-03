package co.gameit.task

class Task {

    String name
    String description

    Date dateCreated
    Date lastUpdated

    static constraints = {
        name nullable: false, blank: false
        description nullable: false, blank: false
    }

    String toString() {
        return name
    }
}
