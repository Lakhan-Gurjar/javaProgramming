import java.util.*;
public class bitManipulation {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      sc.close();
      /*
        What is bitmasking?
        Bitmasking in Java is a technique used in binary operations where specific
        bits within a number are modified or checked. It involves using bitwise
        operators to
        perform these operations efficiently.
        */

        /*
         
        // GetBit --> checks at a certain position whether the bit is 0 or 1.
        
        Q. Get the 4th bit (position = 3) of a number n. (n = 0101)
        
        int n = 5; // 0101
        int i = 2;
        int bitMask = 1<<i;
        
        int result = bitMask & n;
        // if((bitMask & n) == 0){
        if(result == 0){
        System.out.println("Bit at pos "+i+" is 0");
        } else {
        System.out.println("Bit at pos "+i+" is 1");
        }
        
        // SetBit --> checks a bit at certain position and change it to 1
        
        Q. Set the 2nd bit (position = 1) of a number n. (n = 0101)
        
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1 << pos;
        
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        
        // ClearBit --> changing the bit to 0 i.e. clear bit
        
        Q. clear the 3rd bit (position = 2) of a number n. (n = 0101)
        
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos;
        
        int newNumber = (~bitMask & n);
        System.out.println(newNumber);
        
        // Update Bit --> checks bit at a certain position and update the bit i.e. if
        the bit is 0 update it to 1 or if the bit is 1 update it to 0.
        
        Q. Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
        
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper = 1 -> set; oper = 0 -> clear
        int n = 5; 
        int pos = 1; 
        
        int bitMask = 1<<pos ;
        if(oper == 1) {
          // set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        *** HOMEWORK QUESTIONS ***
        Q1. Write a program to find if a number is a power of 2 or not.

        Q2. Write a program to toggle a bit a position = "pos" in a number "n".
        
        ANS. System.out.println("Enter a number n : ");
             int n = sc.nextInt();
       
             System.out.println("Enter the position of bit to be toggle : ");
             int pos = sc.nextInt();
       
             int bitMask = 1<<pos;
             
             if((bitMask & n) == 0) {
              int setNumber = bitMask | n;
              System.out.println(setNumber);
                  
             } else {
              int newBitMask = ~(bitMask);
              int clearNumber = newBitMask & n;
              System.out.println(clearNumber);
             }
        Q3. Write a program to count the number of 1's in a binary representation of the number.

        Q4. Write 2 functions => decimalToBinary() & binaryToDecimal()to convert a number from one number system to another.

       */
        }
}
