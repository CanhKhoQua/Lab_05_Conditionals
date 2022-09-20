public class RPSSelector {
    // First example has to be R P or S
    public static void main(String[] args)
    {
        String playerMove = "R"; /// must be R, P or S

        if (playerMove.toUpperCase() == "R")
        {
            System.out.println("Rock!");
        }
        else if (playerMove.toUpperCase() == "P")
        {
            System.out.println("Paper!");
        }
        else
        {
            System.out.println("Scissors!");
        }

    }
}
