package main.kotlin.br.com.trooper.curso.http

import com.trooper.library.dto.output.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client(id = "http://localhost:8080")
interface BookHttp {

    @Get("/{id}")
    fun findById(@PathVariable id: Long): Book
}