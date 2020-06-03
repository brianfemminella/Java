import java.util.ArrayList;
/**
 * Permutations.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class Permutations 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ben = new ArrayList<Integer>();
        for(int i = 1; i <=10; i++)
        {
            ben.add(i);
        }
        System.out.println(ben);
        ArrayList<Integer> tyler = new ArrayList<Integer>();
        int i = ben.size();
        while(i > 0)
        {
            int x = (int) (Math.random()*ben.size());
            tyler.add(ben.get(x));
            ben.remove(x);
            i--;
        }
        ben = tyler;
        System.out.println(ben);
    }
}
