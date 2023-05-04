package module6

class closure_method_collections {
    static void main(String[] args) {
        def cards = ['Visa', 'Amex', 'Master', 'Discover']
        String date = new Date().format('MMdd')
        iterateCard(cards, {println("$it read at $date")})

        // Return after the first match
        def match = cards.find {(it.length() > 4)}
        println("Matched cards: $match")

        // Return all matches
        def matches = cards.findAll {(it.length() > 4)}
        matches.each {println("$it found by findAll method")}

        def cardsMap = [visa:16, amex:15, discover:16]
        cardsMap.collect{
            print it.key.toUpperCase()
            println(it.value * 2)
        }
        // Is the same as
        cardsMap.each {
            print it.key.toLowerCase()
            println(it.value * 2)
        }
        // With index
        cardsMap.eachWithIndex{ Map.Entry<String, Integer> entry, int i ->
            println("$i ${entry.key.toUpperCase()} ${entry.value*2}")
        }
    }

    def static iterateCard(cards, chunk) {
        for(int i = 0; i < cards.size(); i++) {
            chunk(cards[i])
        }
    }
}
