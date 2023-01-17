public class Main {
    public static void main(String[] args) {
        Programmer marioTheProgrammer = new Programmer("Mario", 2);
        Programmer ginoTheProgrammer = new Programmer("Gino", 5);

        ProjectManager francoTheManager = new ProjectManager("Franco", 10);

        marioTheProgrammer.work();
        ginoTheProgrammer.work();
        francoTheManager.work();
    }
}
