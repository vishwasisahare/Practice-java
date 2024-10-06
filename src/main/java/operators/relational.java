
package operators;

import java.util.Scanner;


public class relational {
    public static void main(String[] args) {
        
        int a ,b;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 :");
        a = sc.nextInt();
        
        System.out.println("Enter no 2 :");
        b = sc.nextInt();
        if(a > b){
            System.out.println(a+" is lesser then B "+b);
        }
        else{
            System.out.println(a+" is not lesser then "+b);
        }
    }
    
}
