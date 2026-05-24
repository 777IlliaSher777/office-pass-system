package infrastructure.persistence;

import application.ports.PassRepository;
import domain.model.Pass;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPassRepository implements PassRepository {

    private final List<Pass> passes = new ArrayList<>();

    @Override
    public void save(Pass pass) {

        passes.add(pass);

        System.out.println("Пас збережено у вбудованій пам'яті.");
    }

    public List<Pass> getAllPasses() {
        return passes;
    }
}
