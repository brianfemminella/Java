
/**
 * HandTester.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class HandTester 
{
   public static void main(String[] args)
   {
       Shoe c1 = new Shoe(4);
       c1.shuffle();
       Hand h1 = new Hand();
       h1.hit(c1.drawCard());
       h1.hit(c1.drawCard());
       System.out.println(h1);
       System.out.println(h1.busted());
       System.out.println("lets hit");
       h1.hit(c1.drawCard());
       h1.getHandValue();
       System.out.println(h1);
       System.out.println(h1.busted());
       System.out.println("\nTESTER NUMBER 2\n");
       Shoe c2 = new Shoe(1);
       Hand f = new Hand();
       f.hit(c2.drawCard());
       f.hit(c2.drawCard());
       System.out.println(f);
       System.out.println(f.busted());
       f.hit(c2.drawCard());
       f.hit(c2.drawCard());
       f.hit(c2.drawCard());
       h1.getHandValue();
       System.out.println(f);
       System.out.println(f.busted());
   }
}
/**
 * Here is your hand: [3 of ♣ with a value of 3, A of ♠ with a value of 11]. 
The value of your hand is: 14. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.
lets hit
Here is your hand: [3 of ♣ with a value of 3, A of ♠ with a value of 1, 10 of ♣ with a value of 10]. 
The value of your hand is: 14. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.

TESTER NUMBER 2

Here is your hand: [A of ♠ with a value of 11, 2 of ♠ with a value of 2]. 
The value of your hand is: 13. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: false.
Here is your hand: [A of ♠ with a value of 1, 2 of ♠ with a value of 2, 3 of ♠ with a value of 3, 4 of ♠ with a value of 4, 5 of ♠ with a value of 5]. 
The value of your hand is: 15. 
Lets check if you busted: false. 
Lets check if you have blackjack: false. 
Lets check if you have a five card charlie: true.

 */
