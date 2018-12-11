package tut


//Declaring main function
fun main(args : Array<String>) {
    val original = "SamatarMumin"


    val item = listOf(1,2,3,6,7,31,41,62,3)
    val item2 = listOf(11,21,341,62,7,31,41,62,3)
    val union = item.union(item2)
    val intersect = item.intersect(item)
    val reverse = item.asReversed()


    original.let {
        println("The String is $it")
        it.reversed()
    }.let {
        println("The reverse is $it")
        it.length
    }.let {
        println("The length is $it")
    }

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
