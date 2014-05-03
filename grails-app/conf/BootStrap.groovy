import co.gameit.user.Role
import co.gameit.user.User
import co.gameit.user.UserRole

class BootStrap {

    def init = { servletContext ->
        initializeRoles()
        initializeUsers()
        initializeUserRoles()
    }

    void initializeRoles() {
        [new Role(authority: 'ROLE_STUDENT'),
         new Role(authority: 'ROLE_TEACHER'),
         new Role(authority: 'ROLE_ADMIN')
        ].each {role ->
            role.save(flush: true)
        }
    }

    void initializeUsers() {
        [new User(username: 'testStudent',
                  password: 'secret',
                  firstName: 'Jim',
                  lastName: 'McStudent',
                  enabled: true,
                  accountExpired: false,
                  accountLocked: false,
                  passwordExpired: false),
         new User(username: 'testTeacher',
                  password: 'secret',
                  firstName: 'Jane',
                  lastName: 'McTeacher',
                  enabled: true,
                  accountExpired: false,
                  accountLocked: false,
                  passwordExpired: false),
         new User(username: 'testAdmin',
                  password: 'secret',
                  firstName: 'Anne',
                  lastName: 'McAdmin',
                  enabled: true,
                  accountExpired: false,
                  accountLocked: false,
                  passwordExpired: false)
        ].each {user ->
            user.save(flush: true, failOnError: true)
        }
    }

    void initializeUserRoles() {
        Role studentRole = Role.findByAuthority("ROLE_STUDENT")
        Role teacherRole = Role.findByAuthority("ROLE_TEACHER")
        Role adminRole = Role.findByAuthority("ROLE_ADMIN")
        User studentUser = User.findByUsername("testStudent")
        User teacherUser = User.findByUsername("testTeacher")
        User adminUser = User.findByUsername("testAdmin")
        [new UserRole(user: studentUser, role: studentRole),
         new UserRole(user: teacherUser, role: teacherRole),
         new UserRole(user: adminUser, role: adminRole)
        ].each {userRole ->
            userRole.save(flush: true)
        }
    }
}
