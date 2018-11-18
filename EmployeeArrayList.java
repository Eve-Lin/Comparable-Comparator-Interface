import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("John", "accountant",35));
        empList.add(new Employee("Sonya", "manager",40));
        empList.add(new Employee("Tanya", "trainer",27));


        System.out.println("Sorting according the age of the employee:");

        Collections.sort(empList, Employee.ageComparator);
        for (Employee emp:empList){

            System.out.println(emp);
        }

        System.out.println();
        System.out.println("Sorting according the name of the employee:");
        Collections.sort(empList,Employee.myComparator);

        for(Employee emp:empList){
            System.out.println(emp);
        }
    }
}
