import java.util.ArrayList;
/**
 * Shoe.java  
 *
 * @author: Tyler Jensen
 * Brief Program Description: construct a shoe of decks
 */
public class Shoe
{
    private ArrayList<Card> shoe = new ArrayList<Card>();
    private ArrayList<Card> trash = new ArrayList<Card>();
    /**
     * construct a shoe
     */
    Shoe(int n)
    {
        while(n > 0)
        {
            addDeck();
            n--;
        }
    }
    /**
     * Add a deck into the shoe
     */
    public void addDeck()
    {
        Deck d = new Deck();
        while(d.getSize() > 0)
        {
            shoe.add(d.drawCard());
        }
    }
    /**
     * shuffle the deck
     */
    public void shuffle()
    {
        ArrayList<Card> tyl = new ArrayList<Card>();
       int i = shoe.size();
       while(i > 0)
       {
           int x = (int) (Math.random()*shoe.size());
           tyl.add(shoe.get(x));
           shoe.remove(x);
           i--;
       }
       shoe = tyl;
    }
    /**
     * reshuffle the cards from the trash back into the deck
     */
    public void reshuffle()
    {
       shoe.addAll(trash);
       trash = new ArrayList<Card>();
       shuffle();
    }
    /**
     * return the size of the shoe
     * @return the size of the shoe
     */
    public int shoeSize()
    {
        return shoe.size();
    }
    /**
     * Takes a card out of the deck and returns it
     * @return Card card The card taken
     */
    public Card drawCard()
    {
        Card card = shoe.get(0);
        trash.add(card);
        shoe.remove(card);
        return card;
    }
    /**
     * toString() to test all methods of the shoe
     * @return String 
     */
    public String toString()
    {
        return "The size of your show is " + this.shoeSize()+". You draw the card... \n" + this.drawCard()+ "\n the shoe is :" + shoe;
    }
}
