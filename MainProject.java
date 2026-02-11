/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main.project;
import java.util.*;

/**
 *
 * @author robbe
 */
public class MainProject {

    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer: ");
        int a = input.nextInt();
        System.out.println("Please enter an integer: ");
        int b = input.nextInt();
        System.out.println("Please enter an integer: ");
        int c = input.nextInt();
        
        // check if input = 6
        
        if (a == 6) {
            System.out.println("Since you have entered the number 6, true.\n");
        } else {
            System.out.println("You have not entered 6");
        }
        if (b == 6) {
            System.out.println("Since you have entered the number 6, true.\n");
        }
        if (c == 6) {
            System.out.println("Since you have entered the number 6, true.\n");
        }
        
        if (a % 2 == 0) {
            System.out.print("This number is even.\n");
        } else {
            System.out.print("This number is odd.\n");
        }
        
        if (b % 2 == 0) {
            System.out.print("This number is even.\n");
        } else {
            System.out.print("This number is odd.\n");
        }
        
        if (c % 2 == 0) {
            System.out.print("This number is even.\n");
        } else {
            System.out.print("This number is odd.\n");
        }
        // process and output for arithmetic
        
        System.out.format("The number is: %d\n", a);
        System.out.format("The number is: %d\n", b);
        System.out.format("The number is: %d\n", c);
        System.out.format("a + b + c is: %d\n", a+b+c);
        System.out.format("(a+b)/c is: %d\n", (a+b)/c);
        System.out.format("a*b*c is: %d\n", a*b*c);*/
        
        // array listing?? 5 feb 
        /*
        double[] x = {16, 17, 18, 19, 19, 17, 16, 16, 20, 17, 18, 15};
        
        for (int i = 0; i < x.length; i++) {
            System.out.format("x%d = %f\n", i, x[i]);
        } 
        */
        
        // dice roller /* */
        
        // incremental
        /*
        int a, b;
        a = 10;
        b = a++;
        
        System.out.format("a = %d\n", a); // post increment, shows up as 11
        System.out.format("b = %d\n", b); // assigned value first, no inc.
        */
        
        // 10 feb
        
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = input.nextInt();
        
        //String type = (n % 2 == 0) ? "even" : "odd"; // alternative if statement
        
        System.out.format("The number %d is an %s number.", n, (n % 2 == 0) ? "even" : "odd");
        */
        
        // bigger number
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();
        
        int max_num = Math.max(n1, n2);
        
        System.out.format("The number that is greater is: %d", max_num);

    } // end of main
} // end of class 
