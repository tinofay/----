//The adaptee class that has a different interface than the target
public class Employee {
    public void getSalaryInUSD(int id){
        System.out.println("The salary of employee " + id + " in US dollars is: " + 1000);
    }
}
