
package operators;

import java.util.Scanner;


public class vowels {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any  char check wovel and consonent :"); 
        char ch = sc.next() .charAt(0);
        
        if(ch == 'a' || ch == 'A') {
            System.out.println(ch+"is wovel :");
        }else if(ch == 'e' || ch == 'E'){
            System.out.println(ch+"is wovel :");
        }else if(ch == 'i' || ch == 'I'){
            System.out.println(ch+"is wovel :");
        }else if(ch == 'o' || ch == 'O'){
            System.out.println(ch+"is wovel :");
        }else if(ch == 'u' || ch == 'U'){
            System.out.println(ch+"is wovel :");
        }else{
            System.out.println(ch+" is consonent :");
        }
        
        
    }
}

