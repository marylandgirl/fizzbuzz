package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

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

    @RequestMapping("/bonus")
    public String printSelectNums(){

        System.out.println("Enter an ending number");
        Scanner keyboard = new Scanner(System.in);
        String ent = keyboard.next();
        boolean parsable = isParsable(ent);

        while ( !parsable && !ent.equalsIgnoreCase("x") ) {
            System.out.println("Enter an ending number");
            keyboard = new Scanner(System.in);
            ent = keyboard.next();
            parsable = isParsable(ent);
        }

        StringBuffer rpt = new StringBuffer();

        int num = 0;

        if ( ent.equalsIgnoreCase("x")) {
            num = 100;
        } else if (parsable){
            num = Integer.parseInt(ent);
        }

        for ( int i = 1; i < num + 1; i++)
        {
            rpt.append((i%3 == 0 && i%5 == 0)?"FizzBuzz<br/>":(i%3 == 0)?"Fizz<br/>":(i%5 == 0)?"Buzz<br/>":Integer.toString(i) + "<br/>");
        }
        return rpt.toString();
    }


    public static boolean isParsable(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }
}


