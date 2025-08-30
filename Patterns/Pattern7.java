import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Centered Pyramid Star Pattern");
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        pattern(x);
    }

    private static void pattern(int x) {
        for(int i=0;i<x; i++){
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
    }
}
