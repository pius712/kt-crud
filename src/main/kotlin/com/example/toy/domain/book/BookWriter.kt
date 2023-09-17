package com.example.toy.domain.book

import com.example.toy.storage.book.BookEntity
import com.example.toy.storage.book.BookRepository
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class BookWriter(
        private val bookRepository: BookRepository
) {

    fun write(name:String):Long {
        return bookRepository.save(BookEntity(
                name = name
        )).id!!
    }

    // NOTE: 이게 뭘까?
    // update 해주는 로직 같은데
    // apply??
    // NOTE: implementation 'org.jetbrains.kotlin:kotlin-reflect' 이거 때문에 가능해짐.
    @Transactional
    fun update(id:Long, name:String) {
        bookRepository.findByIdOrNull(id)?.apply { this.name = name }
    }
}