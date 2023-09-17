package com.example.toy.storage.book

import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<BookEntity, Long> {


    fun findByName(name:String): List<BookEntity>
}