package com.example.toy

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.*
import java.lang.RuntimeException

class CalculatorTest {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("before all")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("after all")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("before each")
    }

    @Test
    fun addTest() {
        val calculator = Calculator(1)
        val actual = calculator.plus(3)
        assertThat(actual).isEqualTo(4)
    }

    @Test
    fun minusTest() {
        val calculator = Calculator(1)
        val actual = calculator.minus(3);
        println(actual)
        assertThat(actual).isEqualTo(-2)
    }

    @Test
    fun throwing() {

        assertThrows<RuntimeException>{
            val calculator = Calculator(1)
             calculator.throwing();
        }
    }
}