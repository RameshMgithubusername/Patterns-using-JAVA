import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Right-Angled Number Triangle");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
