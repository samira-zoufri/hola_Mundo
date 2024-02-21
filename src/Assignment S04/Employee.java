public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
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
        int a = getSalary()+percent*getSalary()/100;
        setSalary(a);
        return a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
