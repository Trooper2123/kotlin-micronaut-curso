package com.trooper.library.dto.input

data class BorrowedInput(
    val id:Long,
    val user: String,
    val book: Long,
    val borrowedDate: String,
    val returnDate: String
)
