package company;

import company.admin.Admin;
import company.employee.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isRun=true;
        while (isRun){
            System.out.println("-------------------------Welcom to Company--------------------------");
            System.out.println();

            System.out.println("Continue To Be...");
            System.out.println("1->Admin\n" +
                    "2->Employee\n" +
                    "0->Exit");
            int n=scanner.nextInt();
            switch (n){
                case 0->{isRun=false;
                    System.out.println("Thanks for used!!!");}
                case 1->{
                    Admin admin=new Admin();
                    System.out.print("First name: ");
                    String firstName=scanner.next();
                    System.out.print("Last name: ");
                    String lastName=scanner.next();
                    System.out.print("Password: ");
                    String Password=scanner.next();
                    admin.enterAdminPanel(firstName,lastName,Password);
                }
                case 2->{
                    Employee e=new Employee();
                    System.out.print("First name: ");
                    String firstName=scanner.next();
                    System.out.print("Last name: ");
                    String lastName=scanner.next();
                    System.out.print("Section: ");
                    String sec=scanner.next();
                    System.out.print("Position: ");
                    String pos=scanner.next();
                    e.enterEmployeePanel(firstName,lastName,sec,pos);
                }
            }
        }
    }
}
