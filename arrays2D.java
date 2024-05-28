import java.util.*;

public class arrays2D {
    public static void main (String[] args){

        // Scanner sc = new Scanner(System.in);
        /* 
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
        */

        /* 
        // ***Sample Question***
        Q. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
        
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number to find : ");
        int x = sc.nextInt();

        // Search x
        for(int i =0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i][j] == x){
                    System.out.println("The number "+x+" is found at index ("+i+","+j+")");
                }
            }
        }
        */

        /*
        // ***HOMEWORK QUESTION***

        Q1. Print the spiral order matrix as output for a given matrix of numbers.
            For example : for the given matrix, 

            01 05 07 09 10 11
            06 10 12 13 20 21
            09 25 29 30 32 41 
            15 55 59 63 68 70
            40 70 79 81 95 105

            Spiral order is given by :
            01 05 07 09 10 11 21 41 70 105 95 81 79 70 40 15 09 06 10 12 
            13 20 32 68 63 59 55 25 29 30 29

            APPROACH :
            Algorithm: (We are given a 2D matrix of n X m ).
            1. We will need 4 variables:
            a. row_start - initialized with 0.
            b. row_end - initialized with n-1.
            c. column_start - initialized with 0.
            d. column_end - initialized with m-1.

            2. First of all, we will traverse in the row row_start from column_start
            to column_end and we will increase the row_start with 1 as we have
            traversed the starting row.

            3. Then we will traverse in the column column_end from row_start to
            row_end and decrease the column_end by 1.

            4. Then we will traverse in the row row_end from column_end to
            column_start and decrease the row_end by 1.

            5. Then we will traverse in the column column_start from row_end to
            row_start and increase the column_start by 1.

            6. We will do the above steps from 2 to 5 until row_start <= row_end
            and column_start <= column_end.

            -: Source code :-

            System.out.println("Enter number of rows : ");
            int n = sc.nextInt();
            System.out.println("Enter number of columns : ");
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
    
            // input
            // rows
            for(int i=0; i<n; i++){
                // columns
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
    
            System.out.println("The Spiral Order Matrix is : ");
            int row_start = 0;
            int row_end = n-1;
            int column_start = 0;
            int column_end = m-1;
    
            // To print spiral order matrix
            while(row_start <= row_end && column_start <= column_end){
    
                // 1
                for(int column = column_start; column <= column_end; column++){
                    System.out.println(matrix[row_start][column] + " ");
                }
    
                row_start++;
    
                //  2
                for(int row = row_start; row <= row_end; row++){
                    System.out.println(matrix[row][column_end]+ " ");
                }
    
                column_end--;
    
                // 3
                for(int column = column_end; column>= column_start; column--){
                    System.out.println(matrix[row_end][column]+ " ");
                }
    
                row_end--;
    
                // 4
                for(int row=row_end; row>=row_start; row--){
                    System.out.println(matrix[row][column_start] + " ");
                }
    
                column_start++;
    
                System.out.println();
            }

            Q2. For a given matrix of N x M, print its transpose.

            System.out.println("Enter number of rows : ");
            int n = sc.nextInt();
            System.out.println("Enter number of columns : ");
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
    
            // input
            // rows
            for(int i=0; i<n; i++){
                // columns
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
    
            System.out.println("The transpose matrix is : ");
    
            for(int j=0; j<m; j++){
                for(int i=0; i<n; i++){
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
        */
            

    }
    
}
