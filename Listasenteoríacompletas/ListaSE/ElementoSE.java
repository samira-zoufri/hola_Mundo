package ListaSE;

public class ElementoSE<tipo> {
    private tipo data;
    private ElementoSE<tipo> siguiente;

    public ElementoSE() {
        this.siguiente = null;
        this.data = null;
    }

    public ElementoSE(tipo data) {
        this.siguiente = null;
        this.data = data;
    }

    /*public ListaSE.ElementoSE(Object data, ListaSE.ElementoSE siguiente){
        this.siguiente = data;
        this.data = siguiente;
    }*/

    public tipo getData() {
        return this.data;
    }


    public ElementoSE<tipo> getSiguiente() {
        //Quizás tendría que ser protected para impedir la navegación libre de la lista por un tercero
        return this.siguiente;
    }

    public void setData(tipo data) {
        this.data = data;

    }

    public void setSiguiente(ElementoSE<tipo> siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public String toString() {
        return "ListaSE.ElementoSE{" +
                "data=" + data +
                ", siguiente=" + siguiente +
                '}';
    }
}


