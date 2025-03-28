// Write a program to count the occurrences of a character in a string.

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        int count = countOccurrences(str, c, 0);
        System.out.println("The character '" + c + "' appears " + count + " times.");
    }

    public static int countOccurrences(String str, char c, int index) {
        if (index == str.length()) {
            return 0;
        }
        int count = (str.charAt(index) == c) ? 1 : 0;
        return count + countOccurrences(str, c, index + 1);
    }
}