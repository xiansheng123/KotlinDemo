package com.example.KotlinDemo

import org.springframework.stereotype.Service
import org.springframework.util.ResourceUtils
import java.io.FileInputStream
import java.io.InputStream


@Service
 class TestService {
    fun readFile(): ByteArray {
        val file = ResourceUtils.getFile("classpath:tamplate.pom")
        val fileInputStream: InputStream = FileInputStream(file)
//        val Str = fileInputStream.bufferedReader().use { it.readText() }
//        println("here is file: " + Str)
        return fileInputStream.readAllBytes()

    }
}


//fun main() {
//    val aa = TestService().readFile()
//    println(aa)
//}
