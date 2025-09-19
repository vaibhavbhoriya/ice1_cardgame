/**
 * SYST 17796 – ICE 1
 * Modifier: Vaibhav Vaibhav (Student ID: 991788320)
 */

import java.util.Random;

public class CardTrick {

    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };

    public static void main(String[] args) {
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            int value = 1 + rand.nextInt(13);             
            String suit = SUITS[rand.nextInt(SUITS.length)];
            magicHand[i] = new Card(value, suit);
        }

        for (Card c : magicHand) {
            System.out.println(c);
            
        }
        
        Card luckyCard = new Card(2, "Spades");
        // lucky card forced
        magicHand[0] = luckyCard;  

        boolean found = false;
        for (Card c : magicHand) {
            if (c.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Winner! The lucky card (" + luckyCard + ") is in the magic hand.");
        } else {
            System.out.println("Sorry, your lucky card (" + luckyCard + ") is not in the magic hand.");
        }
    }
}
