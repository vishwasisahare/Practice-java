
package Abstraction;


public class Xyz extends Abc{
    
    void div (){
        int a = 10, b =20 , c =a/b;
        System.out.println("div is :"+c);
   
    }

   

    @Override
    void sub() {
        int a =20,b =5 ,c = a +b;
        System.out.println("sub is :"+c);
        
    }
    public static void main(String[] args) {
        Xyz x = new Xyz();
        
        
        x.div();//div from xyz class
        x.add(20, 55, 10, 14);//non abc meth from abc class
        x.sub(); //abc sub from abc class
    }
    
}
