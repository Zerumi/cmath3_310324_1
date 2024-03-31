package method

import io.github.exception.ValidationException
import io.github.method.IntegralSolvingMethod
import io.github.method.SimpsonMethod
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.random.Random

class SimpsonMethodTest {
    private lateinit var method: IntegralSolvingMethod

    private fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return kotlin.math.round(this * multiplier) / multiplier
    }

    @BeforeEach
    fun setUp() {
        method = SimpsonMethod()
    }

    @Test
    fun validateFirstN() {
        val f = { x: Double -> x * x }
        val e = org.junit.jupiter.api.assertThrows<ValidationException> {
            method.solveIntegral(f, 1.0, 2.0, 5)
        }

        assertEquals(e.message, "For Simpson method n should be even number")
    }

    @Test
    fun validateRandomN() {
        val f = { x: Double -> x * x }
        val e = org.junit.jupiter.api.assertThrows<ValidationException> {
            method.solveIntegral(f, 1.0, 2.0, Random.nextInt((Int.MAX_VALUE - 1) / 2) * 2 + 1)
        }

        assertEquals(e.message, "For Simpson method n should be even number")
    }

    @Test
    fun solveIntegral() {
        val f = { x: Double -> x * x }
        assertEquals(method.solveIntegral(f, 1.0, 2.0, 4).round(4), 2.3333)
    }
}
