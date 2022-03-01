package com.trooper.library.service

import com.trooper.library.dto.input.BorrowedInput
import jakarta.inject.Singleton
import main.kotlin.br.com.trooper.curso.http.BookHttp

@Singleton
class BorrowedService (
    private val bookHttp : BookHttp
        ){

    fun borrowBook (borrowedInput: BorrowedInput){
        val book = bookHttp.findById(borrowedInput.book)
        println(book)
    }
}