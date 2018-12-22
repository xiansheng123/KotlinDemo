fun main(args: Array<String>) {
    car().add()
}

//infix function
private class car() {
    private infix fun add(age: Int): Int {
        return age + 1
    }

   infix fun Int.Add(number: Int) = this + number

    private fun multiply(age: Int): Int {
        return age * 10
    }

    fun add() {
       println(message = this add 12)
        println(15 Add 1)
    }

    fun multiply1() {
        println(multiply(13))
    }
}

