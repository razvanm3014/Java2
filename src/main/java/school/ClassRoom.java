package school;

//in constructor sa puna toate furniture(args) sau lista,de acolo le iau si le pun in lista mea?
//pun la scoala? //public String whosInClassroom() iterator.getname

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class ClassRoom { // in constructor scoala?
    private int maxNumberOfStudents;
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Students> studentsInClass = new ArrayList<Students>();
    private List<Chair> allChairs = new ArrayList<Chair>();
    private List<Desk> allDesks = new ArrayList<Desk>();
    private boolean classroomNeedsCleaning = false;




    //scazut din totalFurniture
//pot face cu dinctionar sa scot scaunul care vreau eu
    public Chair removeOneChair(){ //pus in clasa chair?!!!!!!!!!!!!!!
        return allChairs.remove(0);

    }
    public void addChair(Chair chair){
        allChairs.add(chair);
    }
    public void addDesk(Desk desk){
        allDesks.add(desk);
    }
    public int getNumberOfChairs(){
        return allChairs.size();
    }

    public void setTeachers(Teacher teacher) { //director?
        teachers.add(teacher);
    }

    public void transferTeacher(Teacher teacher, ClassRoom newClass){ //director?

        //nu sterge
        teachers.remove(teacher);
        newClass.setTeachers(teacher);
    }

    public int numberOfTeachersInClass(){
        return teachers.size();
    }
//    public void removeTeacherFromClassroom(Teacher teacher){
//
//    }

    public void checkTeacherInClass(){
        int numberOfTeachers = teachers.size();
        String message = String.format("There are %d in the classroom",numberOfTeachers);
    }

    public void brokenChair(){
        Chair broken = null;
        //inlocuit random in list
    }




    public void setNumberOfStudents(int numberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public int getNumberStudentsInClass(){
        return studentsInClass.size();
    }

    public int checkEmptySeats() {
        int emptySeats= maxNumberOfStudents - studentsInClass.size();
        if (emptySeats <= ((allChairs.size() + allDesks.size())/2)){
            return emptySeats;
        }
        else{
            return 0; //exception
        }

    }

    public void add(Students student){
        if (studentsInClass.size() < checkEmptySeats()){
            studentsInClass.add(student);
        }
        else{
            //error
        }
    }

    public void setClassroomNeedsCleaning(boolean b){
        this.classroomNeedsCleaning = b;
    }


    public void  whosInTheClassroom(){

        System.out.println("Teachers");
        ListIterator<Teacher> teacherListIterator = teachers.listIterator();
        while(teacherListIterator.hasNext()){
            System.out.println(teacherListIterator.hasNext());
        }

        System.out.println("Students: ");
        ListIterator<Students> studentsListIterator = studentsInClass.listIterator();
        while(studentsListIterator.hasNext()){
            System.out.println(studentsListIterator.hasNext());
        }



    }

}
