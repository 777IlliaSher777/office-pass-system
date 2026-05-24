package application.ports;

public interface EmployeeRepository {

    boolean existsByName(String employeeName);
}