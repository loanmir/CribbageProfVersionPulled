package sdm.running.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseCribbageHand {

    @Test
    void withStarterCardFiveOfClubs() {
        CribbageHandParser cribbageHandParser = new CribbageHandParser();
        CribbageHand cribbageHand = cribbageHandParser.parse("5♥5♦5♠J♣5♣");
        assertAll(
                () -> assertEquals('5', cribbageHand.starterCard().rank()),
                () -> assertEquals('♣', cribbageHand.starterCard().suite())
        );
    }
}
