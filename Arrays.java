import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3]; // Defining an Array(method 1)
        // int marks[] = new int[3]; // also applicable 
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // int[] marks = {98, 97, 95}; // Defining an Array(method 2)


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // /* 
        int[] numbers = new int[size];
        
        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println(x + " found at index : " + i);
            }
        }
        // */

        /*

        // ***HOMEWORK QUESTION***
        
        Q1. Take an array of names as input from the user and print them on the screen.
        
        String[] names = new String[size];

        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        for(int i=0; i<names.length; i++){
            System.out.println("Name "+ (i+1) + " is : " + names[i]);
        }

        Q2. Find the maximum & minimum number in an array of integers.
        
        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i]; 
            }

        }
        System.out.println("The maximum number in this array is : "+ max);
        System.out.println("The minimum number in this array is : "+ min);

        Q3. Take an array of numbers as input and check if it is an array sorted in ascending order.

        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){ // Notice number.length -1 as termination condition
            if(numbers[i] > numbers[i+1]){ // This is the condition for descending order
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending order.");
        } else{
            System.out.println("The array is not sorted in ascending order.");
        }
        */
        
        
    }
}