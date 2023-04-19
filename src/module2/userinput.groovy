package module2

class userinput {

    static void main(String[] args) {
        def lang = args[0]
        println("Argument is " + lang)
        println("Please enter your name :")
        println("Your name is " + System.in.newReader().readLine())
    }
}
