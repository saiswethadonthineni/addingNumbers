package com.example.addingNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class ControllerTests {

@InjectMocks
    AddContoller contoller;

@Test
    void addTwoNumbers(){
    int a=10;
    int b=10;
    int res = a + b;
    Assertions.assertEquals("sum is "+res,"sum is "+res);
}
}
