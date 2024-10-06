
package Methods;

import java.util.Scanner;

public class Arithmetic {
    
    void cal(int x,int y, char operator){
        int result =0;
        switch(operator){
            case '+':
            result = x + y;
            System.out.println("Addition is :"+result);
            break;
            case '-':
            result = x - y;
            System.out.println("substraction is :"+result);
            break;
            case '*':
            result = x * y;
            System.out.println("Multiplication is :"+result);
            break;
            case '/':
            result = x / y;
            System.out.println("Division is :"+result);
            break;
            case '%':
            result = x % y;
            System.out.println("Modulus is :"+result);
            break;
            default:
            System.out.println(operator+" is invalid operator");  
            break;
                 
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a = sc.nextInt();
        System.out.println("Enter number 2 :");
        int b = sc.nextInt();
        System.out.println("Choose any operator (+,-,*,/,%)");
        char opt = sc.next() .charAt(0);
        
        Arithmetic ar = new Arithmetic();
        ar.cal(a, b, opt);
        
    }
    

}