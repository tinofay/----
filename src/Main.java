public class Main {
    public static void main(String[] args) {
        // creating an adapter object
        Salary salary = new EmployeeAdapter();
        // Call the getSalary method on the adapter
        salary.getSalary(1);
    }
}
