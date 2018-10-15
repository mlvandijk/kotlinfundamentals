package rsk

open class Person { // Open class to be able to extend this class
    var firstName: String = ""
    var lastName: String = ""

    open fun getName() : String = "$firstName $lastName" // Open function to be able to override the function
}

class Student : Person() {
    override fun getName() : String{return ""} // Specify that you are overriding the functions
}

