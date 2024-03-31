package io.github.method

abstract class AbstractRectangleMethod : AbstractIntegralSolvingMethod() {
    protected fun solveIntegral(f: (Double) -> Double, n: Int, x0: Double, h: Double): Double {
        var result = 0.0

        for (i in 0..<n) {
            result += f(x0 + i * h) * h
        }

        return result
    }
}
