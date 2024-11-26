package ClassObjectPractice;

public class DogClass {
    int size;
    String name;

    void bark()
    {
        if(size > 60)
        {
            System.out.println("Wooof! Wooof!");
        }
        else if(size > 15)
        {
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println("Yip! Yip!");
        }
    }
}
