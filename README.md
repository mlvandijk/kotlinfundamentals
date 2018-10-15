# Kotlin Fundamentals

Code from the Pluralsight course Kotlin Fundamentals

## Functions in Kotlin

> Add notes

## Programming with types

### Interfaces
Kotlin has interfaces, which are fairly similar to those in Java.
Declared with the keyword `interface`.
Use the `override` keyword to override a function from the interface.

By default everything is public: classes, interfaces, functions.

### Classes
`final` by default.
`abstract` classes
modifiers
sealed classes
constructors
data classes

To make it possible to extend a class, open the class using the `open` keyword.

Abstract classes

```kotlin
abstract class Person{   // Class is abstract
  abstract fun getName() // getName must be implemented
  open fun wrkHard(){}   // workHard may be overridden
  fun goOnHoliday(){}    // goOnHoliday cannot be overridden
}
```

Everything is public by default. (Unlike Java, where the default is `package-private`.)
Kotlin has the keyword `internal`, which means it's visible to anything in the same module.

Sealed classes
* Used to restrict class Hierarchies
* "Enums on steroids"

Constructors
Specify primary construction parameters on the class definition
Kotlin does not have the `new` keyword.
```kotlin
open class Person(val name: String)
val kevin = Person("Kevin")
```

Alternative primary constructor usage (not preferred):
```kotlin
open class Person(name: String) {
  val name: String
  init {
    this.name = name
  }
}

open class Person(_name: String) {
    val name = _name
}
```

Secondary constructor usage:
```kotlin
open class Person(name: String) {
    constructor(name: String, age: Int) : this(name)
}
```
Prefer to use default values over secondary constructors.

Calling superclass constructors:
```kotlin
class Student(name: String): Person(name)

class Student: Person {
  constructor(name: String) : super(name) // Call the constructor of the superclass
}
```

If a class has a default constructor, we have to call that default contructor explicitly.

Private constructors are supported
Usually used to inhibit construction (e.g. create a singleton)
Kotlin has a better way of doing this.