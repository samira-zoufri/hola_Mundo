package Agrupaciones.Libros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void getQty() {
    }

    @Test
    void setQty() {
    }

    @Test
    void getAutores() {
    }

    @Test
    void getAuthorNames() {
    }

    @Test
    void testToString() {
    }
    public class TestMain {
        public static void main(String[] args) {
            // Test Author class


            Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", "M");
            System.out.println(a1);
            a1.setEmail("ahteck@somewhere.com");
            System.out.println(a1);
            System.out.println("name is: " + a1.getName());
            System.out.println("email is: " + a1.getEmail());
            // Test Book class
            Author[] autor = new Author[1];
            autor[0]= a1;
            Book b1 = new Book("12345", "Java for dummies", autor, 8.8, 88);
            Book b2= new Book("12345", "Java for dummies", autor, 8.8)
                    ;
            System.out.println(b1);
            b1.setPrice(9.9);
            b1.setQty(99);
            b1.setName("Java");
            System.out.println(b1);
            System.out.println("isbn is: " + b1.getIsbn());
            System.out.println("name is: " + b1.getName());
            System.out.println("price is: " + b1.getPrice());
            System.out.println("qty is: " + b1.getQty());
            System.out.println("author is: " + b1.getAutores());
            System.out.println(b1.getAuthorNames());}
    }

}