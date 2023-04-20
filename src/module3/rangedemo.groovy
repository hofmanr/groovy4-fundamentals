package module3

class rangedemo {
    static void main(String[] args) {
        def range1 = 1..10
        println("Size of range is ${range1.size()}")

        def range2 = 1..<10
        println("Size of range is ${range2.size()}")

        def alpha = 'a'..'z' // or ('a'..'z')
        println("Size of range is ${alpha.size()}")
        println("Sublist: ${alpha.subList(2,4)}")
        println("Range contains 'B': ${alpha.contains('B')}")
        println("10the element in the range is: ${alpha.get(9)}")
    }
}
