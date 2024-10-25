package sdm.running.example;

public class CribbageHandParser {
    public CribbageHand parse(String s) {
        String starterCardAsString = s.substring(8);
        CardParser cardParser = new CardParser();
        Card card = cardParser.parse(starterCardAsString);
        return new CribbageHand(card);
    }
}
