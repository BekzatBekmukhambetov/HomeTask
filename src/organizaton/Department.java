package organizaton;

public class Department {
    private String first_name ;
    private Employee [] employees;

    public Department(String first_name ) {
        this.first_name = first_name ;
        this.employees = new Employee[0];
    }

    public Department(Employee[]employees){
        this.employees = employees;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
