
package Constructor;


public class Demo {
    
    //default constructor OR NO argument/Parameter constructor
    Demo( int a ,int b){
        System.out.println(a+b);
    
    }
    Demo(int x ,float y){
         System.out.println(x+y);
    }
    void show(){
        System.out.println("this is show method");
    }
    public static void main(String[] args) {
        Demo d = new Demo(55,5);
        Demo d1 = new Demo(45,2);
        Demo d2 = new Demo(10,1.20f);
        d1.show();
    }
    
}
