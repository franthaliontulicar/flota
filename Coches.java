
/**
 * Write a description of class Coches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coches extends  VehiculosAsientos
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class Coches
     */
    public Coches(Marca ma, int an, int kilo, int ide, int asientos)
    {
        // initialise instance variables
        super(ma, an, kilo,  ide, asientos);
      
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int plazas (){
        return super.plazas();
    }
    
    public int pasarITV(){
        int años = 1;
            if(getMarca()== Marca.FORD){
                años = 2;
            }
    
        return años;
    }
    public boolean seguridad()
    {
        boolean seguridad = false;
            if(plazas() <= 5){
                seguridad = true;
            }
        
        return seguridad;
    }
}
