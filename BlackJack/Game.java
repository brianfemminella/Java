import javax.swing.JOptionPane;
/**
 * Game.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class Game 
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Welcome to Brians's Casino located in Kenora Canada. Before we get started with BlackJack there are a few settings you must set.");
        String str = JOptionPane.showInputDialog("What is your name?");
        if(str == null)
        {
            System.exit(0);
        }
        boolean nondouble = true;
        double ban = 0;
        boolean valid = true;
        while(nondouble || valid)
        {
            try
            {
                ban = Double.parseDouble(JOptionPane.showInputDialog("How much money will you invest in blackjack?"));
                nondouble = false;
                valid = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please type an amount of money!");
            }
            if(!(ban > 0))
            {
                JOptionPane.showMessageDialog(null, "Please enter a positive amount of money!!");
                valid = true;
            }
        }

        Player player = new Player (str, ban);
        nondouble = true;
        int lol = 0;
        valid = true;
        boolean biggy = true;
        while(nondouble || valid || biggy)
        {
            try
            {
                lol = Integer.parseInt(JOptionPane.showInputDialog("How many decks would you like to play with?"));
                nondouble = false;
                valid = false;
                biggy = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please type an integer!\nOr a smaller amount of decks!");
            }
            if(!(lol > 0))
            {
                JOptionPane.showMessageDialog(null, "Please enter a positive amount of decks!!");
                valid = true;
            }
            else if (lol > 1000)
            {
                biggy = true;
                JOptionPane.showMessageDialog(null, "We only have 1000 decks in the casino!");
            }
        }
        Shoe shoe = new Shoe(lol);
        Dealer deal = new Dealer(player, shoe);
        JOptionPane.showMessageDialog(null, "Awesome! Now for the rules... First no eating or drinking in the casino. Second, the dealer shuffles and reshuffles every hand. Finally, at the end of the game all money you have won will be returned to the dealer. LETS PLAY!");
        Object[] options = { "Hit", "Stay"};
        Object[] options4 = { "Hit", "Stay", "Double Down"};
        Object[] options2 = { "Play Again", "Done"};
        Object[] options3 = { "Split", "Don't Split"};
        int m = 1;
        while((player.getBankroll()>0) && (m == 1))
        {
            player.clearPHand();
            deal.clearDHand();player.clearP2Hand();
            deal.startRound();
            int q =0;
            double bet = 0;
            int troll = 0;
            int s = 0;
            int t = 0;
            int mult = 1;
            while(q == 0)
            {
                nondouble = true;
                valid = true;
                while(nondouble || valid)
                {
                    try
                    {
                        bet = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to bet this round?"));
                        nondouble = false;
                        valid = false;
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Please type an integer!");
                    }
                    if(!(lol > 0))
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a positive bet!!");
                        valid = true;
                    }
                }
                if(bet > player.getBankroll())
                {
                    JOptionPane.showMessageDialog(null, "Sorry you don't have that much money... please place a smaller bet!");
                }
                else 
                {
                    q = 1;
                }
            }
            int lmnop = 0;
            if(player.getPHandValue() == 20)
            {
                int red = JOptionPane.showOptionDialog(null, "Wow your hand is : " + player.getPHand() + "\nThe dealers top card is: " + deal.getDTopCard() + "\nWould you like to split?", "BlackJack",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options3, null);
                if(red == 0)
                {
                    lmnop = 1;
                }
            }
            else
            {
                lmnop = 0;
            }
            if(lmnop == 0)
            {
                if(player.getPHand().blackjack()==true)
                {
                    int red = JOptionPane.showOptionDialog(null, "Congratulations you got blackjack! You WIN!!\n$"+bet*1.5+" has been awarded to your bankroll.", "BlackJack",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options2, null);
                    player.addMoney(bet*1.5);
                    if(red == 1)
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    if(bet*2 <= player.getBankroll())
                    {
                        s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getPHand()+"\nThe dealer is showing a(n) " + deal.getDTopCard() + "\nWhat would you like to do?", "BlackJack",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options4, null);
                        if (s==0)
                        {
                            player.hit(shoe.drawCard());
                        }
                        t = 0;
                        mult = 1;
                        if(s==2)
                        {
                            t = 7;
                            player.hit(shoe.drawCard());
                            mult = 2;
                        }
                    }
                    else
                    {
                        s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getPHand()+"\nThe dealer is showing a(n) " + deal.getDTopCard() + "\nWhat would you like to do?", "BlackJack",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options, null);
                        if (s==0)
                        {
                            player.hit(shoe.drawCard());
                        }
                    }
                    while((s == 0) && (t == 0))
                    {
                        player.getPHandValue();
                        player.playerBusted();
                        if(player.getPHand().blackjack()==true)
                        {
                            t = 1;
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you got blackjack! You WIN!!\n$"+bet*1.5+" has been awarded to your bankroll.", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet*1.5);
                            if(red == 0)
                            {
                                troll = 1;
                            }
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if((player.playerBusted() == true) || (player.getPHand().getHandValue() > 21))
                        { 
                            t = 1;
                            int red = JOptionPane.showOptionDialog(null, "Sorry you busted... Would you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet);
                            if(red == 0)
                            {
                                troll =1;
                            }
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if (player.getPHand().fiveCardCharlie())
                        {
                            t = 1;
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you got a five card charlie! You WIN!!\n$"+bet+" has been awarded to your bankroll.", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet);
                            if(red == 0)
                            {
                                troll = 1;
                            }
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else
                        {
                            s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getPHand() + "\nWhat would you like to do?", "BlackJack",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, options, null);
                            player.getPHandValue();
                            if(s == 0)
                            {
                                player.hit(shoe.drawCard());
                            }
                            if(s == 1)
                            {
                                break;
                            }
                        }
                    }
                    if(t == 7)
                    {
                        if((player.playerBusted() == true) || (player.getPHand().getHandValue() > 21))
                        { 
                            t = 1;
                            int red = JOptionPane.showOptionDialog(null, "Sorry you busted... Would you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet*mult);
                            if(red == 0)
                            {
                                troll =1;
                            }
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                    }
                    if(troll == 0)
                    {
                        while(deal.dealerMove())
                        {
                            deal.hit(shoe.drawCard());
                        }
                        player.getPHand();
                        JOptionPane.showMessageDialog(null, "Your hand is: " + player.getPHand()+"\nThe dealer's hand is: " + deal.getDHand());
                        if(player.getPHandValue() == deal.getDHand().getHandValue())
                        {
                            int red = JOptionPane.showOptionDialog(null, "Looks like its a draw! Your bet is returned to your bankroll.\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if ((player.getPHandValue()<deal.getDHand().getHandValue()) && (deal.getDHand().busted() == false))
                        {
                            int red = JOptionPane.showOptionDialog(null, "Sorry the dealer won this time!\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet*mult);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else 
                        {
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you won! You won $"+bet*mult+".\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet*mult);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                    }

                    deal.clearDHand();
                    player.clearPHand();
                    player.clearP2Hand();
                    JOptionPane.showMessageDialog(null, "Your current bankroll is: $" +player.getBankroll() + "\nGood luck " + player.getName());
                    if(player.getBankroll() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry your all out of money! \nMaybe next time... ");
                    }
                    deal.startRound();
                }
            }
            else 
            {
                player.doubleDown();
                JOptionPane.showMessageDialog(null, "Your first hand is :" +player.getPHand());
                int corp = 0;
                int slick = 0;
                if(player.getPHand().blackjack()==true)
                {
                    JOptionPane.showMessageDialog(null, "Congratulations you got blackjack! You WIN!!\n$"+bet+" has been awarded to your bankroll. Now to your other hand");
                    player.addMoney(bet*1.5);
                }
                else
                {
                    s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getPHand()+"\nThe dealer is showing a(n) " + deal.getDTopCard() + "\nWhat would you like to do?", "BlackJack",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, null);
                    if (s==0)
                    {
                        player.hit(shoe.drawCard());
                    }
                    t = 0;
                    while((s == 0) && (t == 0))
                    {
                        player.getPHandValue();
                        player.playerBusted();
                        if(player.getPHand().blackjack()==true)
                        {
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Congratulations you got blackjack! You WIN!!\n$"+bet+" has been awarded to your bankroll. Now to your other hand");
                            player.addMoney(bet*1.5);
                        }
                        else if((player.playerBusted() == true) || (player.getPHand().getHandValue() > 21))
                        { 
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Sorry you busted... now to your second hand");
                            player.removeMoney(bet);
                        }
                        else if (player.getPHand().fiveCardCharlie())
                        {
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Congratulations you got a five card charlie! You WIN!!\n$"+bet+" has been awarded to your bankroll. Now to your other hand");
                            player.addMoney(bet);
                        }
                        else
                        {
                            s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getPHand() + "\nWhat would you like to do?", "BlackJack",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, options, null);
                            player.getPHandValue();
                            if(s == 0)
                            {
                                player.hit(shoe.drawCard());
                            }
                            if(s == 1)
                            {
                                corp = 1;
                                break;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Your second hand is :" +player.getP2Hand());
                    s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getP2Hand()+"\nThe dealer is showing a(n) " + deal.getDTopCard() + "\nWhat would you like to do?", "BlackJack",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, null);
                    if (s==0)
                    {
                        player.hit2(shoe.drawCard());
                    }
                    t = 0;
                    while((s == 0) && (t == 0))
                    {
                        if(player.getP2Hand().blackjack()==true)
                        {
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Congratulations you got blackjack! You WIN this hand!!\n$"+bet+" has been awarded to your bankroll.");
                            player.addMoney(bet*1.5);
                        }
                        else if((player.playerBusted() == true) || (player.getP2Hand().getHandValue() > 21))
                        { 
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Sorry you busted... ");
                            player.removeMoney(bet);
                        }
                        else if (player.getP2Hand().fiveCardCharlie())
                        {
                            t = 1;
                            JOptionPane.showMessageDialog(null, "Congratulations you got a five card charlie! You WIN!!\n$"+bet+" has been awarded to your bankroll.");
                            player.addMoney(bet);
                        }
                        else
                        {
                            s = JOptionPane.showOptionDialog(null, "Your hand is: " + player.getP2Hand() + "\nWhat would you like to do?", "BlackJack",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, options, null);
                            player.getP2Hand().getHandValue();
                            if(s == 0)
                            {
                                player.hit2(shoe.drawCard());
                            }
                            if(s == 1)
                            {
                                slick = 1;
                                break;
                            }
                        }
                    }
                    if((slick == 1) && (corp == 1))
                    {
                        while(deal.dealerMove())
                        {
                            deal.hit(shoe.drawCard());
                        }
                        JOptionPane.showMessageDialog(null, "Your first hand is: " + player.getPHand()+"\nYour second hand is: " + player.getP2Hand() + "\nThe dealer's hand is: " + deal.getDHand());
                        if(player.getPHandValue() == deal.getDHand().getHandValue())
                        {
                            JOptionPane.showMessageDialog(null, "Looks your first hand is a draw! Your bet is returned to your bankroll.");
                        }
                        else if ((player.getPHandValue()<deal.getDHand().getHandValue()) && (deal.getDHand().busted() == false))
                        {
                            JOptionPane.showMessageDialog(null, "Sorry the dealer beat your first hand!");
                            player.removeMoney(bet);
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Congratulations you won! You won $"+bet);
                            player.addMoney(bet);
                        }
                        if(player.getP2Hand().getHandValue() == deal.getDHand().getHandValue())
                        {
                            int red = JOptionPane.showOptionDialog(null, "Looks like your second hand is a draw! Your bet is returned to your bankroll.\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if ((player.getP2Hand().getHandValue()<deal.getDHand().getHandValue()) && (deal.getDHand().busted() == false))
                        {
                            int red = JOptionPane.showOptionDialog(null, "Sorry the dealer won this hand this time!\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else 
                        {
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you won this hand! You won $"+bet+".\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                    }
                    else if (corp == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Your hand is: " + player.getPHand()+"\nThe dealer's hand is: " + deal.getDHand());
                        if(player.getPHandValue() == deal.getDHand().getHandValue())
                        {
                            int red = JOptionPane.showOptionDialog(null, "Looks like its a draw! Your bet is returned to your bankroll.\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if ((player.getPHandValue()<deal.getDHand().getHandValue()) && (deal.getDHand().busted() == false))
                        {
                            int red = JOptionPane.showOptionDialog(null, "Sorry the dealer won this time!\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else 
                        {
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you won! You won $"+bet+".\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                    }
                    else if (slick == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Your hand is: " + player.getP2Hand()+"\nThe dealer's hand is: " + deal.getDHand());
                        if(player.getP2Hand().getHandValue() == deal.getDHand().getHandValue())
                        {
                            int red = JOptionPane.showOptionDialog(null, "Looks like your second hand is a draw! Your bet is returned to your bankroll.\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else if ((player.getP2Hand().getHandValue()<deal.getDHand().getHandValue()) && (deal.getDHand().busted() == false))
                        {
                            int red = JOptionPane.showOptionDialog(null, "Sorry the dealer won this hand time!\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.removeMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                        else 
                        {
                            int red = JOptionPane.showOptionDialog(null, "Congratulations you won this hand! You won $"+bet+".\nWould you like to play again?", "BlackJack",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                    null, options2, null);
                            player.addMoney(bet);
                            if(red == 1)
                            {
                                System.exit(0);
                            }
                        }
                    }
                    deal.clearDHand();
                    player.clearPHand();
                    player.clearP2Hand();
                    JOptionPane.showMessageDialog(null, "Your current bankroll is: $" +player.getBankroll() + "\nGood luck " + player.getName());
                    if(player.getBankroll() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry your all out of money! \nMaybe next time... ");
                    }
                    deal.startRound();
                }
            }
        }
    }
}