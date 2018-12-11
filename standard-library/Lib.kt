package tut


//Declaring main function
fun main(args : Array<String>) {
    var ChangeName = "Sam"
    if (ChangeName == "Sam" ){
       ChangeName.capitalize()
    } else
    ChangeName.toLowerCase()

    val item = listOf(1,2,3,6,7,31,41,62,3)
    val union = item.union(item)
    val intersect = item.intersect(item)
    val reverse = item.asReversed()

    println(union)
    println(intersect)
    println(reverse)

   item.groupBy {
       if (it % 2 == 0)
       {
        println("Even")

       } else
       {
           println("Odd")
       }



   }
    }

