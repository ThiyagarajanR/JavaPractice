package Student;

public class Students {
    public static void main(String args[])
    {

        int x = 0;

        Student stud;

        while(x < 3)
        {
            if(x == 0)
            {
                stud = new Student("Thiyaga", 55, 67.66);
                stud.displayDetails();
            
            }
            else if(x == 1)
            {
                stud = new Student("Rajan", 67, 45.6);
                stud.displayDetails();
            
            }
            else if(x == 2)
            {
                stud = new Student("Thiyagarajan", 56, 89.0);
                stud.displayDetails();
            }
            x++;
        }
           


        /*Student s1 = new Student("Thiyaga", 55, 67.66);
        Student s2 = new Student("Rajan", 67, 45.6);
        Student s3 = new Student("Thiyagarajan", 56, 89.0);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();*/
    }
}
