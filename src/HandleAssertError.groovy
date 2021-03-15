import groovy.util.logging.*

@Log
class HandleAssertError {
    static void main(String[] args) {
        try {
            assert true == false : 'true cannot be false'
        } catch(AssertionError err) {
            log.severe "An assertion failed ${err}"
        }
    }
}

