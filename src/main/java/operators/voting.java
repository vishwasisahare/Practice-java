package operators;

import java.util.Scanner;

public class voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            
            System.out.println("you are eligible for voting :");
            char nation = sc.next().charAt(0);

            if (nation == 'y') {
                System.out.println("congress u are eligible ");
            } 
            else{
                System.out.println("sry not inadian,not  ");
            }
            
            
            
        } else {
            System.out.println("sry you not elegible for voting because u are below 18");
            

        }
    }
}
