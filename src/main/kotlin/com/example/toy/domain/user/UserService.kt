package com.example.toy.domain.user

import org.springframework.stereotype.Service


@Service
class UserService(
        private val userReader: UserReader
) {

    fun read():String {
        return userReader.read();
    }
}