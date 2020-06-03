
/**
 * DealerTester.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class DealerTester
{
    public static void main(String[] args)
    {
        Shoe s1 = new Shoe(6);
        Player tyler = new Player("Tyler", 1000);
        Dealer deal = new Dealer(tyler, s1);
        System.out.println("Time to start the game...\n");
        deal.startRound();
        System.out.println(tyler);
        System.out.println(deal);
        System.out.println("\n now both the dealer and the player will hit\n");
        deal.hit(s1.drawCard());
        tyler.hit(s1.drawCard());
        System.out.println(tyler);
        System.out.println(deal);
        System.out.println("\n now testing the endround method\n");
        deal.endRound();
        System.out.println(tyler);
        System.out.println(deal);
    }
}
/**
 * Time to start the game...

The name of the player is: Tyler.
The bankroll of the player is: 1000.0.
Your hand is: Here is your hand: [A of ♣ with a value of 11, J of ♢ with a value of 10]. 
The value of your hand is: 21. 
Lets check if you busted: false. 
Lets check if you have blackjack: true. 
Lets check if you have a five card charlie: false..
The dealers hand is: Here is your hand: [7 of ♡ with a value of 7, 10 of ♢ with a value of 10]. 
The value of your hand is: 17. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.
The dealer should... (if true hit, if false stay) false

 now both the dealer and the player will hit

The name of the player is: Tyler.
The bankroll of the player is: 1000.0.
Your hand is: Here is your hand: [A of ♣ with a value of 11, J of ♢ with a value of 10, 10 of ♠ with a value of 10]. 
The value of your hand is: 21. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..
The dealers hand is: Here is your hand: [7 of ♡ with a value of 7, 10 of ♢ with a value of 10, 9 of ♣ with a value of 9]. 
The value of your hand is: 26. 
Lets check if you busted: true. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.
The dealer should... (if true hit, if false stay) false

 now testing the endround method

The name of the player is: Tyler.
The bankroll of the player is: 1000.0.
Your hand is: Here is your hand: []. 
The value of your hand is: 0. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false..
The dealers hand is: Here is your hand: []. 
The value of your hand is: 0. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.
The dealer should... (if true hit, if false stay) true

 */