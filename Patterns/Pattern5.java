import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inverted Right-Angle Trainagle");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=x-i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
