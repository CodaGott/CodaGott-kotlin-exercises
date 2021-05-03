// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
   val ch: CharRange = 'a'..'z'
  for (i in 'a'.rangeTo('z').toString()) {
    print(i)
  }

  return  ch.toString()
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}