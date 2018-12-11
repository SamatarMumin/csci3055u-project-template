# Kotlin

- Samatar Mumin
- Samatar.mumin@uoit.net

## About the language

> Kotlin is a statically typed programming language based around java virtual machine. A programming languague suited towards Android developers helps for the bulding of apps.
Kotlin uses aggressive type interferce, meaning it can tell what type of data a function is using based on the and how its being used.
This language is very smilar to the popular Java.
>
History:
> - Created by Jetbrains the founders of intelij, Kotlin was founded in 2011 
> - Name "Kotlin" comes from the island near St.Petersburg. 
> - One of the goals was to have a compile time that can rival Java

Interesting features:
> - Kotlin is completely open source
> - No Runtime overhead
> - Contains own Null safety
> - Can complie JavaScript
>- Uses Java Class libraries

## About the syntax

> _give some code snippet of the language_

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

``` Kotlin
//Declaring Variables
  var myage = 43 //Mutable
   val ChangeName = "Sam" //Immutable 
```

```Kotlin
for(x in 1..10){ //For Loop
    println(x)
}
```




## About the tools

> Kotlin uses JVM (Java vitrual machine),  and also can be compiled to JavaScript source code or use the LLVM compiler infrastrucutre. As Well can use any of the Newer IDE including (Eclipse, Android studio , Intelij and Command Line). 

## About the standard library

>- Kotlin standard libary features some of the essential functions needed for programming
> - Many functions are adappted for java types and methods
> - Having higher order functions for implementing idoiomatic patterns (Let,apply,use)
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
>- Very smilar coding style to Java FX
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

The style of programming supported by the language: functional vs procedural programming:
> - Kotlin has functional and procedural programming features. 
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

The ability to perform meta-programming such as macros:
> - Kotlin supports meta-programming "like" features, which it inherites through Java
```Kotlin

open class Person(val name: String, var age: Int)

class Manager(name: String, age: Int, var Job: String) : Person(name, age)

fun main(args: Array<String>) {
    printTypeHierarchy(Manager::class.java)
}
private fun printTypeHierarchy(cls: Class<out Any>?) {
    var clazz = cls;
    while (clazz != null) {
        println(clazz.name)
        clazz = clazz.superclass as Class<out Any>?
    }
}

```
>- This shows the comprehensive way Kotlin deals with meta programming  

Scoping rules supported by the language: lexical vs dynamic scoping:
>Kotlin is a very verstile language when it comes to scooping. Being able to use Lambda functions and being an object oriented programming language,it includes smilar features to java. Having Public, private and protected modifiers. Public being the default modifier for most programs in Kotlin. It supports both types of lexical and dynamic scoping. Difference between lexical and dynamic scoping is dynamic scooping cares how the code is executed and not writen, causing differnet values for functions. Lexical scoping won't change values after, as they stay static 

Strengths of Kotlin:
> - Kotlin is java-interoperable programming languages. It is consistent with the existing java's tools and framework. Giving users a higher degree of flexablity. Programmers who are trained in Java wouldn't have a problem using Kotlin.
> -  implementation of Inline arguments for string allowing for easier formatting for the user.
```Kotlin
  var letterGrade: Char = 'A'
    println("A is a char : ${letterGrade is Char}" ) //String imporalation
```
> - Comapartively data classes are represetned in less code compared to other languages Kotlin has better functional programming support, many fuctional concept can be used in more concisely and explict stated.   
> - Its safer than most languages, not needing NULLpointerExceptions with less errors
> - Language is new implemented in newer IDE with compliers that detect errors at compile time instead of runtime. Includes lamda expressions and high-order functions.

Cons of using Kotlin:
>- Slower compilation speed
>- Doesn't include Namespaces, keeps all the functions and properties at the top level of the file
>- Doesn't include static modifer, statice attributes are more complex
>- Limited resources and development since Kotlin is a much smaller developer community 
