# Behaviors

- Print on standard output the score of a given Cribbage hand (string)
- Compute the score of a Cribbage hand
  - Distinguish hand cards from starter card
  - Know the rank and the suite of a card
  - Combination of cards
- Parse a Cribbage hand represented as a string
    - Each rank corresponds to a numeric value
    - Well defined set of values for rank and suite

# Notes

- Do we really need the getters in CribbageHand and Card, now that we implemented equals?

# Tests

- "5♥5♦5♠J♣5♣" -> print "29"
- "0♦J♥Q♠A♣9♦" -> print "4"
- 5♥5♦5♠J♣5♣ -> score is 29
- 0♦J♥Q♠A♣9♦ -> score is 4 (run of four)
~~- "5♥5♦5♠J♣5♣" -> four hand cards (five of Hearts,...) and a starter card (five of Clubs)~~
~~- "5♥5♦5♠J♣5♣" -> five of Clubs is the starter card~~
~~- "5♥5♦5♠J♣5♣" -> the hand cards are...~~
~~- "5♥" -> card with rank 5~~
~~- "5♥" -> card with suite Hearts~~
~~- "5♦" -> card with suite Diamonds~~
~~- "5♣" -> card with suite Clubs~~
~~- "5♠" -> card with suite Spades~~

Pairs
- 8♥8♦4♠A♣5♣ -> score is 2
  - 8♥8♦4♠A♣5♣ -> one pair
- 2♥2♦2♠A♣5♣ -> score is 6
  - 2♥2♦2♠A♣5♣ -> three pairs
- 3♥3♦3♠A♣3♣ -> score is 12
  - 3♥3♦3♠A♣3♣ -> six pairs

Flush
- 0♥J♥K♥A♥9♦ -> score is 4
- 0♥J♥K♥A♥9♥ -> score is 5

