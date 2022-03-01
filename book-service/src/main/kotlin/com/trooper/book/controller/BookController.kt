package com.trooper.book.controller

import com.trooper.book.model.Book
import com.trooper.book.service.BookService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import java.util.*

@Controller("/books")
class BookController (
    private val bookService: BookService
        ){
    @Post
    fun create(@Body book: Book): HttpResponse<Book>{
        return HttpResponse.created(bookService.create(book))
    }

    @Get("/{id}")
    fun findById(@PathVariable id: Long): Optional<Book> {
        return bookService.findById(id)

    }
}