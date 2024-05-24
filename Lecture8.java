import java.util.*;
public class Lecture8 {
    

    // ***QUESTION 1***
    public static void calculateAverage(int x, int y, int z){
        int Average = (x+y+z)/3 ; 
        System.out.println("Average of "+ x+", "+y+" and "+z +" is "+Average);
    }

    // ***QUESTION 2***
    public static void printSum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    // ***QUESTION 3***
    public static void getGreater(int x, int y){
        if(x>y){
            System.out.println(x+" is greater than "+ y);
        } else {
            System.out.println(y+" is greater than "+ x);
        }
    }

    // ***QUESTION 4***
    public static void getCircumference(double r){
        double circumference = (2*(3.14)*r);
        System.out.println(circumference);
    }

    // ***QUESTION 5***
    public static void isElligible(int age){
        if(age>=18){
            System.out.println("You can vote.");
        } else if(age<=0){
            System.out.println("Enter a valid age.");
        } else{
            System.out.println("Sorry, you cannot vote.");
        }
    }

    // ***QUESTION 6***
    public static void infinteLoop(){
        int i=1;
        int b=1;
        do{
            System.out.print("Manifestation");
            System.out.println(b);
            i++;
            b++;
        }while (i>0);
    }

    // ***QUESTION 7***
    public static void showNumber(int input){
        int positive=0, negative =0, zeros =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue & 0 to stop");
        while(input == 1){
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        if(number > 0){
            positive++;
        } else if (number < 0){
            negative++;
        }else{
            zeros++;
        }

        System.out.println("Press 1 to continue & 0 to stop");
        // input = sc.nextInt();
        }
        System.out.println("Positives : "+positive);
        System.out.println("Negatives : "+negative);
        System.out.println("Zeros : "+zeros);
        
    }

    // ***QUESTION 8***
    public static void getSquare(int n, int x){
        int result=1;
        for(int i=0; i<n; i++){
            result = result * x;
        }
        System.out.println(x+ " to the power of " + n+ " is "+result);
    }

    // ***QUESTION 9***
    public static void GCD(int n1, int n2){
        int original_n1 = n1;
        int original_n2 = n2;
        while(n1 % n2 != 0){
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }

        int gcd = n2;
        int lcm = (original_n1*original_n2)/gcd;

        System.out.println("HCF : "+ gcd);
        System.out.println("LCM : "+ lcm);
    }

    // ***QUESTION 10***
    public static void printFibonacci(int n){
        int fib1=0, fib2 = 1;
        System.out.print(fib1+" ");
        if (n>fib1){
            // find nth term
            for(int i=1; i<=n; i++){
                System.out.print(fib2+" ");
                int temp = fib2;
                fib2 = fib1 + fib2; 
                fib1 = temp;
            }
        }
    }
    
    
    public static void main(String[] args){
        // System.out.println("Enter 3 numbers : ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // calculateAverage(a, b, c);
        
        // int n = sc.nextInt();
        // printSum(n);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // getGreater(a, b);
        
        // int r = sc.nextInt();
        // getCircumference(r);

        // int age = sc.nextInt();
        // isElligible(age);
        
        // infinteLoop(); 
        
        // int input = sc.nextInt();
        // showNumber(input);

        // System.out.print("Enter x :");
        // int x = sc.nextInt();
        // System.out.print("Enter n :");
        // int n = sc.nextInt();
        // getSquare(n, x);
        
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // GCD(n1, n2);
        
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        // printFibonacci(n);


    }
    
}
