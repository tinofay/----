// The adapter class that inherits from both the target interface and the adaptee class
public class EmployeeAdapter extends Employee implements Salary {
    @Override
    public void getSalary(int id){
        getSalaryInUSD(id);
        // convert the salary from US dollars to ZWL using a conversion rate
        double conversionRate = 4500; // 1 USD = ZWL4500
        double salaryInZWL = 1000 * conversionRate;
        System.out.println("The salary of employee " + id + " in ZWL is: " + salaryInZWL);
    }

}
