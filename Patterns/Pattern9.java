import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full Pyramid with Inverted Pyramid");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<x-i-1; j++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<=i*2; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<x*2-i*2+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
