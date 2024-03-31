package method

import io.github.method.IntegralSolvingMethod
import io.github.method.LeftRectangleMethod
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LeftRectangleMethodTest {

    private lateinit var method: IntegralSolvingMethod

    private fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return kotlin.math.round(this * multiplier) / multiplier
    }

    @BeforeEach
    fun setUp() {
        method = LeftRectangleMethod()
    }

    @Test
    fun solveFirstIntegral() {
        val f = { x: Double -> x * x }
        assertEquals(method.solveIntegral(f, 1.0, 2.0, 5).round(2), 2.04)
    }

    @Test
    fun solveSecondIntegral() {
        val f = { x: Double -> x * x }
        assertEquals(method.solveIntegral(f, 1.0, 2.0, 10).round(3), 2.185)
    }
}
