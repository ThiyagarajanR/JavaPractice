package Class_Practice;


public class DogClass
{
    String name;

    public void bark()
    {
        if(name != null)
        {
            System.out.println("My name is "+name);
        }
        else{
            System.out.println("I am not given name, please add a name");
        }
    }
}