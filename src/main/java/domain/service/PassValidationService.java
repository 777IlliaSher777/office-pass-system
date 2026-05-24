package domain.service;

import application.ports.EmployeeRepository;
import domain.model.Pass;

import java.time.LocalDate;
import java.time.LocalTime;

public class PassValidationService {

    private final EmployeeRepository employeeRepository;

    public PassValidationService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void validate(Pass pass) {

        validateDate(pass.getVisitDate());
        validateTime(pass.getVisitTime());
        validateEmployee(pass.getResponsibleEmployee());
        validateVisitorName(pass.getVisitorName());
    }

    private void validateDate(LocalDate date) {

        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Дата відвідування не може бути в минулому."
            );
        }
    }

    private void validateTime(LocalTime time) {

        LocalTime startWork = LocalTime.of(9, 0);
        LocalTime endWork = LocalTime.of(18, 0);

        if (time.isBefore(startWork) || time.isAfter(endWork)) {
            throw new IllegalArgumentException(
                    "Час відвідування має бути від 09:00 до 18:00."
            );
        }
    }

    private void validateEmployee(String employeeName) {

        if (!employeeRepository.existsByName(employeeName)) {
            throw new IllegalArgumentException(
                    "Відповідального працівника не існує."
            );
        }
    }

    private void validateVisitorName(String visitorName) {

        if (visitorName == null || visitorName.isBlank()) {
            throw new IllegalArgumentException(
                    "ПІБ відвідувача не може бути порожнім."
            );
        }
    }
}
