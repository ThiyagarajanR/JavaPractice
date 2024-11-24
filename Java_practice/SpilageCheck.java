

public class SpilageCheck {
    public static void main(String args[])
    {
        int x ;

        byte value;

        // value = x; is error due spillage. 
        // big cup integer cannot fit into small cup

        value = 66;
         
        x = value;

        System.out.println(x);

        // the above one works because small cup "byte" can work into the big cup integer;
    }
}
