package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun index(): HashMap<String, String> {
        var map = HashMap<String,String>()
        map["hello"] = "world"
        return map
    }
}