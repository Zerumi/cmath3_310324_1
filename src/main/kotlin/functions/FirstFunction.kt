package io.github.functions

object FirstFunction : (Double) -> Double {
    override fun invoke(x: Double): Double {
        return x * x
    }
}
