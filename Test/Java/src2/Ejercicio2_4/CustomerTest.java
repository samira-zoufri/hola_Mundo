package src2.Ejercicio2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
Ejercicio2_4.Customer c1= new Ejercicio2_4.Customer(18034751,"Nombre1",4);
    @Test
    void getId() {
        c1.getId();
    }

    @Test
    void getName() {
        c1.getName();
    }

    @Test
    void setName() {
        c1.setName("Nombre2");
    }

    @Test
    void getDiscount() {
        c1.getDiscount();
    }

    @Test
    void setDiscount() {
        c1.setDiscount(7);
    }

    @Test
    void testToString() {
        c1.toString();
    }
}