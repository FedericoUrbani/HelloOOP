public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SoftwareEngineer("Marco",3),
                new Manager("Franco", 10),
                new Programmer("Mario", 2),
                new Programmer("Gino", 5),
                new Programmer("Tommaso", 1)
        };

        boolean force = args.length > 0 && args[0].equals("force");
        if(force)
            forceCompanyAtWork(employees);
        else
            companyAtWork(employees);
    }

    public static void companyAtWork(Employee[] employees) {
        for(Employee employee : employees) {
            employee.goToWork();
            try {
                employee.work();
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
            employee.goHome();
        }
    }

    public static void forceCompanyAtWork(Employee[] employees) {
        for(Employee employee : employees) {
            try {
                employee.work();
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
