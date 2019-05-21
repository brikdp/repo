import java.util.ArrayList;

public class Koloda {

    ArrayList<Card> cards = new ArrayList<>();

    public class Card {
        String suit;
        String picture;
        Integer point;


        public Card(String suit, String picture, Integer point) {
            this.suit = suit;
            this.picture = picture;
            this.point = point;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public Integer getPoint() {
            return point;
        }

        public void setPoint(Integer point) {
            this.point = point;
        }

    }
    public void new_cards()
    {
        cards.add(new Card("Черви","Туз", 11));
        cards.add(new Card("Буби","Туз", 11));
        cards.add(new Card("Крести","Туз", 11));
        cards.add(new Card("Пики","Туз", 11));

        cards.add(new Card("Черви","Король", 4));
        cards.add(new Card("Буби","Король", 4));
        cards.add(new Card("Крести","Король", 4));
        cards.add(new Card("Пики","Король", 4));

        cards.add(new Card("Черви","Дама", 3));
        cards.add(new Card("Буби","Дама", 3));
        cards.add(new Card("Крести","Дама", 3));
        cards.add(new Card("Пики","Дама", 3));

        cards.add(new Card("Черви","Валет", 2));
        cards.add(new Card("Буби","Валет", 2));
        cards.add(new Card("Крести","Валет", 2));
        cards.add(new Card("Пики","Валет", 2));

        for (int i = 2; i <=10; i++)
        {
            cards.add(new Card("Черви",String.valueOf(i), i));
            cards.add(new Card("Буби",String.valueOf(i), i));
            cards.add(new Card("Крести",String.valueOf(i), i));
            cards.add(new Card("Пики",String.valueOf(i), i));
        }
    }
}
