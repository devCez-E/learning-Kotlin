package com.example.cezpractice

fun main(){
    //helloWorld()

    //println(add(3,4))

    //stringtemplate()
    //println(conditional(5,7))

    checkName(2)
    checkName(50)
    checkName(92)
}

//1. hello world
// return 형이 없을 땐 Unit 써준다.
fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int{
    return a + b
}


//2. val vs var
//변경 가능한 변수 var
//변경 불가능한 변수 val
fun valvar(){
    val a : Int = 10
    var b : Int = 9

    var name : String = "Cezanne"
}


//3. String Template
fun stringtemplate(){
    val name = "Cezanne "
    val lastName = "Lee"
    println("my name is ${name} I'm 28")
    println("my name is ${name + lastName} I'm 28")
}


// 4. Conditional
fun conditional(a : Int, b : Int) : Int{
    if(a > b) return a
    else return b
}

fun conditional2(a : Int, b : Int) = if(a>b) a else b


// 5. When
fun checkName(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}