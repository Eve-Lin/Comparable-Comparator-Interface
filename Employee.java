import java.util.Comparator;

public class Employee {

    String empName;
    String position;
    int empAge;


    Employee(String empName, String position, int empAge) {

        this.empName = empName;
        this.position = position;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {

        this.empName = empName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static Comparator<Employee> myComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            String employee1 = o1.getEmpName().toUpperCase();
            String employee2 = o2.getEmpName().toUpperCase();

            return employee1.compareTo(employee2);
        }};


    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int empAge1 = o1.getEmpAge();
            int empAge2 = o2.getEmpAge();

            return empAge1 - empAge2;
        }
    };

    public String toString(){
        return empName + " " + position + " " + empAge;
    }
}

