package com.company;
import java.util.*;
public class Main {
    static void firstExercise() {
        System.out.println("Enter numbers (for quit enter char) : ");
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            if (in.hasNextInt())
                System.out.println(in.nextInt());

            else
                return;


        }
    }
    static void secondExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter N squirrels :");
        int squirrels = insert.nextInt();

        System.out.println("Enter K nuts :");
        int nuts = insert.nextInt();
        int results = nuts / squirrels;
        System.out.println("Are : " + results);
    }

    static void thirdExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter three digit number :");
        int threeDigitNumber = insert.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= 3 ; i++ ) {
            sum += threeDigitNumber % 10;
            threeDigitNumber /= 10;
        }
        System.out.println("Sum of digits : " + sum);
    }
    static void fourthExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter H :");
        int H = insert.nextInt();
        System.out.println("Enter A :");
        int A = insert.nextInt();
        System.out.println("Enter B :");
        int B = insert.nextInt();
        int result = 0;
        int count =0 ;
        boolean flag = true;
        while (flag){
            result += A;
            count++;
            if (result >= H) {
                System.out.println("In a : " + count + " days !");
                flag = false;
            }
            result -= B ;
        }
    }

    static void fifthExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter distance :");
        int d = insert.nextInt();
        System.out.println("Enter hours :");
        int h = insert.nextInt();
        System.out.println("Speed is :" + (float)d/(float)h);
    }

    static void sixthExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter first value :");
        double d = insert.nextDouble();
        System.out.println("Enter second value :");
        double h = insert.nextDouble();
        double diff = h - d;
        System.out.println("Difference is :" + diff);
    }

    static void seventhExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter value :");
        int d = insert.nextInt();
        boolean flag = d < 10 && d > 0 ;
        System.out.println(flag);
    }

    static void eighthExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter first value :");
        int f = insert.nextInt();
        System.out.println("Enter second value :");
        int s = insert.nextInt();
        System.out.println("Enter third value :");
        int t = insert.nextInt();
        boolean flag = f == s && s == t;
        System.out.println(flag);

    }
    static void ninthExercise() {
        Scanner insert=new Scanner(System.in);
        System.out.println("Enter first value :");
        int f = insert.nextInt();
        System.out.println("Enter second value :");
        int s = insert.nextInt();
        System.out.println("Enter third value :");
        int t = insert.nextInt();
        boolean flag = f > 0 ^ s >0 ^ t >0;
        if (f > 0 && s > 0 && t > 0){
            System.out.println(false);
        }else
            System.out.println(flag);
    }
    public static void main(String[] args) {
        System.out.println("First exercise : \n");
        firstExercise();

        System.out.println("Second exercise : \n");
        secondExercise();

        System.out.println("Third exercise : \n");
        thirdExercise();

        System.out.println("Fourth exercise : \n");
        fourthExercise();

        System.out.println("Fifth exercise : \n");
        fifthExercise();

        System.out.println("Sixth exercise : \n");
        sixthExercise();

        System.out.println("Seventh exercise : \n");
        seventhExercise();

        System.out.println("Eighth exercise : \n");
        eighthExercise();

        System.out.println("Ninth exercise : \n");
        ninthExercise();
    }
}
