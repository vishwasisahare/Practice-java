
package Overriding;


public class Student extends Teacher{
    
    void intro(){
        System.out.println("hii, im vishwasi in ACET CLG");
    }
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.intro();
        t.intro();
        
        
    }
    
    
}
