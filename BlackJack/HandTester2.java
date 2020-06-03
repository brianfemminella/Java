import javax.swing.JOptionPane;
/**
 * HandTester2.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class HandTester2
{
    public static void main(String []args)
    {
        Shoe x1 = new Shoe(1);
        Hand h1 = new Hand();
        h1.hit(x1.drawCard());
        h1.getHandValue();
        System.out.println( h1);
        System.out.println( h1.getHandValue());
        h1.hit(x1.drawCard());
        h1.getHandValue();
        System.out.println( h1);
        System.out.println( h1.getHandValue());
        h1.hit(x1.drawCard());
        h1.getHandValue();
        System.out.println( h1);
        System.out.println( h1.getHandValue());
        h1.hit(x1.drawCard());
        h1.getHandValue();
        System.out.println( h1);
        System.out.println( h1.getHandValue());
        h1.hit(x1.drawCard());
        h1.getHandValue();
        System.out.println( h1);
        System.out.println( h1.getHandValue());
    }
}
/**
 * [A of ♠ with a value of 11]. 
The value of this hand is: 11
11
[A of ♠ with a value of 11, 2 of ♠ with a value of 2]. 
The value of this hand is: 13
13
[A of ♠ with a value of 11, 2 of ♠ with a value of 2, 3 of ♠ with a value of 3]. 
The value of this hand is: 16
16
[A of ♠ with a value of 11, 2 of ♠ with a value of 2, 3 of ♠ with a value of 3, 4 of ♠ with a value of 4]. 
The value of this hand is: 20
20
[A of ♠ with a value of 1, 2 of ♠ with a value of 2, 3 of ♠ with a value of 3, 4 of ♠ with a value of 4, 5 of ♠ with a value of 5]. 
The value of this hand is: 15
15

 */