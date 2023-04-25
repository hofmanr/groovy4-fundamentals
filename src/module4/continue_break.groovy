package module4

class continue_break {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Discover', 'Diners', 'Master']
        for (card in cards) {
            if (card == 'Amex') { // is the same as 'card.equals('Amex') in Groovy
                continue
            }
            if (card == 'Diners') {
                break
            }
            println("Card found $card")
        }

    }
}
