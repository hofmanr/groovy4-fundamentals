package module6

class closure_parameters {
    static void main(String[] args) {
        def cardDetails1 = { firstName, lastName ->
            println("This card is owned by $firstName $lastName")
        }
        cardDetails1.call("Rinus", "Hofman")
        cardDetails1("Rinus", "Hofman")

        // Typed
        Closure cardDetails2 = { firstName, lastName ->
            println("This card is owned by $firstName $lastName")
        }
        cardDetails2("Vincent", "van Dijk")

        // Default values
        def cardDetails3 = { firstName, lastName = "D" ->
            println("This card is owned by $firstName $lastName")
        }
        cardDetails3("Theo")

        // Multiple arguments
        def cardDetails4 = { String... arg ->
            println arg.join(' ')
        }
        cardDetails4("Johannes", "D")
        cardDetails4("Johannes", "Paulus", "D")

        // Return values
        def cardDetails5 = { String... arg ->
            arg.join(' ')
        }
        println cardDetails5("Anna", "Catharina", "D")

        // Return statement returns from the current iteration
        def cardLength = [12, 13, 14, 15, 16]
        cardLength.each {
            if (it % 2 == 0) {
                println("Even number digits ${it*2}")
                return
                println('After return') // never executed
            } else {
                println("Odd number of digits $it")
                return
            }
        }
    }
}
