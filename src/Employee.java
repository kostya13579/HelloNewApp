public class Employee extends Person{
    String company;
    public Employee(String name, int age, String company)
    {
        super(name, age);
        this.company=company;
    }

    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Company"+company);
    }

}
