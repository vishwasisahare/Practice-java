
package InterfaceExample;

import java.util.Scanner;


public class Demo implements Three{

    @Override
    public String myname(String name) {
       String myname = "you Enterd "+name; //from three class
       return myname;
    }

    @Override
    public void checkEvenOdd(int x) {
       if(x % 2 == 0){
           System.out.println(x+" is EVEN");
       }else{
           System.out.println(x+" is ODD");
       }
    }

    @Override
    public void methodone() {
        System.out.println("hii i am meth one");
         System.out.println("Declare in one class");
          System.out.println("Define in Demo class");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Demo d = new Demo();
        d.checkEvenOdd(55);
        d.methodone();
        System.out.println(""+d.myname("vishuuuuuuuu"));
    }
    
    
    
}
