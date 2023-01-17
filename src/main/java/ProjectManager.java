public class ProjectManager extends Employee {
    public ProjectManager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public void work() {
        System.out.printf("I am Mr. %s, I am earning money\n", this.name);
    }
}
