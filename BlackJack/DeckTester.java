
/**
 * DeckTester.java 
 *
 * @author: Tyler Jensen
 * Brief program description: test the deck class
 */

public class DeckTester 
{
   public static void main(String[] args)
   {
       Deck tm = new Deck();
       
       System.out.println(tm);
       
       System.out.println(tm.getSize());
       
       System.out.println("\n\n" + tm.drawCard());
       
       System.out.println("\n\n" + tm.getSize());
       
       tm.shuffle();
       
       System.out.println("after a shuffle your deck is... " + tm);
       tm.reshuffle();
       System.out.println("after a reshuffle your deck is... " + tm);
   }
}
/**
 * A of ♠ with a value of 1
2 of ♠ with a value of 2
3 of ♠ with a value of 3
4 of ♠ with a value of 4
5 of ♠ with a value of 5
6 of ♠ with a value of 6
7 of ♠ with a value of 7
8 of ♠ with a value of 8
9 of ♠ with a value of 9
10 of ♠ with a value of 10
J of ♠ with a value of 10
Q of ♠ with a value of 10
K of ♠ with a value of 10
A of ♢ with a value of 1
2 of ♢ with a value of 2
3 of ♢ with a value of 3
4 of ♢ with a value of 4
5 of ♢ with a value of 5
6 of ♢ with a value of 6
7 of ♢ with a value of 7
8 of ♢ with a value of 8
9 of ♢ with a value of 9
10 of ♢ with a value of 10
J of ♢ with a value of 10
Q of ♢ with a value of 10
K of ♢ with a value of 10
K of ♣ with a value of 10
Q of ♣ with a value of 10
J of ♣ with a value of 10
10 of ♣ with a value of 10
9 of ♣ with a value of 9
8 of ♣ with a value of 8
7 of ♣ with a value of 7
6 of ♣ with a value of 6
5 of ♣ with a value of 5
4 of ♣ with a value of 4
3 of ♣ with a value of 3
2 of ♣ with a value of 2
A of ♣ with a value of 1
K of ♡ with a value of 10
Q of ♡ with a value of 10
J of ♡ with a value of 10
10 of ♡ with a value of 10
9 of ♡ with a value of 9
8 of ♡ with a value of 8
7 of ♡ with a value of 7
6 of ♡ with a value of 6
5 of ♡ with a value of 5
4 of ♡ with a value of 4
3 of ♡ with a value of 3
2 of ♡ with a value of 2
A of ♡ with a value of 1

52


A of ♠ with a value of 1


51
after a shuffle your deck is... J of ♣ with a value of 10
8 of ♢ with a value of 8
K of ♢ with a value of 10
A of ♡ with a value of 1
8 of ♣ with a value of 8
7 of ♢ with a value of 7
10 of ♣ with a value of 10
9 of ♡ with a value of 9
7 of ♠ with a value of 7
A of ♣ with a value of 1
4 of ♣ with a value of 4
3 of ♣ with a value of 3
6 of ♠ with a value of 6
3 of ♢ with a value of 3
9 of ♣ with a value of 9
7 of ♡ with a value of 7
5 of ♢ with a value of 5
10 of ♢ with a value of 10
4 of ♢ with a value of 4
6 of ♣ with a value of 6
5 of ♣ with a value of 5
5 of ♠ with a value of 5
3 of ♠ with a value of 3
9 of ♠ with a value of 9
5 of ♡ with a value of 5
2 of ♢ with a value of 2
K of ♡ with a value of 10
4 of ♠ with a value of 4
Q of ♡ with a value of 10
3 of ♡ with a value of 3
K of ♣ with a value of 10
2 of ♣ with a value of 2
8 of ♡ with a value of 8
A of ♢ with a value of 1
Q of ♣ with a value of 10
J of ♠ with a value of 10
J of ♢ with a value of 10
10 of ♠ with a value of 10
J of ♡ with a value of 10
9 of ♢ with a value of 9
K of ♠ with a value of 10
7 of ♣ with a value of 7
Q of ♢ with a value of 10
2 of ♡ with a value of 2
6 of ♢ with a value of 6
10 of ♡ with a value of 10
2 of ♠ with a value of 2
8 of ♠ with a value of 8
6 of ♡ with a value of 6
4 of ♡ with a value of 4
Q of ♠ with a value of 10

after a reshuffle your deck is... A of ♢ with a value of 1
8 of ♢ with a value of 8
J of ♢ with a value of 10
A of ♡ with a value of 1
K of ♠ with a value of 10
K of ♡ with a value of 10
10 of ♢ with a value of 10
6 of ♡ with a value of 6
7 of ♡ with a value of 7
10 of ♣ with a value of 10
6 of ♢ with a value of 6
3 of ♢ with a value of 3
2 of ♡ with a value of 2
7 of ♣ with a value of 7
3 of ♡ with a value of 3
5 of ♢ with a value of 5
9 of ♠ with a value of 9
2 of ♣ with a value of 2
2 of ♠ with a value of 2
J of ♡ with a value of 10
5 of ♡ with a value of 5
9 of ♡ with a value of 9
A of ♠ with a value of 1
7 of ♢ with a value of 7
A of ♣ with a value of 1
Q of ♠ with a value of 10
8 of ♣ with a value of 8
Q of ♢ with a value of 10
6 of ♣ with a value of 6
8 of ♠ with a value of 8
5 of ♣ with a value of 5
3 of ♣ with a value of 3
4 of ♢ with a value of 4
3 of ♠ with a value of 3
J of ♠ with a value of 10
9 of ♢ with a value of 9
6 of ♠ with a value of 6
8 of ♡ with a value of 8
5 of ♠ with a value of 5
K of ♣ with a value of 10
4 of ♠ with a value of 4
7 of ♠ with a value of 7
9 of ♣ with a value of 9
4 of ♡ with a value of 4
4 of ♣ with a value of 4
K of ♢ with a value of 10
Q of ♡ with a value of 10
2 of ♢ with a value of 2
10 of ♡ with a value of 10
10 of ♠ with a value of 10
Q of ♣ with a value of 10
J of ♣ with a value of 10



 */
