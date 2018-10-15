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