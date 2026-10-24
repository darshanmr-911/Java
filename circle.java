import java.util.Scanner;
class circle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double Area = pi * r * r;
        System.out.println("The area of circle is " + Area);
    }
}