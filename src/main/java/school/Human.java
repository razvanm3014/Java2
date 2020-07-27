package school;

public abstract class Human {
    private int age;
    private String name;
    private String[] schedule;
    //(fiecare aray e o ora de incepand de la 8,daca e gol inseamna ca nu are ore, ca sa termine la 3 tre sa fie array[7],daca array[0] gol inseaman ca incepe de l;a 9)





    public Human(String name, int age, String[] schedule){
        this.name = name;
        this.age = age;
        this.schedule = schedule;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void changeSchedule(int hour, String newSchedule){
        schedule[hour -1 ] = newSchedule;
    }

    public int numberOfWorkingHours(){
        int l = schedule.length;
        int nrHours = 0;
        for (int i = 0; i < l; i++){
            if (schedule[i] != null){
                nrHours++;
            }
        }
        return nrHours;
    }


}
