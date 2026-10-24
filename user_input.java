import java.util.Scanner;

public class user_input {
    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Sum of Two number is: " + (a + b));
    }
    
}
