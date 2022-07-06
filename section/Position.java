package company.section;

import company.data.DataBase;
import company.service.PositionService;

import java.util.Scanner;

public class Position extends DataBase implements PositionService {
    Section s=new Section();
    private String positionName;
    private String description;

    public Position(String positionName, String description) {
        this.positionName = positionName;
        this.description = description;
    }
    Scanner scanner=new Scanner(System.in);
    public Position() {
    }

    public String getSectionName() {
        return positionName;
    }

    public String getPosition() {
        return description;
    }


    @Override
    public void addPosition() {
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Description: ");
        String Position=scanner.next();
        positions.add(new Position(name,Position));
        System.out.println("Successfully added");
    }

    @Override
    public void deletePosition() {
        for (int i = 0; i <positions.size() ; i++) {
            System.out.println(positions.get(i));
        }
        System.out.println("Which Position Deleted. Please entered informations");
        boolean a=true;
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Description: ");
        String Position=scanner.next();
        for (int i = 0; i < positions.size(); i++) {
            if(positions.get(i).positionName.equals(name)&&positions.get(i).description.equals(Position)){
                positions.remove(i);
                a=false;
            }
        }
        if(a){
            System.out.println("There is not Position");
        }
    }

    @Override
    public void editPosition() {
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(positions.get(i));
        }
        System.out.println("Which Position Want To Edit.\n" +
                "Enter the Position's information: ");
        System.out.print("Position's name: ");
        String name=scanner.next();
        System.out.print("Position's description: ");
        String Position=scanner.next();
        System.out.println("Change Positions Information New One");
        System.out.print("Enter new position name: ");
        String newName=scanner.next();
        System.out.print("Enter new position description: ");
        String newPosition=scanner.next();
        Position s2=new Position(newName,newName);
        for (int i = 0; i <positions.size() ; i++) {
            if(positions.get(i).positionName.equals(name) && positions.get(i).description.equals(Position)){
                positions.get(i).positionName=newName;
                positions.get(i).description=newPosition;
                System.out.println("Successfully Edited!!!");
            }
        }
    }

    public void listPosition() {
        for (int i = 0; i <positions.size() ; i++) {
            System.out.println(positions.get(i));
        }
        if(positions.size()==0){
            System.out.println("Position is Empty");
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "Position Name='" + positionName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
