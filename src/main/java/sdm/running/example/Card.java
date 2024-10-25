package sdm.running.example;

public class Card {
    private final Character suite;
    private final Character rank;

    public Card(Character rank, Character suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Character suite() {
        return suite;
    }

    public Character rank() {
        return rank;
    }
}
