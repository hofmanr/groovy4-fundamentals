package module5

class exception_handling {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Discover', 'Diners']
        //println(cards[4].size())

        println('-------------------------------')
        try {
            println(cards[4].size())
        } catch (NullPointerException e) {
            println('Null pointer exception encountered')
            println(e.getMessage())
            e.printStackTrace()
        }

        println('-------------------------------')
        try {
            //println(cards[4].size())
            int i = 1/0
        } catch (NullPointerException e) {
            println('Null pointer exception encountered')
            println(e.getMessage())
            e.printStackTrace()
        } catch (ArithmeticException e) {
            println(e.getCause())
            println(e.getMessage())
        }

        println('-------------------------------')
        // use parent class (catch all kind of exceptions
        try {
            println(cards[0].size())
            int i = 1/0
        } catch (Exception e) {
            println(e.getMessage())
            e.printStackTrace()
        }

        println('-------------------------------')
        // use parent class (catch all kind of exceptions
        try {
            RandomAccessFile file = new RandomAccessFile("unknownFile.txt", "r")
        } catch (Exception e) {
            println(e.getMessage())
            e.printStackTrace()
        } finally {
            println('Lets perform resource cleanup')
        }
        // The exception is recoverable
        println("After try/catch block")

        try {
            def cardLength = [16, 14, 15, 13]
            check(cardLength)
        } catch (InvalidCardLengthException ex) {
            println(ex.getMessage())
        }
    }

    static check(List list) {
        for(card in list) {
            if (card < 14) {
                throw new InvalidCardLengthException('Card contains fewer than 14 digits')
            }
            println(card)
        }
    }
}
