import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.pritnln("Ascending Number Triangle");
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
            System.out.println();
        }
    }
}
