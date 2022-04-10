package com.example.kotlinspringpractice

import com.example.kotlinspringpractice.dto.SaveBookDTO
import com.example.kotlinspringpractice.entity.Book
import com.example.kotlinspringpractice.repository.BookRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RepositoryUnitTest {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @Test
    @DisplayName("500,000개의 책들이 저장되야 성공한다.")
    fun save_many_books() {
        // given
        val firstBookDTO = SaveBookDTO(name = "book1", author = "author1", price = 1000L)
        val secondBookDTO = SaveBookDTO(name = "book2", author = "author2", price = 2000L)
        val thirdBookDTO = SaveBookDTO(name = "book3", author = "author3", price = 2000L)
        val forthBookDTO = SaveBookDTO(name = "book4", author = "author4", price = 2000L)
        val fifthBookDTO = SaveBookDTO(name = "book5", author = "author5", price = 2000L)

        // when
        val books = ArrayList<Book>()
        for (i in 1..100000) {
            books.add(firstBookDTO.toEntity())
            books.add(secondBookDTO.toEntity())
            books.add(thirdBookDTO.toEntity())
            books.add(forthBookDTO.toEntity())
            books.add(fifthBookDTO.toEntity())
        }
        bookRepository.saveAll(books)

        // then
        assertEquals(500000, bookRepository.count())
    }
}