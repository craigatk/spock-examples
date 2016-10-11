import example.Slow
import example.Smoke
import spock.lang.Specification

runner {
    if (System.properties['slow']) {
        include Slow
    } else {
        exclude Slow
    }

    if (System.properties['smoke']) {
        // Only run the tests with @Smoke annotation
        include Smoke

        // Exclude all other tests
        exclude Specification
    }
}