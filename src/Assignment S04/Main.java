public class Main {
    public static void main(String[] args) {


        Circle c1 = new Circle();
        Circle c2 = new Circle(3, "Azul");
        System.out.println(c2.getArea());
        System.out.println(c1.getRadio());
        c1.setRadio(10);
        System.out.println(c1.toString());
        System.out.println("cls");
        Ball bola = new Ball(1,1,1,2,2);
        Caja caja = new Caja(30,20);
        caja.imprimir();
        System.out.println("\n\n\n");
        caja.imprimirBola(bola);



        while (true) {
            System.out.println("\n\n\n\n\n");
            caja.imprimirBola(bola);
            if (bola.getX() <= 1 || bola.getX() >= caja.getDx() ) {
                bola.vflip();
            }
            if (bola.getY() < 1 || bola.getY() >= caja.getDy() - 1) {
                bola.hflip();
            }
            bola.move();
            try {
                Thread.sleep(550);

            } catch (InterruptedException a ){System.out.println("xd");
            }
        }
        }
    }

