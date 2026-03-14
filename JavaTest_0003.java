import java.util.Scanner;

public class JavaTest_0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            int num;
            if (i % 2 == 1)
                num = 1;  
            else
                num = 0;   

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = 1 - num;   
            }

            System.out.println();
        }
    }
}