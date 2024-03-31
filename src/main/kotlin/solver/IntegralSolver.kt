package io.github.solver

import io.github.exception.LowEfficiencyException
import io.github.exception.ValidationException
import io.github.method.IntegralSolvingMethod
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.round

class IntegralSolver {
    private fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return round(this * multiplier) / multiplier
    }

    private fun validateEpsilon(epsilon: Int) {
        if (epsilon < 0 || epsilon > 8) throw ValidationException("Epsilon should be between 0..8")
    }

    fun solveIntegral(
        f: (Double) -> Double, method: IntegralSolvingMethod, a: Double, b: Double, epsilon: Int
    ): IntegralSolvingResult {
        validateEpsilon(epsilon)
        var n = 4
        val eps = 0.1.pow(epsilon + 1)
        var result: Double
        var iterations = 0
        do {
            val solution = method.solveIntegral(f, a, b, n)
            n *= 2
            val doubledSolution = method.solveIntegral(f, a, b, n)
            result = doubledSolution
            if (iterations++ > epsilon) throw LowEfficiencyException("Please, choose another method for this setup")
        } while (abs(doubledSolution - solution) > eps)
        return IntegralSolvingResult(result.round(epsilon), iterations)
    }
}
