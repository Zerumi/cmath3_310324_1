@file:JvmName("Main")

package io.github

import io.github.functions.*
import io.github.method.*
import io.github.solver.IntegralSolver

val availableMethods = listOf<IntegralSolvingMethod>(
    LeftRectangleMethod(),
    RightRectangleMethod(),
    MiddleRectangleMethod(),
    TrapezoidMethod(),
    SimpsonMethod(),
)

val availableFunctions = listOf(
    FirstFunction,
    SecondFunction,
    ThirdFunction,
    FourthFunction,
    FifthFunction,
)

fun main() {
    var chosenIndex: Int

    do {
        println("Enter method:")
        println("1 - Left Rectangle Method")
        println("2 - Right Rectangle Method")
        println("3 - Middle Rectangle Method")
        println("4 - Trapezoid Method")
        println("5 - Simpson Method")
        print("Your option: ")
        val a = readln().toInt()
        chosenIndex = a
    } while (a < 1 || a > 5)

    val method = availableMethods[chosenIndex - 1]

    do {
        println("Choose function:")
        println("1 - f(x) = x^2")
        println("2 - f(x) = -x^3 - x^2 - 2x + 1")
        println("3 - f(x) = -2x^3 - 9x^2 -7x + 11")
        println("4 - f(x) = sin(x) + 2cos(x)")
        println("5 - f(x) = 5^(2x - 1)")
        print("Your option: ")
        val a = readln().toInt()
        chosenIndex = a
    } while (a < 1 || a > 5)

    val function = availableFunctions[chosenIndex - 1]

    print("Enter A: ")
    val a = readln().toDouble()

    print("Enter B: ")
    val b = readln().toDouble()

    print("Enter epsilon (how many points after decimal should be accurate?): ")
    val epsilon = readln().toInt()

    println("------------------")
    try {
        val solution = IntegralSolver().solveIntegral(function, method, a, b, epsilon)
        println("Result: ${solution.result}")
        println("Solved by ${solution.amountOfIterations} iterations")
    } catch (e: Throwable) {
        println("Something went wrong: " + e.message)
    }
}
