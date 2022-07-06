package company.admin;

import company.employee.Employee;
import company.section.Position;
import company.section.Section;
import company.service.ServiceAdmin;

import java.util.Scanner;

public class Admin extends Section implements ServiceAdmin {
    Scanner scanner =new Scanner(System.in);
    private String firstName="Odilov";
    private String lastName="Erkinjon";
    private String fatherName="Davronboy o'g'li";
    private String birthDay="2004.07.08";
    private char gender='M';
    private String adminPassword="2004";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public char genderPoll() {
        return gender;
    }

    public String getPassword() {
        return adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", poll=" + gender +
                '}';
    }
    Position p1=new Position();
    @Override
    public void menu() {
        Employee e3=new Employee();
        boolean isTrue=true;
        while (isTrue) {
            System.out.println("----------------Admin Panel------------------");
            System.out.println("1->Add Section\n" +
                    "2->Delete Section\n" +
                    "3->Edit Section\n" +
                    "4->List Section\n" +
                    "5->Position Menu\n" +
                    "6->Employee Menu\n" +
                    "7->Employee List By Section\n" +
                    "0->Exit");
            int n = scanner.nextInt();
            switch (n) {
                case 0 -> {isTrue=false;}
                case 1->{addSection();}
                case 2->{deleteSection();}
                case 3->{editSection();}
                case 4->{listSection();}
                case 5->{
                    boolean True=true;
                    while (True) {
                        System.out.println("1->Add Position\n" +
                                "2->Delete Position\n" +
                                "3->Edit Position\n" +
                                "4->List Position\n" +
                                "0->Exit");
                        int n1 = scanner.nextInt();
                        switch (n1) {
                            case 0 -> {True=false;}
                            case 1->{p1.addPosition();}
                            case 2->{p1.deletePosition();}
                            case 3->{p1.editPosition();}
                            case 4->{p1.listPosition();}
                        }
                    }
                }
                case 6->{
                    boolean isFalse=true;
                    while (isFalse){
                        System.out.println("1->Add Employee\n" +
                                "2->Delete Employee\n" +
                                "3->List Employee\n" +
                                "0->Exit");
                        int n3=scanner.nextInt();
                        switch (n3){
                            case 0->{isFalse=false;}
                            case 1->{e3.addEmployee();}
                            case 2->{e3.deleteEmployee();}
                            case 3->{e3.listEmployee();}
                        }
                    }
                }
                case 7->{
                    for (int i = 0; i < sections.size() ; i++) {
                        System.out.println(i+1+"."+ sections.get(i));
                    }
                    System.out.print("Enter Sections number: ");
                    int n4=scanner.nextInt();
                    for (int i = 0; i < employees.size() ; i++) {
                        if(n==i){
                            System.out.println(employees.get(i));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void enterAdminPanel(String firstName, String lastName, String Password) {
        if(getFirstName().equals(firstName) && getLastName().equals(lastName)&&getPassword().equals(Password)){
            menu();
        }
    }
}
