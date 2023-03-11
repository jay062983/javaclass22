package overloadclass;

public class Employeetester {

    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.printSalary();
        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.printSalary();
    }

    public static void main() {
        Manager manager=new Manager();
        manager.printSalary();
        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.printSalary();
    }
}