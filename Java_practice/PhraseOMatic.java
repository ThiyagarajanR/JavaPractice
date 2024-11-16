public class PhraseOMatic {
    public static void main(String[] args)
    {
        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky",
        "value-added", "oriented", "centric", "distributed",
        "clustered", "branded","outside-the-box", "positioned",
        "networked", "focused", "leveraged", "aligned",
        "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
        "strategy", "mindshare", "portal", "space", "vision",
        "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Getting the random numbers

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        String theValues = rand1+" "+rand2+" "+rand3;

        System.out.println(phrase);
        System.out.println(theValues);
    }
}
