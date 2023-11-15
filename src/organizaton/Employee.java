package organizaton;

public class Employee {
    private String position;
    private double salary;
    private String name;
    private String surname;


    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
        this.setPosition("engineer");
        this.setSalary(30.000);
    }

    public Employee(String position, double salary, String name, String surname) {
        this.position = position;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Main {
    public static void main(String[] data) {

    }
}











