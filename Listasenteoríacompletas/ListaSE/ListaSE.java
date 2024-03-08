package ListaSE;

public class ListaSE<tipo> {
    private ElementoSE<tipo> primero;

    public ListaSE() {
        this.primero = null;
    }

    public boolean isVacia() {
        return this.primero == null;
    }

    public void add(tipo dato) {
        //El orden no está definido, pero en caso de hacerlo habría que recorrerla al revés, si metes "1" y luego "2" el primer elemento por el orden natural será el "2".
        ElementoSE<tipo> elem = new ElementoSE<tipo>(dato);
        if (!isVacia())
            elem.setSiguiente(this.primero);
        this.primero = elem;

    }

    public int numElementos() {
        if (isVacia())
            return 0;
        return 1 + contarSiguiente(this.primero);

    }

    private int contarSiguiente(ElementoSE<tipo> elem) {
        if (elem.getSiguiente() == null) return 0;

        return 1 + contarSiguiente(elem.getSiguiente());
    }

    public void eliminar(int pos) {
        if (pos < numElementos()) {
            ElementoSE<tipo> elem = this.primero;
            for (int i = pos; i < pos; i++) {
                elem = elem.getSiguiente();
            }
            elem.setSiguiente(elem.getSiguiente().getSiguiente());
        }
    }

    public void imprimirLista() {
        if (this.primero == null) System.out.println("[]");
        ElementoSE<tipo> elem = this.primero;
        do {
            System.out.print(elem.getData()+", ");
            elem = elem.getSiguiente();
        } while (elem != null);


    }
    public tipo getElemento(int pos){
        ElementoSE<tipo> elem = this.primero;
        for (int i = 0;i< pos ;i++)
            elem= elem.getSiguiente();
        return elem.getData();
    }

    @Override
    public String toString() {
        String print = "";
        if (this.primero == null) return "[]";
        ElementoSE<tipo> elem = this.primero;
        do {

            print += (elem.getData()+", ");
            elem = elem.getSiguiente();
        } while (elem != null);

    return print;
    }
}
