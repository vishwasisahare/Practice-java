
package Encapsulation;


public class Student {
    
    private int rollno;
    private String name;
    private  String email;
    private  String Degree;

    public Student(int rollno, String name, String email, String Degree) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.Degree = Degree;
    }
    

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }
    
    
}
