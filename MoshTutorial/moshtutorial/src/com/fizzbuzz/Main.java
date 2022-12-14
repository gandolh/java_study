package com.fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        //dummy variant
        if(number % 5 ==0 && number %3 ==0 ) System.out.println("FizzBuzz");
        else if(number % 5 ==0) System.out.println("Fizz");
        else if(number % 3 ==0) System.out.println("Buzz");
        else System.out.println(number);

        //better variant
        if(number % 5 ==0 )
            if(number % 3 ==0 )
                System.out.println("FizzBuzz");
            else System.out.println("Fizz");
        else if(number % 3 ==0)
            System.out.println("Buzz");
        else System.out.println(number);

    }
}
