package com.example.kotlinspringpractice

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ServiceUnitTest {

    @Test
    @DisplayName("타입 차이로 인해, 예상한 사이즈와 달라야 성공합니다.")
    fun should_array_size_different_with_expected_size() {
        // given
        val expectedSize:Short = 1

        // when
        val actualArray = ShortArray(1)

        // then
        assertNotEquals(expectedSize, actualArray.size)
    }

    @Test
    @DisplayName("타입이 같아서, 예상한 사이즈와 같아야 성공합니다.")
    fun should_array_size_same_as_expected_size() {
        // given
        val expectedSize = 1

        // when
        val actualArray = ShortArray(1)

        // then
        assertEquals(expectedSize, actualArray.size)
    }
}