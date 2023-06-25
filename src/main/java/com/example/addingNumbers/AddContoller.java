package com.example.addingNumbers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddContoller {

    @PostMapping("/add")
    public String addTwoNumbers(@RequestParam Integer a,@RequestParam Integer b){
        int res=a=b;
        String s= "sum is "+res;
        return s;

    }
}
