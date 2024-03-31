package io.github.functions

object SecondFunction : (Double) -> Double {
    override fun invoke(x: Double): Double {
        return -x * x * x - x * x - 2 * x + 1
    }
}
