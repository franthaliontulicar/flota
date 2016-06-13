import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private ArrayList<Vehiculos> flota;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        // initialise instance variables
        flota = new ArrayList<>();;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addVehiculo(Vehiculos vehiculo)
    {
        // put your code here
        flota.add(vehiculo);
    }

    public void removerVehiculo(int id){
        int index = 0;
        while(index <= flota.size()){
            if(flota.get(index) == flota.get(id)){//o if(flota.get(index).getIdentificativo() == id
                flota.remove(index);
            }
            index++;
        }
    }

    public Marca marcaMayoritaria(){
        Marca mayoritaria = null;
        int index = 0;
        int contFord =0;
        int contFia = 0;
        int contOpel = 0;
        int contCitro = 0;
        while(flota.size() > 0){
            if(flota.get(index).getMarca()== Marca.FORD){
                contFord++;
            }
            if(flota.get(index).getMarca() == Marca.FIAT == true){
                contFia++;
            }
            if(flota.get(index).getMarca() == Marca.OPEL == true){
                contOpel++;
            }
            if(flota.get(index).getMarca() == Marca.CITROEN == true){
                contCitro++;
            }
            if(contFord > contFia){
                do{
                    mayoritaria = Marca.FORD;
                }while(contFia > contOpel && contOpel > contCitro);
            }                  

            else{
                if(contFia > contFord){
                    do{
                        mayoritaria = Marca.FIAT;
                    }while(contFord > contOpel && contOpel > contCitro);
                }   
                else{
                    if(contOpel > contFia){
                        do{
                            mayoritaria = Marca.OPEL;
                        }while(contFia > contFord && contFord > contCitro);
                    }   
                    else{
                        if(contCitro > contFord){
                            do{
                                mayoritaria = Marca.CITROEN;
                            }while(contFord > contFia && contFia > contOpel);
                        }   

                    }
                }
            }
            index++;
        }
        return mayoritaria;
    }

    public boolean cumplenMedidas(){
        boolean cumplen = true;
        int index = 0;
            while (flota.size() > 0){
                if(flota.get(index).seguridad() == true){
                    cumplen = true;
                }
                else{
                    cumplen = false;
                }
                        
            }
        return cumplen;
    }
    
    
    
}

