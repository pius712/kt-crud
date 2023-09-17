package com.example.toy

import java.lang.RuntimeException

class Calculator(
        val number: Int
) {

    fun plus(operand: Int): Int {
        return number + operand
    }

    fun minus(operand: Int): Int {
        println("$number, $operand ${number - operand}")
        return number - operand
    }

    fun multiply(operand: Int): Int {
        return number * operand
    }

    fun divide(operand: Int): Int {
        return number / operand
    }


    fun throwing() {
        throw RuntimeException()
    }
}