import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inverted Right-Angle Reverse Order");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=x-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
