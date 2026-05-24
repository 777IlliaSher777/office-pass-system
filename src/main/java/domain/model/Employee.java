package domain.model;

public class Employee {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\n name = '" + name + '\'' +
                ",\n department = '" + department + '\'' +
                "\n}";
    }
}