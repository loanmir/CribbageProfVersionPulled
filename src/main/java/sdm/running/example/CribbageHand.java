package sdm.running.example;

public class CribbageHand {
    private final Card card;

    public CribbageHand(Card card) {
        this.card = card;
    }

    public Card starterCard() {
        return card;
    }
}
