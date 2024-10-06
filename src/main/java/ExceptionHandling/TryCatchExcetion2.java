
package ExceptionHandling;

import java.util.Scanner;


public class TryCatchExcetion2 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter divisor :");
         int div = sc.nextInt();
         System.out.println("enter Dinominater :");
         int Dino = sc.nextInt();
         
         try{
             int cal = div/Dino;
             System.out.println("Division is :"+cal);
         }catch(Exception ex){
             System.out.println("error by user :"+ex.getMessage());
             System.out.println("error by user : plz value above zero");
             
         }
    }
   
    
    
            
    
}
