package school;

//pot face inca o clasa contractor
public class Accountant extends SchoolEmployee{
    public Accountant(String name, int age, String[] schedule, int hourlyWage) {
        super(name, age, schedule, hourlyWage);
    }

    public int calculateSalary(SchoolEmployee employee){
        int salary = employee.workingHours() * employee.getHourlyWage();
        employee.setSalary(salary);
        return salary;
    }

    public void salaryInrease(SchoolEmployee employee,float percentage){
        employee.setSalary(employee.getSalary() + employee.getSalary() * percentage);
    }


    //facut payAllSalaries

    public void payEmployee(SchoolEmployee employee, School school){
        school.payForExpenses(employee.getSalary());
        employee.setIncomeToDate(employee.getSalary());
    }

    public void payBonus(float percentageOfSalary,SchoolEmployee employee, School school){ //eorare daca nu sunt bani
        float bonus = employee.getSalary() * percentageOfSalary;
        school.payForExpenses(bonus);
        employee.setIncomeToDate(bonus);
    }

}



 //payslip
//invoiceRepair/purchase chair?
//payAllEmployees