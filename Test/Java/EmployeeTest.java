import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee empleado = new Employee(12,"Nombre", "Apellido",1200);

    @Test
    void getId() {
        empleado.getId();
    }

    @Test
    void getFirstName() {
        empleado.getFirstName();
    }

    @Test
    void getSalary() {
    }

    @Test
    void getAnualSalary() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setSalary() {
    }

    @Test
    void raiseSalary() {
    }

    @Test
    void testToString() {
    }
}