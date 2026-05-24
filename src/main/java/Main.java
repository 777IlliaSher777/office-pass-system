import application.usecase.CreatePassUseCase;
import domain.service.PassValidationService;
import infrastructure.console.ConsoleController;
import infrastructure.persistence.InMemoryEmployeeRepository;
import infrastructure.persistence.InMemoryPassRepository;

public class Main {

    public static void main(String[] args) {

        // Repositories
        InMemoryPassRepository passRepository =
                new InMemoryPassRepository();

        InMemoryEmployeeRepository employeeRepository =
                new InMemoryEmployeeRepository();

        // Domain service
        PassValidationService validationService =
                new PassValidationService(employeeRepository);

        // Use case
        CreatePassUseCase createPassUseCase =
                new CreatePassUseCase(
                        passRepository,
                        validationService
                );

        // Console controller
        ConsoleController consoleController =
                new ConsoleController(createPassUseCase);

        // Application start
        consoleController.start();
    }
}
