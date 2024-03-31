package io.github.functions

import kotlin.math.pow

object FifthFunction : (Double) -> Double {
    override fun invoke(x: Double): Double {
        return 5.0.pow(2 * x - 1)
    }
}
