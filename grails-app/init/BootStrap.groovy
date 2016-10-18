import com.test.Organization
import com.test.User

class BootStrap {

    def init = { servletContext ->
        Organization organizationInstance = Organization.findOrSaveByName("Grails")

        User userInstance = User.findByEmail("john@example.com")
        if (!userInstance) {
            userInstance = new User([email: "john@example.com", name: "John", organization: organizationInstance])
            userInstance.save(flush: true)
        }
    }

    def destroy = {
    }
}
