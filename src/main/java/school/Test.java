package school;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){

        School school1 = new School("goga",10,5000);
        ClassRoom x = new ClassRoom();
        school1.setClassRoom(1,x);
        x.setNumberOfStudents(5);

        String[] s = new String[1];
        s[0] = "math";
        Students student1 = new Students("A", 24, s);
//        x.addStudentToClassroom(student1);
        Students student2 = new Students("ION", 11, new String[]{"WW"});
//        x.addStudentToClassroom(student2);
        Teacher t1 = new Teacher("ii", 33, new String[]{"WW"},22,"math");
        x.setTeachers(t1);

        x.addChair(new Chair(school1) );
        x.addChair(new Chair(school1));
        x.addChair(new Chair(school1));
        x.addDesk(new Desk(school1));
        x.addDesk(new Desk(school1));
        x.addDesk(new Desk(school1));


        Chair c = new Chair(school1);
        Desk d  = new Desk(school1);
        Desk d1  = new Desk(school1);
        Chair c1 = new Chair(school1);
        Desk d2 = new Desk(school1);
        x.addChair(c1);
        x.addChair(c);
        x.addDesk(d1);
        x.addDesk(d);
        x.addDesk(d2);



        System.out.println(x.numberOfTeachersInClass());



        //Un profesor nu poate fi in 2 clase simultan
        //dictionar cu toti profesorii -> profesor: clasa
        ClassRoom c2 = new ClassRoom();
        school1.setClassRoom(2,c2);
        x.transferTeacher(t1,c2);
        System.out.println(c2.numberOfTeachersInClass());
//        System.out.println(x.getNumberStudentsInClass());
//
//        System.out.println(x.checkEmptySeats());



//
//

//
       x.whosInTheClassroom(); // ceva greist






    }
}
