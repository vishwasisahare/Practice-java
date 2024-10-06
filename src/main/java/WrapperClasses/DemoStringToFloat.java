
package WrapperClasses;


public class DemoStringToFloat {
    
    public static void main(String[] args) {
        
        String s1 = "20.25f";
        String s2 = "30.05f";
        System.out.println(s1+s2);
        
        //string convert into float
        float x = Float.parseFloat(s1);
        float y = Float.parseFloat(s2);
        System.out.println(x+y);
        
        //string convert into int
        String a = "20";
        String b = "10";
        System.out.println(a+b);
        int p = Integer.parseInt(a);
        int q = Integer.parseInt(b);
        System.out.println(p+q);
    }
    
}
