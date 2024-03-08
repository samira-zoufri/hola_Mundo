package ListaS;

public class ElementoLS<tipo>{
    private tipo data;

    public ElementoLS() {
        this.data = null;
    }

    public ElementoLS(tipo data) {
        this.data = data;
    }


    public tipo getData() {
        return this.data;
    }


    public void setData(tipo data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ListaS.ElementoLS{" +
                "data=" + data +
                '}';
    }
}
