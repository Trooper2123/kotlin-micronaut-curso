package com.trooper.library.controller

import com.trooper.library.dto.input.BorrowedInput
import com.trooper.library.service.BorrowedService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/borrow")
class BorrowedController (
    private  val borrowedService: BorrowedService){

    @Post
    fun borrowBook(@Body borrowedInput: BorrowedInput){
        return borrowedService.borrowBook(borrowedInput)

    }
}