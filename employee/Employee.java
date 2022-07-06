package company.employee;


import company.section.Position;
import company.section.Section;
import company.service.ServiceEmployee;

import java.util.Scanner;

public class Employee extends Section implements ServiceEmployee {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String birthDay;
    private String gender;
    private String section;
    private String position;
    Employee employee;
    private double salary;

    public Employee(String section, String position) {
        this.section = section;
        this.position = position;
    }

    public Employee() {

    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void enterEmployeePanel(String firstName, String lastName, String section, String position) {
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).firstName.equals(firstName)&&
            employees.get(i).lastName.equals(lastName)&&
            employees.get(i).section.equals(section)&&
            employees.get(i).position.equals(position)){
                boolean isHave=true;
                while (isHave){
                    System.out.println("1->List of Emploees\n" +
                            "2->List of Sections\n" +
                            "3->List of Positions" +
                            "0->Exit");
                    Position p1=new Position();
                    int n5=scanner.nextInt();
                    switch (n5){
                        case 0->{isHave=false;}
                        case 1->{listEmployee();}
                        case 2->{listSection();}
                        case 3->{p1.listPosition();}
                    }
                }
            }
        }

    }

    public Employee(String firstName, String lastName, String fatherName, String birthDay, String gender,String e1,String e2, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.section=e1;
        this.position=e2;
        this.salary = salary;
    }

    @Override
    public void addEmployee() {
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Father's Name: ");
        String fatherName = scanner.next();
        System.out.print("Birth Day: ");
        String birthDay=scanner.next();
        System.out.print("Gender: ");
        String gender=scanner.next();
        String e1 = null,e4=null;
        for (int i = 0; i <sections.size(); i++) {
            System.out.println(i+1+"."+sections.get(i).getSectionName());
        }
        int n=scanner.nextInt()-1;
        for (int i = 0; i <sections.size() ; i++) {
            if(n==i){
                e1=sections.get(i).getSectionName();
                e4=sections.get(i).getPosition();

            }
        }
        System.out.print("Salary: ");
        double salary=scanner.nextDouble();
        Employee e2=new Employee(firstName,lastName,fatherName,birthDay,gender,e1,e4,salary);
        employees.add(e2);
        System.out.println("Successfulley added!!!");
    }

    @Override
    public void deleteEmployee() {
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Section: ");
        String Section=scanner.next();
        System.out.print("Position: ");
        String Positon=scanner.next();
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).firstName.equals(firstName)&&
                    employees.get(i).lastName.equals(lastName)&&
                    employees.get(i).section.equals(Section)&&
                    employees.get(i).position.equals(Positon)){
                employees.remove(i);
                System.out.println("Successfully removed!!!");
            }

        }
    }

    @Override
    public void listEmployee() {
        for (int i = 0; i <employees.size() ; i++) {
            System.out.println(employees.get(i));
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", section='" + section + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
