public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ProjectManager("Franco", 10),
                new Programmer("Mario", 2),
                new Programmer("Gino", 5),
                new Programmer("Tommaso", 1)
        };

        forceCompanyAtWork(employees);
    }

    private static void companyAtWork(Employee[] employees) {
        for(Employee employee : employees) {
            employee.goToWork();
            try {
                employee.work();
            } catch(Exception e) {
                System.err.println(e);
            }
            employee.goHome();
        }
    }

    private static void forceCompanyAtWork(Employee[] employees) {
        for(Employee employee : employees) {
            try {
                employee.work();
            } catch(Exception e) {
                System.err.println(e);
            }
        }
    }
}
