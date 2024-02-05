
public class Lista {
    int NumElementos;
    int Max;
    Object[] list;

    public Lista(int Max) {
        //Constructor inicializa la lista con 0 elementos
        this.NumElementos = 0;
        this.list = new Object[Max];
        this.Max = Max;

    }

    public void add(Object Elem) {
        if (this.NumElementos < this.Max){
            list[NumElementos] = Elem;
            this.NumElementos++;
        } else {System.out.println("Lista llena");}

    }

    public int getNumElementos() {
        return NumElementos;
    }

    public int buscar(Object Elem) {
        for (int i = 0; i < this.NumElementos; i++) {
            if (list[i].equals(Elem)) {
                return i;
            }
        }
        return -1;
    }

    public Object recuperar(int posicion) {
        if (posicion >= 0 && posicion < this.Max) {
            return list[posicion];
        } else {
            return null;
        }
    }

    public void imprimirLista() {
        System.out.print("[");
        for (int i = 0; i < this.NumElementos; i++) {
            System.out.print(list[i]);
            if (i + 1 != this.NumElementos) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public void eliminar(int pos) {
        this.NumElementos--;
        list[pos] = list[this.NumElementos];
        list[this.NumElementos] = null;

    }

    public void vaciar() {
        for (int i = this.NumElementos; i > 0; i--) {
            eliminar(i);
        }
    }

}