package io.github.method

class MiddleRectangleMethod : AbstractRectangleMethod() {
    override fun solveIntegral(f: (Double) -> Double, a: Double, b: Double, n: Int): Double {
        super.validateN(n)
        val h = (b - a) / n
        return super.solveIntegral(f, n, (a + h) / 2, h)
    }
}
