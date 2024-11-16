public class ConditionalStatement {
    public static void main(String[] args)
    {
        int x = 1;

        System.out.println("The loop has started here");

        while( x < 10 )
        {
            if(x % 2 == 0)
            {
                System.out.println("The given number "+x+" is even");
            }
            else
            {
                System.out.println("The given number "+x+" is odd");
            }
            x++;
        }

        System.out.println("The loop ends here");
    }
}
