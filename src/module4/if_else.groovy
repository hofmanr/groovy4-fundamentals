package module4

class if_else {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Discover', 'Diners', 'Master']
        def size = cards.size()
        if (size == 4) {
            println("We got all the required cards")
        } else if (size == 5) {
            println("We got 5 cards in our list")
        } else {
            println("We got more than the required number of cards")
        }
    }
}
