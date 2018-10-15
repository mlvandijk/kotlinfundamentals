package rsk

abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student : Person() {
    override fun getName() : String{return ""}

    // Abstract method must be implemented (or this class should also be declared abstract
    override fun getAddress(): String {
        return ""
    }
}

