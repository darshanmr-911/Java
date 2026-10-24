import java.util.Scanner;

class rectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenth of the rectangle :");
        double lenth = sc.nextDouble();
        
        System.out.println("Enter the Width of the rectangle:");
        double Width = sc.nextDouble();
        
        double area = lenth * Width;
        
        System.out.println("The area of rectangle are :" + area);
    }
}