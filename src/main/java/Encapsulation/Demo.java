
package Encapsulation;


public class Demo {
    
    public static void main(String[] args) {
        //setter
        Employee emp = new Employee();
         emp.setEmpId(9);
         emp.setname("vishu");
         emp.setsalary(100000.5);
         
         //getter
         System.out.println("Emp id is :"+emp.getEmpId());
         System.out.println("Emp name is :"+emp.getname());
         System.out.println("Emp salary is :"+emp.getsalary());
         
         //for using constructor
         Employee emp1 = new Employee("vishu");
         System.out.println("my name is :"+emp1.getmyname());
         
    }
    
}
