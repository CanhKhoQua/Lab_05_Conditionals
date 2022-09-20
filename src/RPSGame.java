public class RPSGame
{
    public static void main(String[] args)
    {
        String playerA = "P"; /// must be R, P or S
        String playerB = "P"; /// must be R, P or S

        if (playerA.equalsIgnoreCase("R"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                // PlayerB code crossed against the Player A rock move
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("");
            }
        }

        else if (playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("");
            }
        }

        else // Player A is Scissors
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("");
            }
        }

    }
}
