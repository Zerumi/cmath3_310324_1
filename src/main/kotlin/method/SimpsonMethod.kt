package io.github.method

import io.github.exception.ValidationException

class SimpsonMethod : AbstractIntegralSolvingMethod() {

    override fun validateN(n: Int) {
        super.validateN(n)
        if (n % 2 != 0) throw ValidationException("For Simpson method n should be even number")
    }
    override fun solveIntegral(f: (Double) -> Double, a: Double, b: Double, n: Int): Double {
        validateN(n)
        val h = (b - a) / n
        var evenIndexesSum = 0.0
        var oddIndexesSum = 0.0
        for (i in 1..<n step 2) {
            oddIndexesSum += f(a + i * h)
        }
        for (i in 2..(n-2) step 2) {
            evenIndexesSum += f(a + i * h)
        }
        val result = h / 3 * (f(a) + 4 * oddIndexesSum + 2 * evenIndexesSum + f(b))
        return result
    }
}
