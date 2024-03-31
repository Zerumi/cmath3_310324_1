package io.github.method

class LeftRectangleMethod : AbstractRectangleMethod() {
    override fun solveIntegral(f: (Double) -> Double, a: Double, b: Double, n: Int): Double {
        super.validateN(n)
        val h = (b - a) / n
        return super.solveIntegral(f, n, a, h)
    }
}
