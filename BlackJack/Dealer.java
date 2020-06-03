
/**
 * Dealer.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Dealer
{
    private Hand dHand;
    private Player tyler;
    private Shoe shoe;
    /**
     * Construct the player of the game with a name, and bankroll
     */
    Dealer(Player t, Shoe s)
    {
        shoe = s;
        tyler = t;
        dHand = new Hand();
    }
    
    /**
     * return the hand of the dealer
     * @return Hand dHand the hand of the dealer
     */
    public Hand getDHand()
    {
        return dHand;
    }
    
    /**
     * return the top card of the dealer
     * @return Hand dHand[0] the top card of the dealer
     */
    public Card getDTopCard()
    {
        return dHand.topCard();
    }
    
    /**
     * Add a card to the dealers hand
     * 
     */
    public void hit(Card c)
    {
        dHand.hit(c);
    }
    
    /**
     * clear the hand of the dealer
     * @void clear hand
     */
    public void clearDHand()
    {
        dHand = new Hand();
    }
    
    /**
     * Decide if the dealer should hit or stay
     * @boolean True if the dealer should hit, false if the dealer should stay
     */
    public boolean dealerMove()
    {
        if(dHand.getHandValue() <= 16)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    /**
     * start the game for dealer
     */
    public void startRound()
    {
        shoe.shuffle();
        shoe.reshuffle();
        tyler.hit(shoe.drawCard());
        hit(shoe.drawCard());
        tyler.hit(shoe.drawCard());
        hit(shoe.drawCard());
    }
    
    /**
     * start the game for dealer
     */
    public void endRound()
    {
        tyler.clearPHand();
        clearDHand();
        shoe.reshuffle();
        shoe.shuffle();
    }
    
    /**
     * Test all the methods of the dealer class
     * @return String toString()
     */
    public String toString()
    {
        return "The dealers hand is: " + dHand + "\nThe dealer should... (if true hit, if false stay) " + dealerMove();
    }
}
