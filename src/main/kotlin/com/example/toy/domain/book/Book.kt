package com.example.toy.domain.book

// data class 가 private이면, getter가 없어서, json 만들때 안나옴
data class Book( val id: Long,
                 val name: String)
