package Question_10;

import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array (n): ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i=1; i<n; i++) {
            System.out.print("Enter values a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("An array in which every second element is deleted: ");
        for(int i=1; i<n; i++) {
            if(i%2!= 0) {
            } else if (i%2==0) {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }
}
