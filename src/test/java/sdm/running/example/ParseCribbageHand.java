package sdm.running.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void withHandCardsFiveOfEachSuite() {
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠5♣A♠");
        Card[] expectedHandCards = {
                new Card('5', '♥'),
                new Card('5', '♦'),
                new Card('5', '♠'),
                new Card('5', '♣')
        };
        assertArrayEquals(expectedHandCards, cribbageHand.handCards());
    }
}
