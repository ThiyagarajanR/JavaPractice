package Encapsulation;

public class DogClass {
    private int size = 10;
    private String name;

    public void SetSize(int size)
    {
        if( size > 0 )
        {
            this.size = size;
        }
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public int GetSize()
    {
        return this.size;
    }

    public String GetName()
    {
        return this.name;
    }


}
