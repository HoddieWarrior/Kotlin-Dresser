package PersonalProject

/*👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽
  * This is a class program i created in trying to practice
  * This project makes use of the Primary constructor and secondary constructor
  * Hopefully it works as planned
  * PARTS OF THE PROJECT
  *
  *  One Primary and one secondary
  *  Primary constructor for the student names
  *  Secondary constructor containing:
  *  🐙 Student's Class
  *  🐙 Student's Age
  *  🐙 Student's Department's
  *  🐙 Student's Country of Origin
  *  🐙 Student's Gender
  *  I Hope it all goes well duo and thanks for reading my code pls leave a commit on what should be fixed am new to Kotlin 😁😁😁
  *  👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽
 */


fun main(args:Array<String>){
    var name = Person("HCODE", 10, "USA", 12, "Science","F")
    println("My Id is ${name.id}")
    println("My Country is ${name.country}")
    println("My Age is ${name.age}")
    println("My Department is ${name.department}")
    println("My Gender is ${name.gender}")
}
class Person(var name:String){
    var id:Int = -1
    var country = ""
    var age = 0
    var department = ""
    var gender = ""
    init{
        println("My Name is $name")
    }
    //secondary constructor
    constructor(name:String, id:Int, country:String, age:Int, department:String, gender:String):this(name){
        // body
        // The body of the secondary constructor is called after the init block
        this.id = id
        this.country = country
        this.age = age
        this.department = department
        this.gender = gender

    }
}
