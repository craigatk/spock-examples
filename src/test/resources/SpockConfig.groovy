import example.annotation.Slow

runner {
    if (System.properties['run.slow']) {
        include Slow
    }
}