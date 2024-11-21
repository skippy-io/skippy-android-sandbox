package com.example.testskippy;

import static org.junit.Assert.assertEquals;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class MyJavaSkippyTest {
    @ClassRule
    public static final TestRule skippyRule = io.skippy.junit4.Skippy.predictWithSkippy();

    @Test
    public void testMyFun() {
        JavaSkippy javaSkippy = new JavaSkippy();
        javaSkippy.myFun();
        javaSkippy.myFun();
        assertEquals("my fun 1", javaSkippy.myFun());
    }
}
