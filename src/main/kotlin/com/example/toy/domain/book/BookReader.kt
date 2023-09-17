package com.example.toy.domain.book

import com.example.toy.storage.book.BookEntity
import com.example.toy.storage.book.BookRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.lang.RuntimeException


@Component
class BookReader(
        private val bookRepository: BookRepository
) {

    // NOTE: 음 findByIdOrNull 을 사용하면 java의 optional 이 전파가 안되게 할 수 있음.
    // 이건 스프링에서 제공하는 확장 함수.
    // 이걸 elvis operator로 처리가 가능함.
    fun readById( id:Long):Book {
        val found = bookRepository.findByIdOrNull(id) ?: throw RuntimeException();
        return toBook(found)
    }

    fun readAll() :List<Book> {
        return bookRepository.findAll().map{ toBook(it)}
    }
    fun readByName(name:String):List<Book> {
        return bookRepository.findByName(name).map { toBook(it) }
    }

    private fun toBook(bookEntity: BookEntity):Book {
        println(bookEntity.name);
        return Book(
                bookEntity.id!!,
                bookEntity.name
        )
    }
}