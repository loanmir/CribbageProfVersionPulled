package sdm.running.example;

import java.util.ArrayList;
import java.util.List;

public class CribbageHandParser {
    public CribbageHand parse(String cribbageHandAsString) {
        String starterCardAsString = cribbageHandAsString.substring(8);
        CardParser cardParser = new CardParser();
        
        String handCardsAsString = cribbageHandAsString.substring(0, 8);
        List<Card> handCards = new ArrayList<>();
        for (int i = 0; i < 7; i+=2) {
            String handCard = handCardsAsString.substring(i, i + 2);
            handCards.add(cardParser.parse(handCard));
        }

        return new CribbageHand(handCards, cardParser.parse(starterCardAsString));
    }
}
