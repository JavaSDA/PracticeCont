package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 15mins. 4: 42 - 4: 57
        // Write a program that implements the following formula using
        // recursion.
        // nCr = n!/(n-r)!r!
        // Factorial: 4! = 4 x 3 x 2 x 1 = 24
        // create a method called factorial, to find the factorial of a number
        // entered as a parameter.
        // return the value

        // Recursion is a concept where a method calls itself.
        // There's usually a base case or condition. (This acts like the termination condition
        // in a loop).

        // Initialize Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the values of n and r.
//        System.out.print("Enter the value of n: ");
//        float n = scanner.nextFloat();
//
//        System.out.print("Enter the value of r: ");
//        float r = scanner.nextFloat();
//
//        // nCr = n!/(n-r)!r!
//        float nCr = factorial(n) / (factorial(n -r) * factorial(r));
//        // log the output to the console.
//        System.out.println("Result = " + nCr);

        // Shortcut for getters and setters is: alt + insert.
        // 30 mins.
        // Create a class called Person. They should have: // The person class will be the parent class
        // - name, age.
        // Create a class called Employee. This class should inherit // The Employee class will be the child class.
        // the Person class. and should have the extra field of
        // - company id, company name.
        // Create a class called Company. This class should take in employees as
        // an array attribute, name.
        //
        // In your main method, Populate a company's employees attribute and
        // find the average age of the employees.

        Employee[] javaEmployees = {
                new Employee("George", 35, "J12", "Microsoft"),
                new Employee("Dana", 29, "H15", "Microsoft"),
                new Employee("Harry", 28, "U23", "Microsoft")
        };

        Employee[] javascriptEmployees = {
                new Employee("Nathan", 31, "I91", "Google"),
                new Employee("Jane", 42, "A22", "Google"),
                new Employee("Jordan", 22, "O23", "Google"),
        };

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javascriptEmployees);

//        System.out.println("The average age of Microsoft employees is " + microsoft.getAverage());
//        System.out.println("The average age of Google employees is " + google.getAverage());

        System.out.println(google.getEmployee().getName());
    }

    // Create a method to find the factorial of a number.
    public static float factorial(float number) {
        // when dealing with factorials, 0! = 1, 1! = 1.
        // create the base case using an if and else statement.
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
            // 4 * factorial (4 - 1)
            // 3 * factorial(3 - 1)
            // 2 * factorial(2 - 1)
        }
    }

    // Shortcut for getters and setters is: alt + insert.
    // 30 mins.
    // Create a class called Person. They should have: // The person class will be the parent class
    // - name, age.
    // Create a class called Employee. This class should inherit // The Employee class will be the child class.
    // the Person class. and should have the extra field of
    // - company id, company name.
    // Create a class called Company. This class should take in employees as
    // an array attribute, name.
    //
    // In your main method, Populate a company's employees attribute and
    // find the average age of the employees.

    // Enumerations/Enums
    // UML - unified Modelling Languages
    // Best practices in OOP.
}
