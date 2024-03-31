package io.github.functions

object ThirdFunction : (Double) -> Double {
    override fun invoke(x: Double): Double {
        return -2 * x * x * x - 9 * x * x - 7 * x + 11
    }
}
