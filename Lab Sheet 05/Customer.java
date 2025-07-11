public class Customer 
{
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) 
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public char getGender()
    {
        return this.gender;
    }

    @Override
    public String toString()
    {
        return  this.name + "(" + this.id + ")";
    }
}