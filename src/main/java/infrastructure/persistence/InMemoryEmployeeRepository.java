package infrastructure.persistence;

import application.ports.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeRepository
        implements EmployeeRepository {

    private final List<String> employees = new ArrayList<>();

    public InMemoryEmployeeRepository() {

        employees.add("Danya Efimenko");
        employees.add("Kirill Damochkin");
        employees.add("Nazar Omelchenko");
    }

    @Override
    public boolean existsByName(String employeeName) {

        return employees.contains(employeeName);
    }
}
