package io.github.functions

import kotlin.math.cos
import kotlin.math.sin

object FourthFunction : (Double) -> Double {
    override fun invoke(x: Double): Double {
        return sin(x) + 2 * cos(x)
    }
}
