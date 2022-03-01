package com.trooper.book.service

import com.trooper.book.model.Book
import com.trooper.book.repository.BookRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class BookService ( private val bookRepository: BookRepository) {
    fun create (book: Book):Book{
        return bookRepository.save(book)
    }

    fun findById(id: Long): Optional<Book> {
        return  bookRepository.findById(id)
    }
}