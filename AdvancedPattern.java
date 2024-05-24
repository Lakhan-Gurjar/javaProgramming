public class AdvancedPattern {
    public static void main(String args[]){
        /* 
        // Butterfly Pattern

        int n=4;

        // upper half
        for (int i =1; i <= n; i++){
            // 1st part
            for (int j =1; j<= i; j++){
                System.out.print("*");
            }
            
            // spaces
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        // Lower half
        for (int i =n; i >= 1; i--){
            // 1st part
            for (int j =1; j<= i; j++){
                System.out.print("*");
            }
            
            // spaces
            int spaces = 2*(n-i);
            for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        // Solid Rhombus
        int n =5; 
        for (int i=1; i<= n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        // Number Pyramid
        int n=5;
        for (int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */

        /* 
        // Palindromic Pyramid
        int n = 5;        
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // 1st half numbers 
            for(int j=i; j>= 1; j--){
                System.out.print(j);
            }

            // 2nd half numbers
            for(int j=2; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /* 
        // Diamond Pattern 
        int n=4;

        // Upper half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        // Hollow Rhombus

                * * * * *
              *       *
            *       *
          *       *
        * * * * *

        int n = 8;
        // rows
        for(int i=1; i<= n; i++){
            // spaces
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            // stars
            if(i==1 || i==n){
                for(int j =1; j<= n; j++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        } 

        */

        /* 

        //  Pascal's Triangle

            1
           1 1
          1 2 1 
         1 3 3 1
        1 4 6 4 1
        
        */

        /* 

        // Number Pyramid

           1
          1 2
         1 2 3 
         1 2 3 4 
        1 2 3 4 5

        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
         */

        /*

        // print this pattern

        11111
        222
        33
        4
        
        int n=4;
        for(int i=1; i<=n ; i++){
            for(int j=n; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
        */

        

    }
}
