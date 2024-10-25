# Behaviors

- Print on standard output the score of a given Cribbage hand (string)
- Compute the score of a Cribbage hand
  - Distinguish hand cards from starter card
  - Know the rank and the suite of a card
  - Combination of cards
- Parse a Cribbage hand represented as a string
    - Each rank corresponds to a numeric value
    - Well defined set of values for rank and suite

# Tests

- "5♥5♦5♠J♣5♣" -> print "29"
- "0♦J♥Q♠A♣9♦" -> print "4"
- 5♥5♦5♠J♣5♣ -> score is 29
- 0♦J♥Q♠A♣9♦ -> score is 4 (run of four)
- "5♥5♦5♠J♣5♣" -> four hand cards (five of Hearts,...) and a starter card (five of Clubs)
~~- "5♥5♦5♠J♣5♣" -> five of Clubs is the starter card~~
~~- "5♥5♦5♠J♣5♣" -> the hand cards are...~~
~~- "5♥" -> card with rank 5~~
~~- "5♥" -> card with suite Hearts~~
~~- "5♦" -> card with suite Diamonds~~
~~- "5♣" -> card with suite Clubs~~
~~- "5♠" -> card with suite Spades~~