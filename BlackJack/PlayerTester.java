/**
 * PlayerTester.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class PlayerTester
{
    public static void main(String[] args)
    {
        Player t = new Player("Tyler", 10000);
        System.out.println(t);
        Shoe c1 = new Shoe(4);
        t.hit(c1.drawCard());
        System.out.println("test after you add a card to hand" + t);
        t.addMoney(1000);
        System.out.println("test after you add 1000 to bankroll" + t);
        t.removeMoney(1500);
        System.out.println("test after you take 1500 from your bankroll" + t);
    }
}
/**
 * The name of the player is: Tyler.
The bankroll of the player is: 10000.0.
Your hand is: Here is your hand: []. 
The value of your hand is: 0. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..
test after you add a card to handThe name of the player is: Tyler.
The bankroll of the player is: 10000.0.
Your hand is: Here is your hand: [A of ♠ with a value of 1]. 
The value of your hand is: 11. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..
test after you add 1000 to bankrollThe name of the player is: Tyler.
The bankroll of the player is: 11000.0.
Your hand is: Here is your hand: [A of ♠ with a value of 11]. 
The value of your hand is: 1. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..
test after you take 1500 from your bankrollThe name of the player is: Tyler.
The bankroll of the player is: 9500.0.
Your hand is: Here is your hand: [A of ♠ with a value of 1]. 
The value of your hand is: 11. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..

 */