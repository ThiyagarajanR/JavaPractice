import java.util.Scanner;
public class Array {
    public static void main(String args[])
    {
        int[] values;
        int count;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of values to be added");

        count = scan.nextInt();

        values = new int[count];
        count--;
        while(count > -1)
        {
            
            System.out.println("Enter the value");
            values[count] = scan.nextInt();
            count--;
        }
       
        count++;
        scan.close();

        while(count < values.length)
        {
            System.out.println("The value at the position: "+count+" is "+values[count]);
            count++;
        }

    }
}
