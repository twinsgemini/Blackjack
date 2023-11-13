package study;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player {
    private List<Card> cards;
    private boolean turn;
    private String name;

    public Gamer(String name) {
        cards = new ArrayList<>();
        this.name = name;
    }

    /**
     * 카드 받기
     * @param card
     */
    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
        this.showCards();
    }

    /**
     * 현재 보유한 카드 확인
     */
    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setTurn(boolean turn) {
        this.turn = turn;
    }
}
