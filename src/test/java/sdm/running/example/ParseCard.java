package sdm.running.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCard {

    @Test
    void withSuiteSpades() {
        CardParser cardParser = new CardParser();
        Card card = cardParser.parse("5♠");
        assertEquals('♠', card.suite());
    }
    
}
