public class Ball {
    int radio;
    float vx;
    float vy;
    float x;
    float y;

    public Ball() {
        this.radio = 3;
        this.vx = 1;
        this.vy = 1;
        this.x=2;
        this.y=2;
    }
    public Ball(int radio, float vx, float vy,float x,float y) {
        this.radio = radio;
        this.vx = vx;
        this.vy = vy;
        this.x=x;
        this.y=y;
    }

    public float getVx() {
        return vx;
    }

    public float getVy() {
        return vy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public void setX(float x) {
        this.x = x;
    }
    // #

    public void setY(float y) {
        this.y = y;
    }
    public void move(){
        setX(this.x+getVx());
        setY(this.y+getVy());
    }
    public void hflip(){
        setVy(-getVy());

    }
    public void vflip(){
        setVx(-getVx());
    }



//###
// #
}
