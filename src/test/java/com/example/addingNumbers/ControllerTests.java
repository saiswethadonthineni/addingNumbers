package com.example.addingNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ControllerTests {
    @InjectMocks
    AddContoller contoller;

@Test
    void addTwoNumbers(){
    int a=10;
    int b=10;
    String res=contoller.addTwoNumbers(a,b);
    Assertions.assertEquals("sum is 20",res);
}
}
