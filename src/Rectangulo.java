

public class Rectangulo{
        private float lado1;
        private float lado2;

        public Rectangulo(int plado1, int plado2){
            this.lado1 = plado1;
            this.lado2 = plado2;
        }
        public float area(){
            return lado1 * lado2;
        }

        public float perimetro(){
            return 2*lado1 + 2*lado2;
        }
}





