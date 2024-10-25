package sdm.running.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ParseCribbageHand {

    private final CribbageHandParser cribbageHandParser = new CribbageHandParser();

    @Test
    void withStarterCardFiveOfClubs() {
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠J♣5♣");
        assertEquals(new Card('5', '♣'), cribbageHand.starterCard());
    }

    @Test
    void withStarterCardAceOfSpades() {
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠J♣A♠");
        assertEquals(new Card('A', '♠'), cribbageHand.starterCard());
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

    @Test
    void withHandCardsThreeOfEachSuite() {
        CribbageHand cribbageHand = cribbageHandParser.parse("3♥3♦3♠3♣A♠");
        Card[] expectedHandCards = {
                new Card('3', '♥'),
                new Card('3', '♦'),
                new Card('3', '♠'),
                new Card('3', '♣')
        };
        assertArrayEquals(expectedHandCards, cribbageHand.handCards());
    }

    @Test
    void withHandCardsAceOfEachSuiteAndStarterCardKingOfHearts() {
        CribbageHand cribbageHand = cribbageHandParser.parse("A♥A♦A♠A♣K♥");
        CribbageHand expectedHand = new CribbageHand(
                Arrays.asList(
                        new Card('A', '♥'),
                        new Card('A', '♦'),
                        new Card('A', '♠'),
                        new Card('A', '♣')
                ),
                new Card('K', '♥')
        );
        assertEquals(expectedHand, cribbageHand);
    }
}
