package com.example.kotlinspringpractice.repository

import com.example.kotlinspringpractice.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<Book, Long> {

    fun findAllByNameAndAuthor(name: String, author: String): List<Book>

}