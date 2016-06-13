
/**
 * Write a description of interface Asientos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosAsientos extends Vehiculos
{
   private int numeroAsientos;
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public VehiculosAsientos(Marca ma, int an, int kilo, int ide, int asientos){
        super(ma,an,kilo,ide);
        numeroAsientos = asientos;
        
    }
    public  int plazas(){
        return numeroAsientos;
    }
}
