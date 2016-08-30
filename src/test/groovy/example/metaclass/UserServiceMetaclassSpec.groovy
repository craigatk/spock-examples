package example.metaclass

import example.UserService
import spock.lang.Specification
import spock.lang.Stepwise
import spock.util.mop.ConfineMetaClassChanges

@ConfineMetaClassChanges([UserService])
@Stepwise // So the test methods run in the order they are the file
class UserServiceMetaclassSpec extends Specification {
    def 'add a new field to the metaclass'() {
        when:
        UserService.metaClass.newField = true

        then:
        assert new UserService().newField
    }

    def 'verify the field we added above is still there'() {
        expect:
        assert new UserService().newField
    }
}
