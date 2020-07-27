package school;

public class Teacher extends SchoolEmployee {
    String subject; //facut enum? math,language,science

    public Teacher(String name, int age, String[] schedule, int hourlyWage, String subject) {
        super(name, age, schedule, hourlyWage);
        this.subject = subject;
    }
}


//replace other teacher in class
//give grades
