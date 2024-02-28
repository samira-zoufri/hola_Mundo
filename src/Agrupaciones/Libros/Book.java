package Agrupaciones.Libros;

public class Book {
    private String name;
    private String isbn;
    private Author[] autores;
    private double price;
    int qty;


    public Book(String name,String isbn, Author[] autores, double price){
        this.price = price;
        this.name = name;
        this.isbn = isbn;
        this.autores = autores;
        this.qty = 0;
    }
    public Book(String name, String isbn, Author[] autores, double price, int qty){
        this.price = price;
        this.name = name;
        this.isbn=isbn;
        this.autores = autores;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAutores() {
        return autores;
    }

    public String getAuthorNames(){
    System.out.println(autores.toString());
    return  autores.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
