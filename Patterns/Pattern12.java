import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            for(int j=i; j<x; j++)
            {
                System.out.print("    ");
            }
            for(int j=i; j>0; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
