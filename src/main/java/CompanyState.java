public class CompanyState {
	private static CompanyState instance = new CompanyState();
		private int employeesAtWork;
	private CompanyState(){
		this.employeesAtWork=0;
	}
	public static CompanyState getInstance(){
		return instance;
	}

	public void setEmployeesAtWork(int employeesAtWork) {
		this.employeesAtWork = employeesAtWork;

	}

	public int getEmployeesAtWork() {
		return employeesAtWork;
	}
}
