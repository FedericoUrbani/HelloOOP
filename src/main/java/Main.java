public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Programmer("Mario", 2),
                new Programmer("Gino", 5),
                new Programmer("Tommaso", 1),
                new ProjectManager("Franco", 10)
        };

        companyAtWork(employees);
    }

    private static void companyAtWork(Employee[] employees) {
        for(Employee employee : employees) {
            employee.goToWork();
            employee.work();
            employee.goHome();
        }
    }
}
