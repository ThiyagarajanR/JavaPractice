package Student;

public class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails()
    {
        System.out.println("Student Name :"+name);
        System.out.println("Student Roll Number :"+rollNumber);
        System.out.println("Student marks :"+marks);

        if(CheckPass())
        {
            System.out.println("Student "+name+" has passed the exam");
        }
        else{
            System.out.println("Student "+name+" has failed the exam");
        }
    }

    public boolean CheckPass()
    {
        if(marks >= 50)
        {
            return true;
        }

        return false;
    }

}
