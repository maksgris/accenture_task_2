package com.company;
import java.util.*;

public class Main {

    public static void firstExercise(int a, int b) {
        System.out.println("Is " + a + " equal to " + b + " ? - " + (a == b));
        System.out.println("Is " + a + " less than " + b + " ? - " + (a < b));
        System.out.println("Is " + a + " less or equal to " + b + " ? - " + (a <= b));
        System.out.println("Is " + a + " greater than " + b + " ? - " + (a > b));
        System.out.println("Is " + a + " greater or equal to " + b + " ? - " + (a >= b));
    }

    public static void secondExercise(boolean a, boolean b) {
        System.out.println("Is b1 and b2 equal ? - " + (a==b));
    }

    public static void thirdExercise(int a) {
        System.out.println(a % 2 == 0);
    }

    public static void fourthExercise(int a) {
        System.out.println(a % 2 != 0);
    }

    public static void fifthExercise(boolean a) {
        System.out.println("Opposite of \"" + a + "\" is \"" + !a + "\"");
    }

    public static void sixthExercise(int a, int b) {
        System.out.println("a is " + a + " and b is " + b + " -> " + ((a==b) || (a<0 && b>0) || (a>1001 && b>1001)));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // First exercise

        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("Please enter second number: ");
        int b = input.nextInt();
        firstExercise(a ,b);

        // Second exercise

        System.out.println("Please enter first boolean value: ");
        boolean b1 = input.nextBoolean();
        System.out.println("Please enter first boolean value: ");
        boolean b2 = input.nextBoolean();
        secondExercise(b1, b2);

        // Third exercise

        System.out.println("Please enter a whole number: ");
        int num = input.nextInt();
        thirdExercise(num);

        // Fourth exercise

        System.out.println("Please enter a whole number: ");
        int num2 = input.nextInt();
        fourthExercise(num);

        // Fifth exercise

        System.out.println("Please enter a boolean value: ");
        boolean bl = input.nextBoolean();
        fifthExercise(bl);

        // Sixth exercise

        System.out.println("Please enter first number: ");
        int c = input.nextInt();
        System.out.println("Please enter second number: ");
        int d = input.nextInt();
        sixthExercise(c, d);

    }
}
