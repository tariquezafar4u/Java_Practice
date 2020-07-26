package practice;


public class Estmarea {

    public  double len;
    public double bret;
    public double area;

    public float getarea() {
        return (float) (len*bret);
    }

     public Estmarea()
    {
        len = 5;
        bret = 5;
    }

    public Estmarea(double len, double bret)

    {
        this.len = len;
        this.bret = bret;
    }
}
