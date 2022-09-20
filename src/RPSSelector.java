public class RPSSelector
{
    // First example has to be R P or S
    public static void main(String[] args)
    {
        String playerMove = "P"; /// must be R, P or S

        // Closed set can only be R P S
        if (playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P"))
        {
            System.out.println("Paper!");
        }
        else
        {
            System.out.println("Scissors!");
        }

        // Open set can be R P S or anything else

        if (playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P"))
        {
            System.out.println("Paper!");
        }
        else if (playerMove.equalsIgnoreCase("S"))
        {
            System.out.println("Scissors!");
        }
        else // Error conditions
        {
            System.out.println("Not a move!");
        }

    }
}
