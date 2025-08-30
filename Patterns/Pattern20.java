import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.pritnln("Hollow Hourglass Star Pattern");
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        pattern(x);
    }

    private static void pattern(int x) {
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<x*2; j++)
            {
                if(j<=i || j>=x*2-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=2; i<=x; i++)
        {
            for(int j=1; j<x*2; j++)
            {
                if(j<=x-i+1 || j>=x+i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
