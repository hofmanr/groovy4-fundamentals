package module4

class builtin_methods {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Discover', 'Diners', 'Master']

        // Closure
        cards.each {println("In Each method $it")}

        cards.size().times {println("In times method $it")}
        cards.size().times {if(it==0) println("Card in times method ${cards[it]}")}
        cards.eachWithIndex{ String entry, int i -> println("$entry element appears at position $i")}
    }
}
