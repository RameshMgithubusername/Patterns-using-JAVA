import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inverted Right-Angled Alphabet Triangle");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<x-i; j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
