package io.github.method

import io.github.exception.ValidationException

abstract class AbstractIntegralSolvingMethod : IntegralSolvingMethod {
    protected open fun validateN(n: Int) {
        if (n < 4) throw ValidationException("n should be > 4")
    }
}
