
package loops;

import java.util.Scanner;


public class DoWhileloop {
    
    public static void main(String[] args) {
        int i =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no to print table :");
        int n =sc .nextInt();
        do {            
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        } while (i<=10);
    }
    
}
