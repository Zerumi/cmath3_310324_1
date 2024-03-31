package method

import io.github.method.IntegralSolvingMethod
import io.github.method.RightRectangleMethod
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RightRectangleMethodTest {
    private lateinit var method: IntegralSolvingMethod

    private fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return kotlin.math.round(this * multiplier) / multiplier
    }

    @BeforeEach
    fun setUp() {
        method = RightRectangleMethod()
    }

    @Test
    fun solveFirstIntegral() {
        val f = { x: Double -> x * x }
        assertEquals(method.solveIntegral(f, 1.0, 2.0, 5).round(2), 2.64)
    }

    @Test
    fun solveSecondIntegral() {
        val f = { x: Double -> x * x }
        assertEquals(method.solveIntegral(f, 1.0, 2.0, 10).round(3), 2.485)
    }
}
