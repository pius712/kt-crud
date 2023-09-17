package com.example.toy.domain.user

import org.springframework.stereotype.Component

@Component
class UserReader {

    fun read(): String {
        return "hello"
    }
}