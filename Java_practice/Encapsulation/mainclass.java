package Encapsulation;

public class mainclass {
    
    public static void main(String args[])
    {
        DogClass dog = new DogClass();
        dog.SetName("Loki");
        dog.SetSize(20);

        System.out.println("Dog name is "+dog.GetName()+" and its size is "+dog.GetSize());

        DogClass dog2 = new DogClass();
        dog2.SetName("DJ");
        dog2.SetSize(-5);

        System.out.println("Dog name is "+dog2.GetName()+" and its size is "+dog2.GetSize());
    }

}
