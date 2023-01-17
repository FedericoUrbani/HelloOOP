public class CompanyState {
	private static CompanyState instance = new CompanyState();
		private int employeesAtWork;
	private CompanyState(){
		this.employeesAtWork=0;
	}
	public CompanyState getInstance(){
		return instance;
	}
}
