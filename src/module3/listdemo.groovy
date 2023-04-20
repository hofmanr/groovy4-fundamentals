package module3

class listdemo {
    static void main(String[] args) {
        def intArray = new int[2]
        intArray[0] = 1
        intArray[1] = 2
        // intArray[1] = "S" is represented as int 83
        // intArray[2] = 3 throws ArrayIndexOutOfBoundsException
        println("Array contains values $intArray")

        def list1 = [10,12,24,36,48]
        println("The size of the list is ${list1.size()}")
        list1.add(60)
        list1.remove(0)
        list1.add("String")
        println("List1 values $list1")

        def list2 = []
        list2.add(10)
        list2.add(12)
        println("List2 values $list2")

        def complexList1 = [10,12,24,36,"String1"]
        println("The size of the list is ${complexList1.size()}")

        def complexList2 = [10,12,24,36,["String1","String2"]]
        println("The size of the list is ${complexList2.size()}")
        println("The 5the element is ${complexList2[4][0]}")
    }
}
