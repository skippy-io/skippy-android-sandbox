package com.example.testskippy

import io.skippy.junit4.Skippy
import junit.framework.TestCase.assertEquals
import org.junit.ClassRule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

class MyTestOne {

    companion object {
        @get:ClassRule
        @JvmStatic
        val rule = Skippy.predictWithSkippy()
    }

    @Test
    fun testOne() {
        val forSkippyOne = ForSkippyOne()
        assertEquals("my fun 1", forSkippyOne.myFun(), )
    }
}