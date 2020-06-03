import java.util.ArrayList;
/**
 * Hand.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Hand
{
    private ArrayList<Card> hand;
    /**
     * construct a hand for a player
     */
    public Hand()
    {
        hand = new ArrayList<Card>();
    }

    /**
     * draw a card for the player and add it to their hand
     * @param card c which will be shoe.drawCard()
     */
    public void hit(Card c)
    {
        hand.add(c);
    }

    /**
     * return true if the hand is over 21, return false if the hand is under 22
     * @return boolean z if value > 21 return true, if value < 22 return false
     */
    public boolean busted()
    {
        int t = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            t += hand.get(i).getValue();
        }
        if(t <= 21)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * get the value of a card in the hand of the player
     * @return int value of the card
     */
    public int getHandValue()
    {
        int t = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            t += hand.get(i).getValue();
        }
        int x = 1;
        int pos = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            if(hand.get(i).getRank() == "A")
            {
                x = 2;
                pos = i;
            }
        }
        boolean z = false;
        if(t <= 21)
        {
            z = false;
        }
        else if (t>21)
        {
            z = true;
        }
        if((z == true) && (x == 2))
        {
            hand.get(pos).aceValue();
        }
        int q = 0;
        for(int i = 0; i < hand.size(); i++)
        {
            q += hand.get(i).getValue();
        }
        return q;
    }

    /**
     * check if the player has blackjack
     * @return true if player has two cards equal to 21
     */
    public boolean blackjack()
    {
        
        if((hand.size() == 2) && getHandValue() == 21)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    /**
     * clear the hand of the player
     * @void clear hand array
     */
    public void clearHand()
    {
        hand = new ArrayList<Card>();
    }
    
    /**
     * remove the first card in the players hand
     * @void clear hand.get(1)
     */
    public void clear1Hand()
    {
        hand.remove(0);
    }
    
    /**
     * return top card
     * @Card the top card
     */
    public Card topCard()
    {
        return hand.get(0);
    }

    /**
     * check if player has a fivecardcharlie
     * @return true if player has 5 cards
     */
    public boolean fiveCardCharlie()
    {
        if((hand.size() == 5) && (getHandValue() <= 21))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * test all the methods of the hand class
     * @return String toString()
     */
    public String toString()
    {
        return hand + ". \nThe value of this hand is: " + getHandValue();// + ". \nLets check if you busted: " + busted() + ". \nLets check if you have blackjack: " + blackjack() +  ". \nLets check if you have a five card charlie: " + fiveCardCharlie() + ".";
    }
}
