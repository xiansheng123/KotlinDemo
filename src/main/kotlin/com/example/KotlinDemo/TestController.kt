package com.example.KotlinDemo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/test")
class TestController(
    val fileService: FileService
) {

    @GetMapping("bb")
    fun `how to print list`(): List<String> {
        val listDemo = listOf("aa", "bb", "vv", "cc")
        println(Arrays.toString(listDemo.toTypedArray()))
        return listDemo
    }

    //    download file
    @GetMapping(value = ["/get-file.text"], produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
    fun getFile(): ByteArray {
        return fileService.readFile()
    }

    //    download file
    @GetMapping(value = ["/get-file2.text"], produces = [MediaType.APPLICATION_OCTET_STREAM_VALUE])
    fun getFile2(): ByteArray {
        return fileService.writeFileFromJar()
    }

    @GetMapping("read-file")
    fun readFile(): String {
        fileService.readFileFromJar()
        return "please check log"
    }

}
