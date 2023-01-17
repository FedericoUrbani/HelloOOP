public abstract class Employee {
    protected String name;
    protected int yearsOfExperience;

    protected boolean isAtWork;

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.isAtWork = false;
    }

    public void goToWork() {
        this.isAtWork = true;
    }

    public void goHome() {
        this.isAtWork = false;
    }

    public abstract void work();
}
