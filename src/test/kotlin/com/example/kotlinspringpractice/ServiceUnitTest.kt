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

    @Test
    @DisplayName("String의 2번째 index를 출력합니다")
    fun should_return_second_index_from_string() {
        // given
        val expected = "study"

        // when
        val secondExpected = expected[2].toString()

        // then
        assertEquals(secondExpected, "u");
    }

    @Test
    @DisplayName("mutable list에 값을 더하면, 성공합니다.")
    fun should_mutable_collection_is_added() {
        // given
        val mutableList = mutableListOf(1, 2, 3)

        // when
        mutableList.add(4)

        // then
        assertEquals(mutableList[3], 4)
    }

    @Test
    @DisplayName("for loop을 이용해서 1 ~ 5를 list에 추가한다면, 성공합니다.")
    fun should_iterate_five_times_and_add_elements() {
        // given
        val mutableList = mutableListOf<Int>()

        // when
        for (i in 1..5) {
            mutableList.add(i)
        }

        // then
        assertEquals(mutableList[4], 5)
    }
}