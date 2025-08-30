import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inverted Alphabetic Right-Angle Pattern");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=0; i<x; i++)
        {
            for(int j=i; j>=0; j--)
            {
                System.out.print((char)(65+x-j-1)+" ");
            }
            System.out.println();
        }
    }
}
