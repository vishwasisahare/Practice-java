
package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeRecord {
    
    public static void main(String[] args) {
        
        
        ArrayList al = new ArrayList();
         al.add(101);
         al.add("vishu");
         al.add(50000.20);
         al.add("Tcs");        
         al.add("nagpur");
         al.add("computer sci engg");
         al.add("india");
         
         System.out.println("print arrayblist using for loop to the assendeing order");
         for(int i = 0 ;i < al.size(); i++){
             System.out.println(al.get(i));
         }
         System.out.println("print arraylist using for loop in assending order");
         for(int i = al.size()-1;i>=0;i--){
             System.out.println(al.get(i));
         }
         System.out.println("print arraylist using Iteretor");
         Iterator itr = al.iterator();
         
         while(itr.hasNext()){
             System.out.println(itr.next());
         }
         System.out.println("array size :"+(al.size()-1));
         System.out.println("array size :"+al.size());
         
    }
   
    
}
