package school;

import java.util.HashMap;
import java.util.Map;
import school.TestTools.*;





public class School {
    public String name;
    private int numberOfClassRooms;
    private float budget;
    ClassRoom[] allClassRooms;

    public School(String name, int numberOfClassRooms, int budget){
        this.name = name;
        this.numberOfClassRooms = numberOfClassRooms;
        this.budget = budget;
        allClassRooms = new ClassRoom[numberOfClassRooms];
    }

    public String getName() {
        return name;
    }

    public float getBudget() {
        return budget;
    }

    public void payForExpenses(float price){
        budget -= price;
    }

    public void setClassRoom(int classroomNumber, ClassRoom classroom){

        //int checkedClassroomNumber =  lowerThan(classroomNumber); cum import metoda?!!!!!!!!!!!!!!!!!!!!

        allClassRooms[classroomNumber - 1] = classroom;
    }


    public void getEmptyClasses(){
        for(int i = 0; i < numberOfClassRooms-1  ;i++){
            if(allClassRooms[i] == null){
                System.out.println("Classroom number " + (i+1));
            }


        }
    }

}

