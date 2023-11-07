package study;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cards;

    public Gamer() {
        cards = new ArrayList<>();
    }

    /**
     * 카드 받기
     * @param card
     */
    public void receiveCard(Card card) {
        this.cards.add(card);
        this.showCards();
    }

    /**
     * 현재 보유한 카드 확인
     */
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public List<Card> openCards() {
        return this.cards;
    }
}
