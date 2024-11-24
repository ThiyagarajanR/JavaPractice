package Student;

public class Students {
    public static void main(String args[])
    {
        Student s1 = new Student("Thiyaga", 55, 67.66);
        Student s2 = new Student("Rajan", 67, 45.6);
        Student s3 = new Student("Thiyagarajan", 56, 89.0);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
