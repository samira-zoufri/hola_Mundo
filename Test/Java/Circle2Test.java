import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @org.junit.jupiter.api.Test
    void getRadius() {

        // Quiero probar si me d evuelve el radio adecuado
        Circle2 c = new Circle2(3d);

        //
        assertEquals(3d,c.getRadius(),"El radio devuelto no es adecuado");
    }

    @org.junit.jupiter.api.Test
    void getArea() {
    }
}