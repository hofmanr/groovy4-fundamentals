package module4

class switch_statement {
    static void main(String[] args) {
        def card = System.in.newReader().readLine()
        switch (card.trim().toLowerCase()) {
            case('visa'):
                println('Visa card found')
                break
            case('master'):
                println('Master card found')
                break
            case('amex'):
                println('Amex card found')
                break
            case('discover'):
                println('Discover card found')
                break
            default:
                println('Unrecognized card')
        }
    }
}
