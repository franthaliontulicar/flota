
/**
 * Write a description of interface Peso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract  class  VehiculosPeso extends Vehiculos
{
    private int peso;
    
    public VehiculosPeso(Marca ma, int an, int kilo, int ide, int pes){
        super(ma,  an,  kilo,  ide);
        peso = pes;
    }
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public int getPeso(){
        return peso;
    }
}
