// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val s1: String = string + int
  val s2: String = string + double
  val s3: String = string + boolean
  val s4: String = string + character

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  val sample: Boolean

  println("The type that can't be combined " +
    "with itself using '+':")
  println("Boolean")
}