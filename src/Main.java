import Agrupaciones.Libros.Author;
import Agrupaciones.Libros.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Author TTT = new Author("TTT", "TTT@TTT.t", "M");

        Author AAA = new Author("AAA", "AAA@AAA.a", "F");
        Author[] asd = new Author[2];
        Author[] asd2 = new Author[2];
        asd[0] = TTT;
        asd2[0] = TTT;
        asd2[1] = AAA;

        Book libro1 = new Book("LibroAccion","12", asd,120,200);
        Book libro2 = new Book("LibroAmor","23", asd2,140,100);


    }
}