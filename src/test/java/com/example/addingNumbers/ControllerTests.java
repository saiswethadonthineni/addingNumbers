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
    int r=a+b;
    String res = "sum is "+ r;
    Assertions.assertEquals("sum is 20",res);
}
}
