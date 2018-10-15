package rsk


fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Jones", 1)
    print(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student(firstName: String, lastName: String, val id: Int) : Person(firstName, lastName) {
    var tutor: String = ""

    constructor(firstName: String, lastName: String, id: Int, tutor:String): this(firstName, lastName, id) {
        this.tutor = tutor
    }

    override fun getName() : String{return ""}

    // Abstract method must be implemented (or this class should also be declared abstract
    override fun getAddress(): String {
        return ""
    }


}

