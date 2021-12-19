package com.example.KotlinDemo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/test")
class TestController(
    val testService: TestService
) {


    @GetMapping("bb")
    fun `how to print list`(): List<String> {
        val listDemo = listOf("aa", "bb", "vv", "cc")
        println(Arrays.toString(listDemo.toTypedArray()))
        return listDemo
    }


    @GetMapping(value = ["/get-file.text"], produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
    fun getFile(): ByteArray {
        return testService.readFile()
    }
}
