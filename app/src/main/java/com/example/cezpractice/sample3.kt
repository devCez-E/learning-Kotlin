package com.example.cezpractice

open class Human (val name : String = "Anonymous"){

    constructor(name:String, age : Int) : this(name){
        println("My name is ${name}, and ${age} years old")
    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is Yammy!!")
    }

    open fun singAsong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singAsong(){
        super.singAsong()
        println("라라라")
    }
}

fun main(){
    val human = Human("Cezanne")
    human.eatingCake()

    val mom = Human("Kuri", 52)

    println("this human's name is ${human.name}")

    val korean = Korean()
    korean.singAsong()
}