package study;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CardDeck {
    private Stack<Card> cards;
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    public CardDeck() {
        cards = this.generateCards();  // 생성자에서 비지니스 로직은 필요없다 -> generateCards()
        Collections.shuffle(this.cards);
    }

    public Card getCard() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    private Stack<Card> generateCards() {
        Stack<Card> cards = new Stack<>();

        for (Card.Pattern pattern : Card.Pattern.values()) {
            for (Card.Denomination denomination : Card.Denomination.values()) {
                Card card = new Card(pattern, denomination);
                cards.push(card);
            }
        }

        return cards;
    }

    public Card draw() {
        return this.cards.pop();
    }

    private Card getRandomCard() {
        int size = cards.size();
        int select = (int) (Math.random()*size);
        return cards.get(select);
    }

    public Stack<Card> getCards() {
        return this.cards;
    }

}
