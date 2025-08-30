import java.util.Arrays;
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.pritnln("Number Square Spiral Layer Pattern");
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        int[] arr = new int[4];
        int n = x*2-1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[0] = i;
                arr[1] = j;
                arr[2] = n-i-1;
                arr[3] = n-j-1;
                Arrays.sort(arr);
                System.out.print(n-arr[0]+" ");
            }
            System.out.println();
        }
    }
}
