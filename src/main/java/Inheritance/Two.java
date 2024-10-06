
package Inheritance;


public class Two extends One{
    
    int SID = 122;     //data member
    
    void test(){     //member method
        System.out.println("Test method in class two :");
    }
    public static void main(String[] args) {
        Two t = new Two();
        
        //exses property from two class
        System.out.println("var from two class :"+t.SID);
        t.test();
        //exses property from one class
        System.out.println("var from one class"+t.eplid);
        t.ename();
    }
    
}
