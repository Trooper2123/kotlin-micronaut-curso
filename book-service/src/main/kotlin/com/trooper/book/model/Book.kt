package com.trooper.book.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "book")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val publisher: String,
    val author: String,
    val name: String,
    val mainSubject:String,
    val availability: Boolean
)
