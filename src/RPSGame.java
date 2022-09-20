public class RPSGame
{
    public static void main(String[] args)
    {
        String playerA = "P"; /// must be R, P or S
        String playerB = "P"; /// must be R, P or S

        if (playerA.equalsIgnoreCase("R"))
        {
            // PlayerB code crossed against the Player A rock move
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock. It's a TIE!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock. Player B wins!");
            }
            else // Player must be Scissors
            {
                System.out.println("Rock breaks Scissors. Player A wins!");
            }
        }

        else if (playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock. PlayerA wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper. It's a TIE!");
            }
            else // Player B must be Scissors
            {
                System.out.println("Scissors cut Paper. Player B wins!");
            }
        }

        else // Player A is Scissors
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors. Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper. Player A wins!");
            }
            else // Player B must be Scissors
            {
                System.out.println("Scissors vs Scissors. It's a TIE!");
            }
        }

    }
}
