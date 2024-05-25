import java.util.*;

public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String Declaration
        String name = "Lakhan";
        
        String inputName = sc.nextLine();
        System.out.println(inputName);

        // Concatenation
        String firstName = "Lakhan";
        String lastName = "Gurjar";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // print length of string
        // length();
        System.out.println(fullName.length());

        // Access characters of a string 
        // charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // Compare 2 strings

        // check three cases
        //1 string1 = string2 : 0
        String myName = "Lakhan";
        if(firstName.equals(myName)){
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings.");
        }

        //2 string1 > string2 : +ve value
        //3 string1 < string2 : -ve value
        
        if (firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // this == is not applicable always for strings that's why we use .compareTo()
        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (firstName == myName){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // Substring
        String sentence = "My name is Lakhan";
        // substring(beginIndex, endIndex);
        // end is not inclusive
        // String namePart = sentence.substring(3, 10);
        // System.out.println(namePart);

        // If you don't input endIndex it will automatically take last index. 
        String namePart = sentence.substring(11);
        System.out.println(namePart);

        // Strings are Immutable i.e you cannot change(delete, add, modify) string once declared.
        
        // parseInt() method of Integer class
        String strng = "123";
        int num = Integer.parseInt(strng);
        System.out.println(num);

        // parseInt() when you try to input non-numerical string 
        String str = "Lakhan";
        try{
        int number = Integer.parseInt(str);
        System.out.println(number);
        } catch (NumberFormatException e){
            System.out.println("Error :" + e.getMessage());
        }

        // toString()
        int number = 897;
        String strin = Integer.toString(number);
        System.out.println(strin.length());
        


        /*
        // ***HOMEWORK PROBLEMS***
        Q1. Take an array of Strings input from the user & find the cumulative (combined)length of all those strings.
        int size = sc.nextInt();

        String[] array = new String[size];
        int totlength = 0;
        
        for(int i=0; i<size; i++){
            array[i] = sc.next();
            totlength += array[i].length();
        }
        System.out.println(totlength);
        
        // ***HOMEWORK PROBLEMS***
        
        Q2. Input a string from the user. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.
        Example :
        Original = "eabcdef"; result = "iabcdif"
        Original = "xyz"; result = "xyz"

        System.out.println("Enter a String : ");
        String str = sc.next();

        String result = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        
        System.out.println(result);

        // ***HOMEWORK PROBLEMS***

        Q3. Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Dispalay that username to the user.
            Example :
            email = "apnaCollegeJava@gmail.com"; username = "apnaCollegeJava"
            email = "helloWorld123@gmail.com"; username = "helloWorld123"

            System.out.println("Enter email : ");
            String str = sc.next();
    
            String username = "";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '@'){
                    break;
                } else{
                    username += str.charAt(i);
                }
            }
            System.out.println(username);

        */
        
        /* 
            // ***FOUND IT ON stackoverflow***
            
            int random;
            random = (int) (Math.random() * 10)+1;
        
            // Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess between 1 to 10 : ");
            int guess = sc.nextInt();
        
            while (guess != random) {
                if (guess < random){
                    System.out.println("You guessed too low. Try again!");
                    System.out.println("Enter your guess between 1 to 10 : ");
                    guess = sc.nextInt();
                } else if (guess > random){
                    System.out.println("You guessed too high. Try again!");
                    System.out.println("Enter your guess between 1 to 10 : ");
                    guess = sc.nextInt();
                } else {
                    if (guess == random){
                        System.out.println("You guesse it right, the number is "+ random);
                    }
                    break;
                }
                }

            */
        
    }
}
