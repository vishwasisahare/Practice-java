
package Encapsulation;


public class Employee {
    
    private int empid;
    private String name;
    private double salary;
    private String myname;
    
    //setter
     public void setEmpId(int empid){
         this.empid = empid;
     }
      public void setname(String name){
         this.name = name;
     }
       public void setsalary(double salary){
         this.salary = salary;
     }
      //getter
       public int getEmpId(){
           return empid;
       }
        public String getname(){
           return name;
       }
         public double getsalary(){
           return salary;
       }
         //using constructor
     public Employee(){}
     public Employee(String myname){
         this.myname = myname;
     }
     public String getmyname(){
         return myname;
     }
     
    
}
