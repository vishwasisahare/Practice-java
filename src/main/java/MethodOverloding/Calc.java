
package MethodOverloding;


public class Calc {
    
    void add(int a ,int b){
        int ans = a+b;
        System.out.println("Addtion of two no is"+ans);
    }
     void add(double a ,double b, double c){
        double ans = a+b+c;
        System.out.println("Addtion of three no is"+ans);
    }
      void add(int a ,int b,int c){
        int ans = a+b+c;
        System.out.println("Addtion of Three no is"+ans);
    }
       void add(String name ,String surname){
        String fullname = name+" "+surname;
        System.out.println("fullname is :"+fullname);
    }
  
    
    public static void main(String[] args) {
        Calc c= new Calc();
        c.add(11, 025);
        c.add(22.2, 052.2, 0256.2);
        c.add(22, 52, 45);
        c.add("vishu", "sahare");
         
        
    }
            
    
}
