package rsk


fun main(args: Array<String>) {
    val kevin = Student(1)
    print(kevin.id)
}

abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student(val id: Int) : Person() {
    override fun getName() : String{return ""}

    // Abstract method must be implemented (or this class should also be declared abstract
    override fun getAddress(): String {
        return ""
    }
}

