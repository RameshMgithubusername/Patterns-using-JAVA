import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Floyd's Triangle");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        int num = 1;
        for(int i=1; i<=x; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
