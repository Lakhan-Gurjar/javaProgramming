

public class Patterns {
    public static void main(String[] args){

        /* 
        // Solid Rectangle
        int n = 4;
        int m = 5;
        // outer loop = rows
        for(int i = 1; i <= n; i++){
            // Inner loop = columns 
            for (int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        // Hollow Rectangle
        int n = 4;
        int m = 5;
        // Outer loop
        for (int i = 1; i <= n; i++){
            // Inner loop
            for (int j=1; j <= m; j++){
                // Cell -> (i,j)
                if (i == 1|| j == 1 || i ==n || j == m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        /*
        // Half Pyramid
        int n = 4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        */

        /*
        // Inverted Half Pyramid
        int n = 4;
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        // Inverted Half Pyramid (rotated by 180 deg)
        int n = 4;
        //outer loop -> rows
        for (int i = 1; i <= n; i++){
            //inner loop -> space print
            for (int j=1 ; j <= n-i; j++){
                System.out.print(" ");
            }
            //inner loop -> columns 
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        
        */

        /*
        // Half Pyramid with Numbers

        // method-1
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 

        // method-2
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */

        /* 
        // Inverted Half Pyramid with Numbers

        // method-1
        int n = 5;
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
            
        // method-2
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        /* 
        // Floyd's Triangle

        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
        
        int n = 5;
        int number = 1;
        for (int i =1; i <= n; i++){
            for(int j=1; j <=i; j++){
                System.out.print(number+ " ");
                number++; // number = number + 1
            }
            System.out.println();
        }
        */
        
        /* 
        // 0-1 Triangle
        
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // ***HOMEWORK QUESTIONS***
        // ***HOMEWORK QUESTIONS***
        // ***HOMEWORK QUESTIONS***

        /* 
        // Solid Rhombus

                * * * * *
              * * * * *
            * * * * *
          * * * * *
        * * * * *
        

        int n = 5;
        
        // rows
        for (int i = 1; i <= n; i++){
            // spaces
            for (int j = 1; j <= n -i; j++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /* 
        // number pyramid
        
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5

        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        */

        /* 
        // palindromic number pyramid

                  1
                2 1 2
              3 2 1 2 3
            4 3 2 1 2 3 4
          5 4 3 2 1 2 3 4 5

        
        
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
    }
}
