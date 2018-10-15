package rsk


fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Jones", 1)
    print(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student(firstName: String, lastName: String, val id: Int, var tutor: String = "") : Person(firstName, lastName) {

    override fun getName() : String{return ""}

    // Abstract method must be implemented (or this class should also be declared abstract
    override fun getAddress(): String {
        return ""
    }


}

