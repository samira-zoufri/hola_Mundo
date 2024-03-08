package ListaS;

import java.util.Arrays;

public class Lista<tipo> {
    int NumElementos;
    int Max;
    ElementoLS<tipo>[] list;

    public Lista(int Max) {
        //Constructor inicializa la lista con 0 elementos
        //this.NumElementos = 0;
        this.list = new ElementoLS[Max];
        this.Max = Max;

    }

    public int numElementos() {
        int i = 0;
        int numElementos = 0;
        while (list[i] != null) {
            numElementos += 1;
            i++;
        }
        return numElementos;
    }

    public void add(tipo elem) {
        if (numElementos() < this.Max) {
            ElementoLS<tipo> e = new ElementoLS<tipo>(elem);
            list[numElementos()] = e;
            //this.NumElementos++;
        } else {
            System.out.println("ListaS.ListaS.Lista llena");
        }

    }

    //public int getNumElementos() {
    //     return NumElementos;
    //}

    public int buscar(tipo Elem) {
        for (int i = 0; i < numElementos(); i++) {
            if (list[i].getData().equals(Elem)) {
                return i;
            }
        }
        return -1;
    }

    public tipo recuperar(int posicion) {
        if (posicion >= 0 && posicion < this.Max) {
            return list[posicion].getData();
        } else {
            return null;
        }
    }

    public void imprimirLista() {
        System.out.print("[");
        for (int i = 0; i < numElementos(); i++) {
            System.out.print(list[i].getData());
            if (i + 1 != numElementos()) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public void eliminar(int pos) {
        //this.NumElementos--;
/*
        list[pos] = list[this.NumElementos];
        list[this.NumElementos] = null;
*/   //Faltaría verificar que la posición sea correcta (No sea mayor que el numero de elementos ya que en ese caso borra el ultimo
      /*  do{
            list[pos]  = list[pos+1];
            pos++;
        } while (list[pos]!=null);

    */
        while (list[pos] != null) {
            list[pos] = list[pos + 1];
            pos += 1;
        }
    }

    public void vaciar() {
        for (int i = numElementos(); i > 0; i--) {
            eliminar(i);
        }
    }

    @Override
    public String toString() {
        return "ListaS.Lista{" +
                "Max=" + Max +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}








