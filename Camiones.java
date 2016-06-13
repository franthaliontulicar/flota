
/**
 * Write a description of class Camiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camiones extends VehiculosPeso
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Camiones
     */
    public Camiones(Marca ma, int an, int kilo, int ide, int pes)
    {
        // initialise instance variables
        super(ma, an, kilo, ide, pes);
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPeso(int y)
    {
        // put your code here
        return super.getPeso();
    }
    public boolean articulado(){
        boolean articula = false;
        if(getMarca()==Marca.FORD || getMarca()==Marca.FIAT){
             articula= true;
        }
        return articula;
    }
    
    public boolean seguridad(){
        boolean seguro = false;
        if(articulado() == true && getPeso()< 3000 || articulado() == false && getPeso() < 2000 ){
            seguro = true;
        }
        
        return seguro;
    }
}
