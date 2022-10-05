public class Person {
    String name;
    int age;
    Person()
    {
        name="Nobody";
        age=100;
    }
    Person(String n)
    {
        name=n;
        age=50;
    }

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void displayInfo()
        {
            System.out.println((name+", "+age));
        }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
}
