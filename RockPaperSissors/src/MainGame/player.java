import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class player
{
    private String name;
    private int score;
    private boolean performance;
    private String[] gameMoves = {"Rock", "Paper", "Sissors"};
    private String chosenMove;
    public void playerSet(int score, boolean status, String name, String chosenMove)
    {
        this.score = score;
        this.performance = true; //false by default
        this.name = name;
        this.chosenMove = chosenMove;
    }
    
    public void botSet(boolean status, String name, String chosenMove2)
    {

    }
    public String gameCheck(String chosenMove1, String chosenMove2) //get rid of void after you finish setting this up.
    {
        if (chosenMove1.equals("Rock"))
        {
            if(chosenMove2.equals("Rock"))
            {
                return gameTie(name);
            }
            else if(chosenMove2.equals("Paper"))
            {
                return gameLost(name, performance);
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return gameWon(name, performance);
            }
            else
            {
                return "error";
            }
        }
        if (chosenMove1.equals("Paper"))
        {
            if(chosenMove2.equals("Rock"))
            {
                return gameWon(name, performance);
            }
            else if(chosenMove2.equals("Paper"))
            {
                return gameTie(name);
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return gameLost(name, performance);
            }
            else
            {
                return "error";
            }
        }
        if (chosenMove1.equals("Sissors"))
        {
            if(chosenMove2.equals("Rock"))
            {
                return gameLost(name, performance);
            }
            else if(chosenMove2.equals("Paper"))
            {
                return gameWon(name, performance);
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return gameTie(name);
            }
            else
            {
                return "error";
            }
        }
    }   

    public String gameLost(String name, boolean performance)
    {
        performance = false;
        statusCheck(performance);
        return name + "lost this round";
    }
    
    public String gameTie(String name)
    {
        return name + " tied with the bot this time.";
    }

    public String gameWon(String name, boolean performance)
    {
        performance = true;
        statusCheck(performance);
        return name + "won this round";
    }

    public void statusCheck(boolean performance)
    {
        if(performance == false)
        {
            score = score - 1;
            System.out.println(name + "lost");
        }
        else
        {
            score++;
            System.out.println(name + "won");
        }
    }



















}