package paquete02;
import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Televisor> televisor = new ArrayList<>();
        televisor.add(new Televisor("Xiaomi gt150",1350.25));
        televisor.add(new Televisor("Samsung op98",800.99));
        televisor.add(new Televisor("LG-dykyX3",500.0));
        System.out.println("-----------------");
        for (Televisor televisore: televisor){
            System.out.println(televisore);
        }
        System.out.printf("Precio Total: %.2f\n", new VentasTvs(televisor).establecerPrecioTotal());
        System.out.println("Precio mas caro: "+ new VentasTvs(televisor).televisorMasCaro());
        System.out.println("-----------------");
    }
}

