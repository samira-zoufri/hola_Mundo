public class Caja {
    int dx;
    int dy;
    String bases="";
    String centro="";

    public Caja(int dx, int dy){
        this.dx = dx;
        this.dy = dy;

        for (int i = 0;i <dx;i++){
            this.bases +="--";
        }
        this.bases = "|"+this.bases+"|";
        for (int i = 0;i <dx;i++){
            this.centro = this.centro+"  ";
        }
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void imprimir(){
        System.out.println(bases);
        for(int i =0;i<dy;i++){
            System.out.println("|"+centro+"|");
        }
        System.out.println(bases);
    }

    public void imprimirBola(Ball bola){
        System.out.println(bases);
        for(int i =0;i<dy;i++){
            if (bola.getY() != i){
            System.out.println("|"+centro+"|");
        } else { System.out.print("|");
               for (int j = 1 ;j<bola.getX();j++){
                   System.out.print("  ");
                }
               System.out.print("@");
                for (int j= (int)bola.getX() ;j<this.dx; j++){
                    System.out.print("  ");
                }
                System.out.println(" |");

            }

    }
        System.out.println(bases);
    }
}











