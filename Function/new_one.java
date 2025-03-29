import java.util.Scanner;

public class new_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();

        int count = str.length();
        int count_var = str.replace("a", "").length();
        int count_a = count - count_var;
        System.out.println("The character 'a' appears " + count_a + " times.");
        sc.close();
    }
}