package com.mykotlin
/*
   This program makes use of the primary constructor and
   secondary constructor
 */
fun main(args:Array<String>){
   var name = Person("HCODE", 10, "USA")
    println(name.id)
    println(name.country)
}
class Person(var name:String){
    var id:Int = -1
    var country = ""
    init{
        print("$name")
    }
//secondary constructor
    constructor(name:String, id:Int, country:String):this(name){
     // body
    // The body of the secondary constructor is called after the init block
    this.id = id
    this.country = country



    }
}