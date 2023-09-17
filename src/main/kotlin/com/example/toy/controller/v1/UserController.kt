package com.example.toy.controller.v1

import com.example.toy.domain.user.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/user")
class UserController(private val userService: UserService) {


    @GetMapping()
    fun getUser():String{
        return userService.read();
    }

}