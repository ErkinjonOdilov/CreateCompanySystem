package company.section;

import company.data.DataBase;
import company.service.SectionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Section extends DataBase implements SectionService {
    private String sectionName;
    private String description;

    public Section(String sectionName, String description) {
        this.sectionName = sectionName;
        this.description = description;
    }
    Scanner scanner=new Scanner(System.in);
    public Section() {
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getPosition() {
        return description;
    }

    @Override
    public void addSection() {
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Description: ");
        String Position=scanner.next();
        sections.add(new Section(name,Position));
        System.out.println("Successfully added");
    }

    @Override
    public void deleteSection() {
        for (int i = 0; i <sections.size() ; i++) {
            System.out.println(sections.get(i));
        }
        System.out.println("Which Section Deleted. Please entered informations");
        boolean a=true;
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Description: ");
        String Position=scanner.next();
        for (int i = 0; i < sections.size(); i++) {
            if(sections.get(i).sectionName.equals(name)&&sections.get(i).description.equals(Position)){
                sections.remove(i);
                a=false;
            }
        }
        if(a){
            System.out.println("There is not Section");
        }
    }

    @Override
    public void editSection() {
        for (int i = 0; i < sections.size(); i++) {
            System.out.println(sections.get(i));
        }
        System.out.println("Which Section Want To Edit.\n" +
                "Enter the Section's information: ");
        System.out.print("Section's name: ");
        String name=scanner.next();
        System.out.print("Section's description: ");
        String Position=scanner.next();
        System.out.println("Change Sections Information New One");
        System.out.print("Enter new section name: ");
        String newName=scanner.next();
        System.out.print("Enter new section description: ");
        String newPosition=scanner.next();
        Section s2=new Section(newName,newName);
        for (int i = 0; i <sections.size() ; i++) {
            if(sections.get(i).sectionName.equals(name) && sections.get(i).description.equals(Position)){
                sections.get(i).sectionName=newName;
                sections.get(i).description=newPosition;
                System.out.println("Successfully Edited!!!");
            }
        }
    }

    @Override
    public void listSection() {
        for (int i = 0; i <sections.size() ; i++) {
            System.out.println(sections.get(i));
        }
        if(sections.size()==0){
            System.out.println("Section is Empty");
        }
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
