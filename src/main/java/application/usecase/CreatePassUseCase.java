package application.usecase;

import application.ports.PassRepository;
import domain.model.Pass;
import domain.service.PassValidationService;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreatePassUseCase {

    private final PassRepository passRepository;
    private final PassValidationService validationService;

    public CreatePassUseCase(
            PassRepository passRepository,
            PassValidationService validationService
    ) {
        this.passRepository = passRepository;
        this.validationService = validationService;
    }

    public void createPass(
            String visitorName,
            LocalDate visitDate,
            LocalTime visitTime,
            String responsibleEmployee
    ) {

        Pass pass = new Pass(
                visitorName,
                visitDate,
                visitTime,
                responsibleEmployee
        );

        validationService.validate(pass);

        passRepository.save(pass);

        System.out.println("\nПерепустку успішно створено!");
        System.out.println(pass);
    }
}
