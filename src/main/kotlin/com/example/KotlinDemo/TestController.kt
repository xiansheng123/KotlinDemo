package com.example.KotlinDemo

import org.springframework.context.annotation.Description
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController (
        val testService: TestService
){

    @GetMapping("/aa")
    @Description("test global val ")
    fun test1(): String {
         return testService.addOne().toString()
    }
}

@Service
class TestService {
    var count: Int = 0

    fun addOne():Int {
        count += 1
        return count;
    }
}