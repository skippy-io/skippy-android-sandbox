package com.example.testskippy

import io.skippy.junit4.Skippy
import junit.framework.TestCase.assertEquals
import org.junit.ClassRule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

class MyTestTwo {

    companion object {
        @get:ClassRule
        @JvmStatic
        val rule: TestRule = Skippy.predictWithSkippy()
    }

    @Test
    fun testTwo() {
        val forSkippyTwo = ForSkippyTwo()
        assertEquals("my fun 2", forSkippyTwo.myFun())
    }
}