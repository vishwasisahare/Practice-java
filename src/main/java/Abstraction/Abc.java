
package Abstraction;


abstract class Abc { //abstraction class
    
    void add(int a ,int b, int c,int d ){   //non -abstract meth
        int result = a + b + c + d;   
        System.out.println("addtion is :"+result);
           
    }
    abstract void sub();
    
    
}
