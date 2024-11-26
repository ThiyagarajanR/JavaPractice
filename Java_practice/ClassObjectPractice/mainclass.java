package ClassObjectPractice;

public class mainclass {
    public static void main(String[] args)
    {
        DogClass dog1 = new DogClass();
        dog1.size = 70;
        DogClass dog2 = new DogClass();
        dog2.size = 45;
        DogClass dog3 = new DogClass();
        dog3.size = 666;

        dog1.bark();
        dog2.bark();
        dog3.bark();
    }
}
