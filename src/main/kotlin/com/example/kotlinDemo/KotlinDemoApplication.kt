package com.example.kotlinDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
//    runApplication<KotlinDemoApplication>(*args)
//    car().add1()
//   car().run { println(15 Add 1) }
//    println(133 gg 1)
    var my = "xuda" to "richer"
    println(my)
    println((1..12 step 2) )
}

//infix fun Int.gg(number: Int) = this + number
