package sdm.running.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCribbageHand {

    private final CribbageHandParser cribbageHandParser = new CribbageHandParser();

    @Test
    void withStarterCardFiveOfClubs() {
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠J♣5♣");
        assertAll(
                () -> assertEquals('5', cribbageHand.starterCard().rank()),
                () -> assertEquals('♣', cribbageHand.starterCard().suite())
        );
    }

    @Test
    void withStarterCardAceOfSpades() {
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠J♣A♠");
        assertAll(
                () -> assertEquals('A', cribbageHand.starterCard().rank()),
                () -> assertEquals('♠', cribbageHand.starterCard().suite())
        );
    }

}
