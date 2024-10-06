
package ExceptionHandling;


public class TryCatchEx {
    
    public static void main(String[] args) {
        
        int a[] = {10,20,30};
        
        try{
            System.out.println("before error");
            
            System.out.println("a[0] :" +a[0]);
            System.out.println("a[1] :" +a[1]);
            System.out.println("a[2] :" +a[2]);
            System.out.println("a[3] :" +a[3]);
            
            System.out.println("after arror");
        }catch(Exception ex){
            System.out.println("errer by system :"+ex.getMessage());
            System.out.println("error by user : plz Enter above zero");
            
        }
    }
    
}
