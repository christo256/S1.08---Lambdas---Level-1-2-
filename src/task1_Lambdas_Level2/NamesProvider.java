package task1_Lambdas_Level2;

import java.util.List;

public class NamesProvider {

    private final List<String> names;

    public NamesProvider() {
        this.names = List.of("Andres", "Ana", "Annie", "Oriol", "Christopher", "Luis", "Ani", "Ala", "Aoa");
    }

    public List<String> getNames() {
        return names;
    }
}
