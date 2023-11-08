package study;

public class Card {
    private String pattern;  // 무늬
    private String denomination;  // 기호
    private int point;  // 점수

    public Card(String patter, int index) {
        this.pattern = patter;
        this.denomination = this.numberToDenomination(index);
        this.point = this.numberToPoint(index);
    }

    private int numberToPoint(int number) {
        if (number >= 11) {
            return 10;
        }

        return number;
    }

    private String numberToDenomination(int number) {

        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }

        return String.valueOf(number);
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Card{" + "pattern='" + pattern + ", denomination='" + denomination + '}';
    }
}
