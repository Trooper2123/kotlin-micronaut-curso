package com.trooper.book.repository

import com.trooper.book.model.Book
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface BookRepository: JpaRepository<Book, Long>{
}