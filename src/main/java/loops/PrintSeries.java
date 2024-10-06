
package loops;

import java.util.Scanner;


public class PrintSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no to print a series :");
        int num = sc.nextInt();
         //for decrement
         //i=100      i>=num    i--
         for(int i=1; i<=num ; i++ ){
             System.out.println(i);
         }
    }
    
}
