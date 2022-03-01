package com.trooper.kotlin

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.trooper.kotlin")
        .start()
}

