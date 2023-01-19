package Factory;

import java.util.Objects;

public class PrecioFactory {
    Precio precio;
    private PrecioFactory(){};
//  pais == España -> PrecioEUR;
//  pais != España -> PrecioDOLAR;
    public PrecioFactory(String pais){
        if (Objects.equals(pais, "España")){
            System.out.println("España precio en EUR  " );
            precio = new PrecioEUR();

        }else if (Objects.equals(pais, "UK")){
            System.out.println("estamos en UK");
            precio = new PrecioGBP();
        }
        else {
            System.out.println("precio en DOLAR");
            precio = new PrecioDOLAR();
        }

    }
    public double getPrecio(){
        return precio.getPrecio();
    }
}
