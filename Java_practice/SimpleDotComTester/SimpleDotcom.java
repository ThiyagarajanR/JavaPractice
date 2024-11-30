package SimpleDotComTester;

import java.util.Scanner;

public class SimpleDotcom {
    public static void main(String[] args)
    {
        SimpleDotComTester tester = new SimpleDotComTester();

        int[] locations = { 3,4,5};

        tester.SetLocationCells(locations);

        Scanner scan  = new Scanner(System.in);

        String result = "miss";

        int numberOfGuess=0;

        while(result != "kill")
        {
            String userGuess = scan.nextLine();
            numberOfGuess++;
            result = tester.CheckYourSelf(userGuess);
        }
        scan.close();
        
        System.out.println("You have made "+numberOfGuess);
       
        
    }
}
