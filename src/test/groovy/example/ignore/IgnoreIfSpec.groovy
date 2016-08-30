package example.ignore

import spock.lang.IgnoreIf
import spock.lang.Specification

class IgnoreIfSpec extends Specification {

    // To run this test, execute:
    // ./gradlew test -Drun.failing=true
    @IgnoreIf({ !Boolean.valueOf(properties['run.failing']) })
    def 'should only run if system property is set'() {
        expect:
        assert false
    }
}
