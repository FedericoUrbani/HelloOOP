public class ProjectManager extends Employee {
    public ProjectManager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public void work() throws Exception {
        if(this.isAtWork) {
            System.out.printf("I am Mr. %s, I am earning money\n", this.name);
        } else {
            String message = String.format("I am Mr. %s, I am at home and I will not work now\n", this.name);
            throw new Exception(message);
        }
    }
}
