package module4

class for_loop {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Discover', 'Master']
        def numbers = 1..5
        for (card in cards) {
            println("Card found $card")
        }
        for (num in numbers) {
            println("Number $num")
        }

        for (int i = 0; i < 3; i++) {
            println("Numbers in the for loop $i; processed card: ${cards[i]}")
        }
    }
}
