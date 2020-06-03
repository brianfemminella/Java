import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Player.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Player
{
    private String name;
    private double bankroll;
    private Hand pHand;
    private Hand p2Hand = new Hand();
    /**
     * Construct the player of the game with a name, and bankroll
     */
    Player(String n, double b)
    {
        pHand = new Hand();
        name = n;
        bankroll = b;
    }
    
    /**
     * return the bankroll of the player
     * @return double bankroll the amount of cash money the player has
     */
    public double getBankroll()
    {
        return bankroll;
    }
    
    /**
     * return the name of the player
     * @return String name the name of the player
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * return the hand of the player
     * @return Hand pHand the hand of the player
     */
    public Hand getPHand()
    {
        return pHand;
    }
    
    /**
     * return the second hand of the player if he doubled down
     * @return Hand p2Hand the second hand of the player
     */
    public Hand getP2Hand()
    {
        return p2Hand;
    }
    
    /**
     * check if the player busted
     * @return boolean true if the player busted
     */
    public boolean playerBusted()
    {
        return pHand.busted();
    }
    
    /**
     * hit on the players second hand if he doubles down
     */
    public void hit2(Card c)
    {
        p2Hand.hit(c);
    }
    
    /**
     * allow the player to split his cards into two array lists and possibly win double
     */
    public void doubleDown()
    {
        hit2(pHand.topCard());
        pHand.clear1Hand();
    }
    
    /**
     * return the value of the players hand
     * @return the value of the players hand
     */
    public int getPHandValue()
    {
        return pHand.getHandValue();
    }
    
    /**
     * add money to the bankroll of the player
     * @param double amount of money to add
     */
    public void addMoney(double x)
    {
        bankroll += x;
    }
    
    /**
     * remove money from the bankroll of the player
     * @param double amount of money to remove
     */
    public void removeMoney(double x)
    {
        bankroll -= x;
    }
    
    /**
     * Add a card to the players hand
     * 
     */
    public void hit(Card c)
    {
        pHand.hit(c);
    }
    
    /**
     * clear the hand of the player
     * @void clear hand
     */
    public void clearPHand()
    {
        pHand = new Hand();
    }
    
    /**
     * clear the second hand of the player
     * @void clear p2hand
     */
    public void clearP2Hand()
    {
        p2Hand = new Hand();
    }
    
    /**
     * Test all the methods of the player class
     * @return String toString()
     */
    public String toString()
    {
        return "The name of the player is: " + getName() +".\nThe bankroll of the player is: " +getBankroll() + ".\nYour hand is: " + getPHand() + ".";
    }
}
