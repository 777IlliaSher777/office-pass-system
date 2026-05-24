package application.ports;

import domain.model.Pass;

public interface PassRepository {

    void save(Pass pass);
}