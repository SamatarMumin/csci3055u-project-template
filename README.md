# Kotlin

- Samatar Mumin
- Samatar.mumin@uoit.net

## About the language

> Kotlin is a statically typed programming language based around java virtual machine. A programming language suited towards Android developers helps for the building of apps. An functional language, it has smilarity to other programming languages. This language is very similar to the popular Java. With the given ability to compile javascript.
Kotlin uses aggressive type interface, meaning it can tell what type of data a function is using based on the and how its being used.

## History:
> - Created by Jetbrains the founders of Intelij, Kotlin was founded in 2011 
> - Name "Kotlin" comes from the island near St.Petersburg. 
> - One of the goals was to have a compile time that can rival Java
>- Was officially released for android development in 2017
>- Created to increase the sale and use of Intelij

## Interesting features:
> - Kotlin is completely open source
> - No Runtime overhead
> - Contains its own Null safety
> - Can complie JavaScript
>- Uses Java Class libraries and supports other tools

## About the syntax


*If form*

```Kotlin
fun main(args : Array<String>){
 //Declaring variables
 var myage = 43 
 var ChangeName = "Sam"

//If Statement
    if (ChangeName == "Sam" && myage == 43){
        println("Name is Sam")
    } else
        println("okay cool")
        }
```
*For Loops*
``` Kotlin
//Loops
    for(x in 1..10){
        println(x)
    } 
```
*Array*
```Kotlin
//Arrays
    var MyArray = arrayOf(2, 4.23 , "Hello")
    println(MyArray[2])
}
```




## About the tools

> Kotlin uses JVM (Java virtual machine), and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. As Well can use any of the Newer IDE including (Eclipse, Android studio, Intelij and Command Line). 

## About the standard library

>-  Kotlin standard library features some of the essential functions needed for programming
> - Many functions are adapted for java types and methods
> - Having higher order functions for implementing idiomatic patterns (Let,apply,use)
> - an example of this is the capitalize and lowercase functions
 ```Kotlin
  var ChangeName = "Sam"
    if (ChangeName == "Sam" ){
       ChangeName.capitalize()
    } else
    ChangeName.toLowerCase()
 ```
> - JDK classes also work with Files,IO and threading 

## About open source library

> Tornado FX is a JavaFX framework built and tuned for Kotlin
>- It allows for functional applications using JVM
>- Supports FXML and code management
>- Includes built in Rest and JSon client
>- Very similar coding style to Java FX
```Kotlin
class HelloWorld : View() {
    override val root = hbox {
        label("Hello world")
    }
}
```
> Creates a view and label
```Kotlin
import javafx.scene.text.FontWeight
import tornadofx.*
```
> Needed Imports

```Kotlin
class MyView : View() {
    private val persons = FXCollections.observableArrayList(
            Person(1, "Samantha Stuart", LocalDate.of(1981,12,4)),
            Person(2, "Tom Marks", LocalDate.of(2001,1,23)),
            Person(3, "Stuart Gills", LocalDate.of(1989,5,23)),
            Person(3, "Nicole Williams", LocalDate.of(1998,8,11))
    )

    override val root = tableview(persons) {
        column("ID", Person::id)
        column("Name", Person::name)
        column("Birthday", Person::birthday)
        column("Age", Person::age)
        columnResizePolicy = SmartResize.POLICY
    }
}
```
>-This creates a simple view interface
>-Filling out with the information provided
>- All this code and information can be found here https://github.com/edvin/tornadofx
# Analysis of the language

## The style of programming supported by the language: functional vs procedural programming:
> - Kotlin has functional and procedural programming features but is heavily favoured as a functional program. 
```Kotlin
fun <T : Comparable<T>> List<T>.quickSort(): List<T> = 
    if(size < 2) this
    else {
        val pivot = first()
        val (smaller, greater) = drop(1).partition { it <= pivot}
        smaller.quickSort() + pivot + greater.quickSort()
    }
// Usage
listOf(2,5,1).quickSort() // [1,2,5]
```
>- This is a functional representation of QuickSort obtained https://medium.freecodecamp.org/my-favorite-examples-of-functional-programming-in-kotlin-e69217b39112

```Kotlin
fun system{
println("system is running...")
}
var stri String = "Value"
```
>- example of procedural programming 

## The ability to perform meta-programming such as macros:
> - Kotlin supports meta-programming "like" features, which it inherites through Java
```Kotlin
infix fun Double.pwr(exp: Double) = Math.pow(this, exp)

fun main(args: Array<String>) {
   val d = 2.0 pwr 8.0
   println(d)
}

```
>- This shows the comprehensive way Kotlin deals with meta programming  

## Symbol resolution and its support for closure
>-  Kotlins main compiler JVM uses keywords and not identifiers. Using Soft keywords as alternative method of identifier.
Variables in Kotlin also contain global variables Kotlins uses symbol resolutions smilar to java. As variables are described with the keyword var are mutable and val are immutable. (See Syntax for example). 

## Functional programming constructs either as part of the language or supported by the standard library of the runtime.
>- Using JVM, Kotlin standardly has access to all the functional programming features. Being able to have access to 
Higher order, Lambda functions Without the needed import.

## Scoping rules supported by the language: lexical vs dynamic scoping:
>Kotlin is a statically typed programming language. Being able to use Lambda functions and being an object oriented programming language, it includes similar features to java. Having Public, private and protected modifiers. Public being the default modifier for most programs in Kotlin. It supports both types of lexical and dynamic scoping. However, this language is statically typed. Difference between lexical and dynamic scoping is dynamic scooping cares how the code is executed and not written, causing different values for functions. Lexical scoping won't change values after, as they stay static going through the code instead of during the execution. Static also has faster compile times.

## Strengths of Kotlin:
> - Kotlin is java-interoperable programming languages. It is consistent with the existing java's tools and framework. Giving users a higher degree of flexibility. Programmers who are trained in Java wouldn't have a problem using Kotlin.
> -  implementation of Inline arguments for string allowing for easier formatting for the user.
```Kotlin
  var letterGrade: Char = 'A'
    println("A is a char : ${letterGrade is Char}" ) //String imporalation
```
> - Comparatively data classes are represented in less code compared to other languages Kotlin has better functional programming support, many functional concept can be used in more concisely and explicit stated.   
> - Its safer than most languages, not needing NULLpointerExceptions with less errors
> - Language is new implemented in newer IDE with compliers that detect errors at compile time instead of runtime. Includes lamda expressions and high-order functions.

## Cons of using Kotlin:
>- Slower compilation speed
>- Doesn't include Namespaces, keeps all the functions and properties at the top level of the file
>- Doesn't include static modifer, statice attributes are more complex
>- Limited resources and development since Kotlin is a much smaller developer community 
