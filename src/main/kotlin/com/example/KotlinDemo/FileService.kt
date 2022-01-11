package com.example.KotlinDemo

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.springframework.stereotype.Service
import org.springframework.util.ResourceUtils
import java.io.FileInputStream
import java.io.InputStream


@Service
class FileService {
    fun readFile(): ByteArray {
        val file = ResourceUtils.getFile("classpath:tamplate.pom")
        val fileInputStream: InputStream = FileInputStream(file)
        return fileInputStream.readAllBytes()
    }

    fun readFileFromJar(): String {
        println("=======start read file from jar=====")
        var result = ""
        val resources =
            PathMatchingResourcePatternResolver().getResources(ResourceUtils.CLASSPATH_URL_PREFIX + "/temp/**")

        println("read resource:" + resources.size)
        resources.forEach {
            println("file: ${it.filename}; isFile:${it.isFile};isReadable ${it.isReadable};description: ${it.description}; ")
            if (it.filename!!.startsWith("tam")) {
                val str = it.inputStream.bufferedReader().use { it.readText() }
                result += str
                println("here is file: $str")
            }
        }
        println("=======end read file from jar=====")
        return result

    }

    fun writeFileFromJar(): ByteArray {
        val str = readFileFromJar()
        return str.byteInputStream().readAllBytes()
    }
}
