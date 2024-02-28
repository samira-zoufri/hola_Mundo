package Agrupaciones.Libros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author autor1 = new Author("Nombre", "Email", "G");

    @Test
    void getName() {
        autor1.getName();
    }

    @Test
    void getGender() {
        autor1.getGender();
    }

    @Test
    void getEmail() {
        autor1.getEmail();
    }

    @Test
    void setEmail() {
        autor1.setEmail("Email123");
    }

    @Test
    void testToString() {
        System.out.println(autor1);
    }


}