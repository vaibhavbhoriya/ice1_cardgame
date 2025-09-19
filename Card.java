/**
 * SYST 17796 – ICE 1
 * Modifier: Vaibhav Vaibhav (Student ID: 991788320)
 */
public class Card {
    private int value;       
    private String suit;     

    public Card() { }

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    public String getSuit() { return suit; }
    public void setSuit(String suit) { this.suit = suit; }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card c = (Card) o;
        return this.value == c.value && this.suit.equals(c.suit);
    }

    @Override
    public int hashCode() {
        return (suit + ":" + value).hashCode();
    }
}
