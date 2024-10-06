
package Collection;

import java.util.ArrayList;


public class Employee {
    
    public static void main(String[] args) {
        
       ArrayList al = new ArrayList();
       al.add(101);  //0
       al.add("vishu");  //1
       al.add(50000.00);   //2
       
        System.out.println("emp id : "+al.get(0));
        System.out.println("emp id : "+al.get(1));
        System.out.println("emp id : "+al.get(2));
        
        System.out.println("size of the array list :"+al.size());
               
               
       
       
     
    }
    
}
