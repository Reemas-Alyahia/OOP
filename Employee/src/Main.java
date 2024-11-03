//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee ("113311133", "Ahmed", (9000));

        System.out.println("The name is: "+emp.getName());
        System.out.println("The id is:  "+emp.getId());
        System.out.println("The Salary is:  "+emp.getSalarey());
        System.out.println("New Salary after raise: "+emp.raiseSalary(10));
       System.out.println("Annual Salary: " + emp.getAnnoulsalary());
        System.out.println(emp);


    }
}