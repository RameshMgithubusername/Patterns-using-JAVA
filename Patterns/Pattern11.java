import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Right-Angled Triangle");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        int temp = 1;
        for(int i=0; i<x; i++)
        {
            temp = (i%2==0)?1:0;
            for(int j=0; j<=i; j++)
            {
                System.out.print(temp);
                temp = (temp==1)?0:1;
            }
            System.out.println();
        }
    }
}
