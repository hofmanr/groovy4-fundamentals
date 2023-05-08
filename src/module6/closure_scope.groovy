package module6

class closure_scope {
    static String masterCard = 'Master'

    static void main(String[] args) {
        def processedCard = 'Visa'
        def mainCard = 'Amex'

        def process = { String cardType ->
            def processCard = 'Discover'
            println this
            println owner
            println delegate
            println "Master card ${masterCard} is the same as ${this.masterCard}"
            println "Main card ${mainCard}"
            println "Process card ${processCard}"
            def sub_process = {
                println "$it found"
                println this
                println owner
                println delegate
                println "Master card ${masterCard}"
                println "Main card $mainCard"
                println "ProcessCard card ${processCard} is the same as ${this.masterCard}"
            }
            switch (cardType) {
                case ('Visa'):
                    sub_process('Visa')
                    break
                case ('Amex'):
                    sub_process('Amex')
                    break
                default:
                    sub_process('Unrecognized card type')
            }
        }
        process(processedCard)

        def testDelegate = {
            // deleteCharAt is a method in StringBuffer Class; it returns a StringBuffer
            deleteCharAt(10) // method in this class
            delegate.deleteCharAt(10) // explicitly call delegate method
        }
        // println testDelegate() does not work because deleteCharAt is unknown

        StringBuffer build = new StringBuffer("This is a test Strings")
        println(build.toString())
        build.deleteCharAt(21)
        println(build.toString())
        testDelegate.delegate = build
        println testDelegate()

        testDelegate.setResolveStrategy(Closure.DELEGATE_FIRST)
        // is the same as 'testDelegate.resolveStrategy = Closure.DELEGATE_FIRST'
        println testDelegate()

    }

    static String deleteCharAt(int i) {
        println "This is a custom deleteCharAt method"
    }
}
