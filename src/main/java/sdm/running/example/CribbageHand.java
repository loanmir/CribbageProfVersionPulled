package sdm.running.example;

public class CribbageHand {
    private final Card starterCard;

    public CribbageHand(Card starterCard) {
        this.starterCard = starterCard;
    }

    public Card starterCard() {
        return starterCard;
    }
}
