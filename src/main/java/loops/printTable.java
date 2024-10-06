
package loops;

import java.util.Scanner;

public class printTable {
    
    public static void main(String[] args) {
        
        Scanner vishu = new Scanner(System.in);
        System.out.println("Enter any number to create table :");
        int n = vishu.nextInt();
        
        for( int i= 1; i<=10 ; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        } 
    }
    
}
