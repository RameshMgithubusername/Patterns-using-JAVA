import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inverted Centered Pyramid Star Pattern");
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        pattern(x);
    }

    private static void pattern(int x) {
        for(int i=1;i<=x; i++){
            for(int j=1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<=x*2-i*2; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
