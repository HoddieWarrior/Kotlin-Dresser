package com.mykotlin

fun main(args: Array<String>){
    var additionObj = addition(12, 323)
    println("Addition = $additionObj")

    var subtractionObj = subtraction(1213, 3121)
    println("Subtraction = $subtractionObj")

    var multiplicationObj = multiplication(213123, 423123)
    println("Multiplication =$multiplicationObj")

    var divisionObj = division(100, 2)
    println("Division = $divisionObj")
}
fun addition(a:Int,b:Int):Int{
    return a +b
}
fun subtraction(a:Int,b:Int):Int{
    return a-b
}
fun multiplication(a:Int,b:Int):Int{
    return a*b
}
fun division(a:Int,b:Int):Int{
    return a/b
}
