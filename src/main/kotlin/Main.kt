@file:JvmName("Main")

package io.github

import io.github.functions.FirstFunction
import io.github.method.*

fun main() {
    val leftRectangleMethod = LeftRectangleMethod()
    val rightRectangleMethod = RightRectangleMethod()
    val middleRectangleMethod = MiddleRectangleMethod()
    val trapezoidMethod = TrapezoidMethod()
    val simpsonMethod = SimpsonMethod()
    val a = 1.0
    val b = 2.0
    println(leftRectangleMethod.solveIntegral(FirstFunction, a, b, 5))
    println(rightRectangleMethod.solveIntegral(FirstFunction, a, b, 5))
    println(middleRectangleMethod.solveIntegral(FirstFunction, a, b, 5))
    println(trapezoidMethod.solveIntegral(FirstFunction, a, b, 10))
    println(simpsonMethod.solveIntegral(FirstFunction, a, b, 4))
}
