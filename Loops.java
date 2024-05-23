//  import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        // for (int i = 0; i < 11; i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while(i < 11){
        //     System.out.println(i);
        //     i++;
        // }
        
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 11);

        // int i = 12;
        // while (i <11){
        //     System.out.println("Apna College");
        // }

        // do {
        //     System.out.println("Apna College");
        // }while(i < 11);

        //  Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);
            
        // int n = sc.nextInt();
        // for (int i = 1; i < 11; i++){
        //     System.out.println(n*i);
        // }

        /* 
        Homework Problems
        
        Q1. Print all even numbers till n.
        Ans.for(int i = 1; i <= n; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        
        Q2. Run this code
            
            for (; ;) {
                System.out.println("Apna College");
            }
        
            loop on your system and analyze what happens. Try to think of the reason 
            for the output produced.
        
        Ans. This Creates an infinite loop because condition is not specified.
        
        Q3. Make a menu-driven program. The user can enter 2 number, either 1 or 0.
            If the user enters 1 then keep taking input from the user for a student's 
            marks (out of 100).
        
            If they enter 0 then stop.
            If he/she scores :
        
                Marks >= 90 -> print "This is Good"
                89 >= Marks >= 60 -> print "This is also Good"
                59 >= Marks >= 0 -> print "This is Good as well"
        
            Because marks don't matter but our effort does.
        
        Ans.int input;


            do {
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid");
                }


                System.out.println("Want to continue ? (yes(1) or no(0))");
                input = sc.nextInt();
            
            } while(input == 1);


        BONUS
            
        Qs. Print if a number is prime or not (Input n from the user).
        Ans.System.out.println("Enter a number : ");
            int n = sc.nextInt();
            int count = 0;

            for (int i = 1; i <= n; i++){
                if (n % i == 0){
                    count ++;
                }
            }

            // int i = 0;
            // do {
            //     i++;
            //     if ( n % i == 0){
            //         count ++;
            // }
            // }while(i <= n);

            if (count == 2){
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        */

            
            
    }
}
