package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello, Jenkins!", HelloWorld.sayHello());
    }
}
