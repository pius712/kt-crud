package com.example.toy.controller.v1

import com.example.toy.controller.v1.request.BookCreateRequestDto
import com.example.toy.domain.book.Book
import com.example.toy.domain.book.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/book")
class BookController(private val bookService: BookService) {
    @GetMapping
    fun getBook():List<Book>  {
        return bookService.getBookByName("hello")
    }

    @GetMapping("all")
    fun getAllBook():List<Book> {
        return bookService.getAllBook();
    }
    @PostMapping
    fun registerBook(
            @RequestBody createRequestDto: BookCreateRequestDto
    )  {
    bookService.register(createRequestDto.name)
    }
}

