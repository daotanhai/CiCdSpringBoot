package com.example.cicdspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AutoTestController {
    @Autowired
    TestController controller;

    @Test
    void checkString() {
        assertEquals("Catch me if u can!", controller.welcomeController());
    }
}
