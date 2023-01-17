public class Programmer extends Employee {
    public Programmer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public void work() {
        System.out.println("I am " + this.name + ", I am programming");
    }
}
