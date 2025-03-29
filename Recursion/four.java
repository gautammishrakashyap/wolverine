// Write a program to remove duplicates from a string.

// Input: "aabbcc" Output: "abc"
import java.util.Scanner;   
public class four {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a string: ");  
        String str = sc.nextLine();  
        String result = removeDuplicates(str);  
        System.out.println("String after removing duplicates: " + result);  
    }  

    public static String removeDuplicates(String str) {  
        if (str.length() == 0) {  
            return "";  
        }  
        char ch = str.charAt(0);  
        String restOfString = str.substring(1);  
        if (restOfString.indexOf(ch) != -1) {  
            return removeDuplicates(restOfString);  
        } else {  
            return ch + removeDuplicates(restOfString);  
        }  
    }
 
}