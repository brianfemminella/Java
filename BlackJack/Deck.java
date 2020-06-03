import java.util.ArrayList;
/**
 * Deck.java 
 *
 * @author: Tyler Jensen
 * Brief program description: construct a deck of cards
 */

public class Deck 
{
    private ArrayList<Card> cards;
    private ArrayList<Card> trash = new ArrayList<Card>();
    /**
     * construct the deck
     * No param
     */
    public Deck()
    {
        cards = new ArrayList<Card>();

        for(int i = 1; i <= 13; i++)
        {
            cards.add(new Card(3, i));
        }

        for(int i = 1; i <= 13; i++)
        {
            cards.add(new Card(2, i));
        }

        for(int i = 13; i >= 1; i--)
        {
            cards.add(new Card(4, i));
        }

        for(int i = 13; i >= 1; i--)
        {
            cards.add(new Card(1, i));
        }
    }

    /**
     * 
     */
    public ArrayList<Card> getDeck()
    {
        return cards;
    }

    /**
     * Returns the size of the deck
     * @return int The size of the deck
     */
    public int getSize()
    {
        return cards.size();
    }

    /**
     * Takes a card out of the deck and returns it
     * @return Card card The card taken
     */
    public Card drawCard()
    {
        Card card = cards.get(0);
        trash.add(card);
        cards.remove(card);

        return card;
    }

    /**
     * Shuffle the cards in a deck
     * @void shuffle the cards of the deck
     */
    public void shuffle()
    {
        ArrayList<Card> tyl = new ArrayList<Card>();
        int i = cards.size();
        while(i > 0)
        {
            int x = (int) (Math.random()*cards.size());
            tyl.add(cards.get(x));
            cards.remove(x);
            i--;
        }
        cards = tyl;
    }

    /**
     * reshuffle the cards from the trash back into the deck
     */
    public void reshuffle()
    {
        cards.addAll(trash);
        trash = new ArrayList<Card>();
        shuffle();
    }

    public String toString()
    {
        String s = "";

        for(Card i:cards)
        {
            s += i.toString() + "\n";
        }

        return s;
    }
}
