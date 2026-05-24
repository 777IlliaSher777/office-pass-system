package domain.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pass {

    private String visitorName;
    private LocalDate visitDate;
    private LocalTime visitTime;
    private String responsibleEmployee;

    public Pass(String visitorName,
                LocalDate visitDate,
                LocalTime visitTime,
                String responsibleEmployee) {

        this.visitorName = visitorName;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.responsibleEmployee = responsibleEmployee;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public String getResponsibleEmployee() {
        return responsibleEmployee;
    }

    @Override
    public String toString() {
        return "Pass {" +
                "\n ПІБ відвідувача = '" + visitorName + '\'' +
                ",\n Дата відвідування = " + visitDate +
                ",\n Час відвідування = " + visitTime +
                ",\n Відповідальний працівник = '" + responsibleEmployee + '\'' +
                "\n}";
    }
}