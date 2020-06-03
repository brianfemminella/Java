
/**
 * CardTester.java 
 *
 * @author: Tyler Jensen
 * Brief Program Description: tests the card class
 */

public class CardTester 
{
    public static void main(String[] args)
    {
        Card ace = new Card(3, 1);

        System.out.println(ace);

        System.out.println("\n" + ace.getSuit());
        System.out.println(ace.getRank());
        System.out.println(ace.getValue());

        ace.aceValue();

        System.out.println("\n" + ace.getSuit());
        System.out.println(ace.getRank());
        System.out.println(ace.getValue());

        System.out.println("\n" + ace);
    }
}

/**
 * A of ♠ with a value of 11

♠
A
11

♠
A
1

A of ♠ with a value of 1

 */
