public class Programmer extends Employee {
    public Programmer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public void work() {
        System.out.printf("I am %s, I am writing code\n", this.name);
    }
}
