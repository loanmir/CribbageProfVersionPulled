package sdm.running.example;

public class CardParser {
    public Card parse(String cardAsString) {
        return new Card(cardAsString.charAt(1));
    }
}
