// Write a program to check whether a given string is a palindrome or not.

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the string");
        String s = sc.nextLine();
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
                  
            // extracts each character
          ch = s.charAt(i);
        
            // adds each character in
          // front of the existing string
          r = ch + r; 
      }
      if (s.equals(r)){
        System.out.println("a palindrome.");    
      }
        else{
            System.out.println("not a palindrome.");
        }
    }
}