package module3

class mapdemo {
    static void main(String[] args) {
        def conceptCardMap = [visa:12, amex:15, discover:16]

        def cardMap = conceptCardMap << [visa:16] // replace or add element to the list

        println("CardMap values $cardMap")
        println("Visa card contains ${cardMap["visa"]} digits")
        println("Visa card contains ${cardMap.visa} digits")
        println(cardMap.get("visa"))

        cardMap["diners"] = 16 // add element to the map
        println("Total elements in the map ${cardMap.size()}")

        println(cardMap.containsKey("visa"))

        def map1 = [:] // empty map
        def map2 = [name: "Jerry", age: 42, city: "New York"] // mix types
    }
}
