package study;

public class Card {
    private Pattern pattern;  // 무늬
    private Denomination denomination;  // 기호

    public Card(Pattern patter, Denomination denomination) {
        this.pattern = patter;
        this.denomination = denomination;
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

    public Pattern getPattern() {
        return pattern;
    }
    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Card{" + "pattern='" + pattern + "', denomination='" + denomination.getPoint() + "'}";
    }

    public enum Pattern {
        SPADE("spade"),
        HEART("heart"),
        DIAMOND("diamond"),
        CLUB("club");

        private String value;

        Pattern() {}

        Pattern(String value) {
            this.value = value;
        }
    }

    public enum Denomination {
        ACE("A", 1),
        TWO("2", 2),
        THREE("3", 3),
        FOUR("4", 4),
        FIVE("5", 5),
        SIX("6", 6),
        SEVEN("7", 7),
        EIGHT("8", 8),
        NINE("9", 9),
        TEN("10", 10),
        JACK("J", 10),
        QUEEN("Q", 10),
        KING("K", 10);

        private String mark;
        private int point;

        Denomination() {}

        Denomination(String mark, int point) {
            this.mark = mark;
            this.point = point;
        }

        public int getPoint() {
            return this.point;
        }
    }

}
