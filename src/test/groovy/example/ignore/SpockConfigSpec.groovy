package example.ignore

import example.annotation.Slow
import spock.lang.Specification

class SpockConfigSpec extends Specification {
    // To run this test, execute:
    // ./gradlew test -Drun.slow=true
    //
    // See test/resources/SpockConfig.groovy
    @Slow
    def 'controlled by SpockConfig.groovy - only run this test if system property set'() {
        given:
        println "Starting slow test"

        when:
        sleep(5000)

        then:
        assert true

        cleanup:
        println "Finished slow test"
    }
}
