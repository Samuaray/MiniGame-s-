public class player
{
    private String name;
    private int score;
    private boolean status;
    private String[] gameMoves = {"Rock", "Paper", "Sissors"};
    private String chosenMove;
    public void gameSet(int score, boolean status, String name, String chosenMove)
    {
        this.score = score;
        this.status = status;
        this.name = name;
        this.chosenMove = chosenMove;
    }
    
    public  gameCheck(String chosenMove1, String chosenMove2) //get rid of void after you finish setting this up.
    {
        if (chosenMove1.equals("Rock"))
        {
            if(chosenMove2.equals("Rock"))
            {
                return //tie
            }
            else if(chosenMove2.equals("Paper"))
            {
                return //1 loses
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return //1 wins
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
                return //1wins
            }
            else if(chosenMove2.equals("Paper"))
            {
                return //tie
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return //1 loses
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
                return //1 loses
            }
            else if(chosenMove2.equals("Paper"))
            {
                return //1 wins
            }
            else if(chosenMove2.equals("Sissors"))
            {
                return //tie
            }
            else
            {
                return "error";
            }
        }
    }   




















}