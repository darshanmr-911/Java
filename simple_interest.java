import java.util.Scanner;
class simple_interest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        int si;

        System.out.print("Enter principal amount: ");
        p = sc.nextInt();
        System.out.print("Enter rate of interest: ");
        r = sc.nextInt();
        System.out.print("Enter time period: ");
        t = sc.nextInt();

        si = ( p * r * t ) / 100;
        System.out.println("Simple Interest: " + si);
    }
}