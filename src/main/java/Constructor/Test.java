
package Constructor;

import java.util.Scanner;

public class Test {
    
    
    Test(){
        int a =100 ,b =20 ,c = a+b;
        System.out.println("Addition using default constructor :"+c);
    }
    Test(int x){
        System.out.println("value of x is :"+x);
    }
    Test(int a ,int b){
        System.out.println("Addition using parameter conteructor :"+(a+b));
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 :");
        int a = sc.nextInt();
        System.out.println("Enter value 2 :");
        int b = sc.nextInt();
        Test t = new Test();
        Test t1 = new Test(45);
        Test t2 = new Test(a,b);
    }
    
}
