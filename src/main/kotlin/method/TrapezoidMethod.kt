package io.github.method

class TrapezoidMethod : AbstractIntegralSolvingMethod() {
    override fun solveIntegral(f: (Double) -> Double, a: Double, b: Double, n: Int): Double {
        validateN(n)
        val h = (b - a) / n
        var sum = 0.0
        for (i in 1..<n) {
            sum += f(a + i * h)
        }
        val result = h * ((f(a) + f(b)) / 2 + sum)
        return result
    }
}
