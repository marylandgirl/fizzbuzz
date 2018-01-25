package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Java Bootcamp week 1 challenge
 * 1/25/2018 Kim Levin
 * This class displays a list of numbers or the strings "Fizz", "Buzz" or "FizzBuzz" based on
 *      certain criteria
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String printNums(){

        StringBuffer rpt = new StringBuffer();

        for ( int i = 1; i < 101; i++)
        {
            rpt.append((i%3 == 0 && i%5 == 0)?"FizzBuzz<br/>":(i%3 == 0)?"Fizz<br/>":(i%5 == 0)?"Buzz<br/>":Integer.toString(i) + "<br/>");
        }
        return rpt.toString();
    }
}


