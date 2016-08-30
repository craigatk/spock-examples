package example.ignore

import spock.lang.IgnoreRest
import spock.lang.Specification

class IgnoreRestSpec extends Specification {
    @IgnoreRest
    def 'this test is the only one in this class file that will execute'() {
        expect:
        assert true
    }

    def 'this test will get ignored'() {
        expect:
        assert false
    }
}
