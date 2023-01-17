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
        if(isAtWork) {
            return;
        }
        CompanyState state = CompanyState.getInstance();
        state.setEmployeesAtWork(state.getEmployeesAtWork() + 1);
        this.isAtWork = true;
    }

    public void goHome() {
        if(!isAtWork) {
            return;
        }
        CompanyState state = CompanyState.getInstance();
        state.setEmployeesAtWork(state.getEmployeesAtWork() - 1);

        this.isAtWork = false;
    }

    public abstract void work() throws Exception;
}
