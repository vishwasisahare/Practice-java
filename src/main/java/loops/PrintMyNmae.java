
package loops;

import java.util.Scanner;


public class PrintMyNmae {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no to searies:");
        int num =sc.nextInt();
        int no = sc.nextInt();
        
        for(int i=1 ; i<=num ;i++){
            System.out.println(i);
        }
            int m = 0;
             while(m <= no) {            
                 System.out.println(m);
                 m++;
        }
    }
    
}

