package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // First exercise

        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();

        System.out.println("Is " + a + " equal to " + b + " ? - " + (a==b));
        System.out.println("Is " + a + " less than " + b + " ? - " + (a<b));
        System.out.println("Is " + a + " less or equal to " + b + " ? - " + (a<=b));
        System.out.println("Is " + a + " greater than " + b + " ? - " + (a>b));
        System.out.println("Is " + a + " greater or equal to " + b + " ? - " + (a>=b));

        // Second exercise

        System.out.println("Please enter first boolean value: ");
        boolean b1 = input.nextBoolean();
        System.out.println("Please enter first boolean value: ");
        boolean b2 = input.nextBoolean();
        System.out.println("Is b1 and b2 equal ? - " + (b1==b2));

        // Third exercise

        System.out.println("Please enter a whole number: ");
        int num = input.nextInt();
        System.out.println(num % 2 != 0);

        // Fourth exercise

        System.out.println("Please enter a boolean value: ");
        boolean bl = input.nextBoolean();
        System.out.println("Opposite of \"" + bl + "\" is \"" + !bl + "\"");

        // Fifth exercise

        
    }
}
