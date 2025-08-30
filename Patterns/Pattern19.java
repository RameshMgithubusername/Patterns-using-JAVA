import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butterfly Pattern");
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        pattern(x);
    }

    private static void pattern(int x) {
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=x-i+1; j++){
                System.out.print("* ");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print("    ");
            }
            for(int j=1; j<=x-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<x-i+1; j++)
            {
                System.out.print("    ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
