package infrastructure.console;

import application.usecase.CreatePassUseCase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ConsoleController {

    private final CreatePassUseCase createPassUseCase;

    public ConsoleController(CreatePassUseCase createPassUseCase) {
        this.createPassUseCase = createPassUseCase;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("=== Office Visitor Pass System ===");

            System.out.print("Введіть ПІБ відвідувача: ");
            String visitorName = scanner.nextLine();

            System.out.print("Введіть дату візиту (YYYY-MM-DD): ");
            LocalDate visitDate =
                    LocalDate.parse(scanner.nextLine());

            System.out.print("Введіть час відвідування (HH:MM): ");
            LocalTime visitTime =
                    LocalTime.parse(scanner.nextLine());

            System.out.print("Ввести відповідального працівника: ");
            String responsibleEmployee =
                    scanner.nextLine();

            createPassUseCase.createPass(
                    visitorName,
                    visitDate,
                    visitTime,
                    responsibleEmployee
            );

        } catch (Exception e) {

            System.out.println(
                    "\nError: " + e.getMessage()
            );
        }
    }
}
