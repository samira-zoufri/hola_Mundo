package src4.Ejercicio_6_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    Ejercicio_6_4.MovablePoint point = new Ejercicio_6_4.MovablePoint(0, 0, 2, 3);
    @Test
    void testMoveUp() {

        point.moveUp();
        assertEquals(3, point.y);
    }

    @Test
    void testMoveDown() {

        point.moveDown();
        assertEquals(-3, point.y);
    }

    @Test
    void testMoveLeft() {

        point.moveLeft();
        assertEquals(-2, point.x);
    }

    @Test
    void testMoveRight() {

        point.moveRight();
        assertEquals(2, point.x);
    }

    @Test
    void testToString() {
        point.toString();
    }
}