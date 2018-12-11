# Kotlin

- Samatar Mumin
- Samatar.mumin@uoit.net

## About the language

> Kotlin is a statically typed programming language based around java virtual machine. A programming languague suited towards Android developers helps for the bulding of apps.
using aggressive type interferce, meaning it can tell what type of data a function is using based on the code and hows its used. 
Kotlin uses aggressive type interferce, meaning it can tell what type of data a function is using based on the and how its being used.
This language is very smilar to the popular Java.
>
History:
> - Created by Jetbrains the founders of intelij, Kotlin was founded in 2012 
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

## About the tools

> Java uses JVM (Java vitrual machine),  and also can be compiled to JavaScript source code or use the LLVM compiler infrastrucutre. As
Well can use any of the Newer IDE including (Eclipse, Android studio , Intelij and Command Line). 

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

The style of programming supported by the language: functional vs procedural programming:
> - Kotlin has functional and procedural programming features. 

The ability to perform meta-programming such as macros:
> - Kotlin supports meta-programming "like" features, which it inherites through Java
```Kotlin
package com.ruwanka.kotlin.reflections

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
