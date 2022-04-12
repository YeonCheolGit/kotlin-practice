package com.example.kotlinspringpractice

import com.example.kotlinspringpractice.controller.HelloController
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(HelloController::class)
class ControllerUnitTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun Should_Be_Get_Hello_World() {
        // when
        val actual = mockMvc.perform(get("/hello/world"))

        // then
        actual.andExpect(status().isOk)
            .andExpect(content().string("Hello World"))
    }
}
