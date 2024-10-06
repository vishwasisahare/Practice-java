
package Inheritance;


public class C extends B{
    
    String name = "vishu";
     void nameC(){
         System.out.println("hii my name is :"+name);
     }
    
    public static void main(String[] args) {
        C cobj = new C();
        cobj.nameC();    //calling same class method
        System.out.println("name from same class :"+cobj.name);
        
        cobj.methodB();  //calling prperty from B
        System.out.println("var from B :"+cobj.varB);
        
        cobj.methodA();   //calling property from A
        System.out.println("var from A :"+cobj.varA);
    }
}
