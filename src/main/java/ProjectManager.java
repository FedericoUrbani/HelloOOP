public class ProjectManager extends Employee {
    public ProjectManager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public void work() {
        System.out.println("I am Mr. " + this.name + ", I am earning money");
    }
}
