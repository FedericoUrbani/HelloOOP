public abstract class Employee {
    protected String name;
    protected int yearsOfExperience;

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void work();
}
