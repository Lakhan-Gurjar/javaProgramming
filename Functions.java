import java.util.*;
public class Functions {

    public static void printMyName(String name){
        // System.out.print(name);
        System.out.println("Your name is "+ name);
        return;
    }

    public static int calculateSum(int x, int y){
        int sum = x+y;
        return sum;
    }

    public static int calculateProduct(int x, int y){
        int product = x*y;
        return product;
    }

    public static void calculateFactorial(int a){
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial=1;
        for(int i =a; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    // ***HOMEWORK QUESTION***
    public static void checkPrime(int n){
        int prime=0;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
            prime ++ ;
            break;
            }
        }
        if(prime == 0){
            System.out.print("Prime Number");
        } else{
            System.out.println("Not Prime Number");
        }
    }

    // ***HOMEWORK QUESTION***
    public static void checkEven(int n){
        if(n%2 == 0){
            System.out.print("Even Number");
        } else {
            System.out.print("Odd Number");
        }
    }


    // ***HOMEWORK QUESTION***
    public static void printTable(int n){
        for(int i=1; i<=10; i++){
            int product = n*i;
            System.out.println(product);
        }
    }

    // ***HOMEWORK QUESTION***
    // Read about Recursion

    
    public static void main(String[] args){
        // System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyName(name);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum (a,b);
        // System.out.println("The sum of " + a + " and " + b + " is " + sum);

        // calculateProduct(a, b);
        // System.out.print("The product of " + a + " and " + b + " is " + calculateProduct(a, b));

        // calculateFactorial(a);
        
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        // checkPrime(n);
        
        // int n = sc.nextInt();
        // checkEven(n);
        
        // int n = sc.nextInt();
        // System.out.println("Table of "+n+" is : ");
        // printTable(n);

        

    }
    
}
