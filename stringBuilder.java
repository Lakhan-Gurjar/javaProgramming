import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        // https://new8.filepress.store/video/61fd76bc3e060c2100cc294f
        // Strings in Java are Immutabale
        StringBuilder sb = new StringBuilder("aria");
        System.out.println(sb);

        // Get a character from index
        System.out.println(sb.charAt(3));

        // Set a character at index
        sb.setCharAt(0, 'k');
        System.out.println(sb);

        // Insert a character at some index
        sb.insert(0, 'L');
        sb.insert(1, 'a');
        sb.insert(3, 'h');
        System.out.println(sb);
        System.out.println("Length of above string : "+sb.length());

        // Delete char at some index
        // end is not inclusive
        sb.delete(0, 4);
        System.out.println(sb);

        // Append a char
        sb.append("gurjar");
        System.out.println(sb);

        // Reverse a string(using Stringbuilder class)
        // "aria" -> "aira"
        sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front = i; // 0
            int back = sb.length() - 1 - i; // 5 - 1 -0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
        
    }
}