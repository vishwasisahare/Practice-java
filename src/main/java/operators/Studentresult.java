
package operators;

import java.awt.BorderLayout;
import java.util.Scanner;


public class Studentresult {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        
        System.out.println("Enter sub1: ");
        int sub1 = sc.nextInt();
        
        System.out.println("Enter sub2: ");
        int sub2 = sc.nextInt();
        
        System.out.println("Enter sub3: ");
        int sub3 = sc.nextInt();
        
         System.out.println("Enter sub4: ");
         int sub4 = sc.nextInt();
         
        System.out.println("Enter sub5: ");
          int sub5 = sc.nextInt();
          
        if(sub1 >= 45 && sub2 >= 45 && sub3 >= 45 && sub4 >= 45 && sub5 >= 45){
        System.out.println("you are pass");
    }else{
            System.out.println("you are not pass");
            }
            
        }
            
        
    
    
}
