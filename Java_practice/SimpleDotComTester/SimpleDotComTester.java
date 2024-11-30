package SimpleDotComTester;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotComTester {
    private int[] locations;

    int numberOfHits = 0;

    List<Integer> alreadyGuessed = new ArrayList<>();

    public void SetLocationCells(int[] locs)
    {
        locations = locs;
    }

    public String CheckYourSelf(String StringGuess)
    {
        int guess = Integer.parseInt(StringGuess);
        String result = "miss";

        for(int loc : locations)
        {
            if(guess == loc)
            {   
                if(!alreadyGuessed.contains(guess))
                {
                    alreadyGuessed.add(guess);
                    numberOfHits++;
                }
                result = "hit";
                break;
            }
        }

        if(numberOfHits == locations.length)
        {
            result = "kill";
        }

        System.out.println(result);

        return result;

    }
}
