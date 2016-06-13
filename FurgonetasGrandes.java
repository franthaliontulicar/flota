
/**
 * Write a description of class FurgonetasGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetasGrandes extends Vehiculos
{
    // instance variables - replace the example below with your own
    private int peso;
    private boolean seguro;
    /**
     * Constructor for objects of class FurgonetasGrandes
     */
    public FurgonetasGrandes(Marca ma, int an, int kilo, int ide, int pes, boolean segu)
    {
        // initialise instance variables
        super(ma, an, kilo, ide);
        peso = pes;
        seguro = segu;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPeso()
    {
        // put your code here
        return peso;
    }
    
    public boolean seguridad(){
        return seguro;
    }
}
