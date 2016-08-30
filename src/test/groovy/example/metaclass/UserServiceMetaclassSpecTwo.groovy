package example.metaclass

import example.UserService
import spock.lang.Specification

class UserServiceMetaclassSpecTwo extends Specification {
    def 'verify metaclass field not present here'() {
        when:
        new UserService().newField

        then:
        thrown(MissingPropertyException)
    }
}
