package solver

import io.github.method.SimpsonMethod
import io.github.solver.IntegralSolver
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.math.pow
import kotlin.math.sqrt

class IntegralSolverTest {

    @Test
    fun solveFirstIntegral() {
        val result = IntegralSolver().solveIntegral(
            { x -> 3.0.pow(-x) },
            SimpsonMethod(),
            4.0,
            7.0,
            6,
        )

        assertEquals(result.result, 0.010821)
    }

    @Test
    fun solveSecondIntegral() {
        val result = IntegralSolver().solveIntegral(
            { x -> x * x * exp(x) },
            SimpsonMethod(),
            0.0,
            1.0,
            8,
        )

        assertEquals(result.result, 0.71828183)
    }

    @Test
    fun solveThirdIntegral() {
        val result = IntegralSolver().solveIntegral(
            { x -> x * sqrt(x * x + 2 * x) },
            SimpsonMethod(),
            9.0,
            7.0,
            6,
        )

        assertEquals(result.result, -143.775447)
    }
}
