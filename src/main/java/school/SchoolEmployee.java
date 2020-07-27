package school;
//cat a incasat un employee?
public abstract class SchoolEmployee  extends  Human{
    private int hourlyWage;
    private float salary;
    private float incomeToDate;

    public SchoolEmployee(String name, int age, String[] schedule,int hourlyWage){
        super(name, age, schedule);
        this.hourlyWage = hourlyWage;



    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int workingHours(){
        int workingHours = 0;
        for(int i = 0; i < getSchedule().length; i++){
            if(getSchedule()[i] != null){
                workingHours++;
            }
        }
        return  workingHours;
    }

    public void setSalary(float salary) { //cum fac ca doar accountant sa aiba acces la aceasta metoda?!!!!!!!!!!!!!!!!1
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setIncomeToDate(float incomeToDate) {
        this.incomeToDate += incomeToDate;
    }

    public float getIncomeToDate() {
        return incomeToDate;
    }
}
