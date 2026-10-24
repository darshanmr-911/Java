// public class remainder {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 3;
//         int result = a % b;
//         System.out.print("The remainder of dividing " + a + " by " + b + " is: " + result);
//     }
// }

import java.util.Scanner;

public class remainder{
    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        int result = a % b;
        System.out.print("The remainder of dividing " + a + " by " + b + " is: " + result);
    }
}