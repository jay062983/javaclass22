package overloadclass;

public class Employee {
    String name;
    static int baseSalary=30000;
    static int baseHolidays=10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }

}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+20000);
    }
}
class Developer extends Employee{
    void printSalary(){
        System.out.println((baseSalary*5)+30000);
        }
        void printHolidays(){
            System.out.println(baseHolidays+5);
        }
        }