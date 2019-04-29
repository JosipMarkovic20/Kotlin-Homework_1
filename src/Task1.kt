/*
Create a collection of integers

Use Random to fill the collection with 100 random numbers between 1 and 100.

Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10
 */
fun main() {
    val mutableList = mutableListOf<Int>()
    for (i in 1..100)mutableList.add((1..100).random())
    loop@ for (i in mutableList)when(i){in 11..100 -> println(i) else -> break@loop }
}