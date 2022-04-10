package com.example.kotlinspringpractice.dto

import com.example.kotlinspringpractice.entity.Book

data class SaveBookDTO(
    var name: String,
    var author: String,
    var price: Long
) {
    fun toEntity(): Book {
        return Book(
            name = this.name,
            author = this.author,
            price = this.price
        )
    }
}