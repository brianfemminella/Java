
/**
 * Card.java 
 *
 * @author: Tyler Jensen
 * Brief Program Description:
 * This constructs a card with a suit rank and value
 */

public class Card 
{
    private int suit;
    private int rank;
    public int value;

    /**
     * Parameterized constructor of the card class
     * @param int s The suit of the card
     * @param int r The rank of the card
     */
    Card(int s, int r)
    {
        suit = s;
        rank = r;

        if(r != 1 && r <= 10)
        {
            value = r;
        }
        else if(r == 11 || r == 12 || r == 13)
        {
            value = 10;
        }
        else
        {
            value = 11;
        }
    }

    /**
     * Returns the suit of the card
     * @return String s The suit
     */
    public String getSuit()
    {
        String[] suits = new String[] {"♡","♢","♠","♣"};

        return suits[suit - 1];
    }

    /**
     * Returns the rank of the card
     * @return String r The rank
     */
    public String getRank()
    {
        String[] ranks = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        return ranks[rank - 1];
    }

    /**
     * Changes the value of the ace: 1 or 11
     * void
     */
    public void aceValue()
    {
        value = 1;
    }
    
    /**
     * Returns the value of the card
     * @return int v The value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Returns a String representation of the class
     * @return A string representation of the class
     */
    public String toString()
    {
        return this.getRank() + " of " + this.getSuit() + " with a value of " + this.getValue();
    }
}
