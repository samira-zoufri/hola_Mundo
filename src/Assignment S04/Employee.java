public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(String id, String firstName, String lastName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnualSalary(){
        return 12*getSalary();
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int raiseSalary(int percent){
        setSalary(getSalary()+percent*getSalary()/100);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
