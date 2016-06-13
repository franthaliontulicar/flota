
/**
 * Write a description of class FurgonetasPequeñas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetasPequeñas extends Vehiculos
{
    // instance variables - replace the example below with your own
  
    private int numAsientos;
    /**
     * Constructor for objects of class FurgonetasPequeñas
     */
    public FurgonetasPequeñas(Marca ma, int an, int kilo, int ide, int asientos)
    {
        // initialise instance variables
       super(ma, an, kilo,  ide);
       numAsientos = asientos;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int plazas()
    {
        // put your code here
        return numAsientos;
    }
    
    public boolean seguridad(){
         boolean seguridad = false;
            if(plazas() <= 7){
                seguridad = true;
            }
        
        return seguridad;
    
    }
}
