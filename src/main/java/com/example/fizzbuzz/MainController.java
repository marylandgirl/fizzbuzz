package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String printNums(){

        StringBuffer rpt = new StringBuffer();
        String fizz = null;
        String buzz = null;
        String fizzBuzz = null;
        for ( int i = 1; i < 101; i++)
        {
            rpt.append((i%3 == 0 && i%5 == 0)?"fizzbuzz<br/>":(i%3 == 0)?"fizz<br/>":(i%5 == 0)?"buzz<br/>":Integer.toString(i) + "<br/>");
        }
        return rpt.toString();
    }
}


