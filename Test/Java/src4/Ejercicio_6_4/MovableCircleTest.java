package src4.Ejercicio_6_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovableCircleTest {


    Ejercicio_6_4.MovableCircle c1 = new Ejercicio_6_4.MovableCircle(0, 0, 2, 3,12);


    @Test
    void testMoveUp() {
        c1.moveUp();
    }

    @Test
    void testMoveDown() {
        c1.moveDown();
    }

    @Test
    void testMoveLeft() {
        c1.moveLeft();
    }

    @Test
    void testMoveRight() {
        c1.moveRight();
    }
}
