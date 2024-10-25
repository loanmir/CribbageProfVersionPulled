package sdm.running.example;

public class CribbageHandParser {
    public CribbageHand parse(String cribbageHandAsString) {
        String starterCardAsString = cribbageHandAsString.substring(8);
        CardParser cardParser = new CardParser();
        return new CribbageHand(cardParser.parse(starterCardAsString));
    }
}
