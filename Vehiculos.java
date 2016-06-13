
/**
 * Write a description of class Vehiculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculos
{
    // instance variables - replace the example below with your own
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private int identificativo;

    /**
     * Constructor for objects of class Vehiculos
     */
    public Vehiculos(Marca ma, int an, int kilo, int ide)
    {
        // initialise instance variables
        marca = ma;
        antiguedad = an;
        kilometraje = kilo;
        identificativo = ide;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Marca getMarca()
    {
        // put your code here
        return marca;
    }
    
     public int getAntiguedad()
    {
        // put your code here
        return antiguedad;
    }
      public int getKilometraje()
    {
        // put your code here
        return kilometraje;
    }
     public int getIdentificativo()
    {
        // put your code here
        return identificativo;
    }
   
    public abstract boolean seguridad();
}
