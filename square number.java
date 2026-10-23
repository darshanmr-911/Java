import java.util.Scanner;

class SquareNumber {
    public static void main(String[] args) {
        int number, square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        square = number * number;
        System.out.println("The square of " + number + " is: " + square);
        sc.close();
    }
}