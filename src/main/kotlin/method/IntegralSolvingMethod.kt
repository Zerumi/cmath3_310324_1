package io.github.method

interface IntegralSolvingMethod {
    fun solveIntegral(f: (Double) -> Double, a: Double, b: Double, n : Int) : Double
}
