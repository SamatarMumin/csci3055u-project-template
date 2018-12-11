package tut

//Declaring main function
fun main(args : Array<String>){

 //Declaring variables
    var myage = 43 //Mutable
    var ChangeName = "Sam"

    val NoChange = "Ummutable" //Immutable

//If Statement
    if (ChangeName == "Sam" && myage == 43){
        println("Name is Sam")
    } else
        println("okay cool")

    //Built-Functions
    var bigINT: Int = Int.MAX_VALUE
    var smallINT: Int = Int.MIN_VALUE
    println("Biggest Int: "  + bigINT)
    println("Smallest INT: $smallINT" ) //String imporlation

    //Precision of numbers only of 15 Digits for Floats


    var letterGrade: Char = 'A'
    println("A is a char : ${letterGrade is Char}" ) //String imporalation

    //Casting variables
    println("3.14 to INT :" + (3.14.toInt()))
    println("A to INT :" + (letterGrade.toInt()))


 //Case and Switch
    when(myage){
        in 6..43 -> {
            println("u old ")
        }
    }

//Loops
for(x in 1..10){
    println(x)
}


    //Arrays
    var MyArray = arrayOf(2, 4.23 , "Hello")
    println(MyArray[2])
    MyArray[1] = 3.14
    println(MyArray.size)
    println(MyArray.contains("1"))



}