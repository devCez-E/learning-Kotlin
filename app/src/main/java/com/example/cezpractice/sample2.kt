package com.example.cezpractice

fun main(){
    //array()
    //forEx()
    //whileEx()
    //forIndex()

    //nullcheck()
    ignoreNull("string")
}

// 6. Array and List
// Array : 정적 리스트
// List : 동적 리스트 
//        1)List - 수정 불가능
//        2)MutableList - 수정 가능
fun array(){
    val array1 = arrayOf(1,2,3)
    val list1 = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "f", 11L)

    println(array1.get(0))

    array1[0] = 3

    println(array1.get(0))
    println(list2.get(1))
}

fun arrayList(){
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}


// 7. for and while
fun forEx(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) println("HELLO! ${name}. Nice to meet you!")
    for (i in 1..3) println("Number : ${i}")
    for (i in 1..10 step 2) println("Step Number : ${i}")
    for (i in 10 downTo 1) println("Down Number : ${i}")
    for (i in 1 until 3) println("Until Number : ${i}")
}

fun whileEx(){
    var index = 0
    while(index < 10){
        println("While Number : ${index}")
        index++
    }
}

fun forIndex(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for((index, name) in students.withIndex()){
        println("${index + 1}번째 학생 ${name}")
    }
}


// 8. Nullable vs NonNull
fun nullcheck(){
    //NPE : Null pointer Exception

    var name : String = "cezanne"
    var nullName : String? = null
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?
    var lastName : String? = null
    var fullName = name + " " + (lastName?:"No lastName")
    println(fullName)

    lastName = "Lee"
    fullName = name + " " + (lastName?:"No lastName")
    println(fullName)
}

fun ignoreNull(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "devcezxxx@gmail.com"
    email?.let{
        println("my email is ${email}")
    }

    val address : String? = null
    address?.let{
        println("my email is ${address}")
    }
}