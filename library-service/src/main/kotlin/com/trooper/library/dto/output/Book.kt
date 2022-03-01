package com.trooper.library.dto.output

data class Book(

    val id: Long,
                val publisher: String,
                val author: String,
                val name: String,
                val mainSubject:String,
                val availability: Boolean

                )
