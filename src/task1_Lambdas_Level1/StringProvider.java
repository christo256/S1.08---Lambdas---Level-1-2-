package task1_Lambdas_Level1;

import java.util.List;

public class StringProvider {

    private final List<String> words;

    public StringProvider() {

        this.words = List.of("Apple", "Caiman", "Hour", "Gotham", "Never", "Forever", "Hello", "Bye");
    }

    public List<String> getWords() {
        return words;
    }
}
