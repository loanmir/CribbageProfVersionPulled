package sdm.running.example;

public class Card {
    private final Character suite;

    public Card(Character suite) {
        this.suite = suite;
    }

    public Character suite() {
        return suite;
    }
}
