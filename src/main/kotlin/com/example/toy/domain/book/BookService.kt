package com.example.toy.domain.book

import org.springframework.stereotype.Service

@Service
class BookService(
        private val bookReader: BookReader,
        private val bookWriter: BookWriter
) {

    fun getAllBook():List<Book> {
        return bookReader.readAll()
    }

    fun getBookByName(name:String): List<Book> {
        return bookReader.readByName(name)
    }

    fun register(name:String) :Long {
        return bookWriter.write(name);
    }
}