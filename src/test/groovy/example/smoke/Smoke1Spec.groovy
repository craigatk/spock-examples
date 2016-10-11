package example.smoke

import example.Smoke
import spock.lang.Specification

class Smoke1Spec extends Specification {
    // To run this test, execute:
    // ./gradlew test -Dsmoke=true
    //
    // See test/resources/SpockConfig.groovy
    @Smoke
    def 'should run this smoke test'() {
        expect:
        assert true
    }
}
