/*
 * @author NeuenMartinez
 */
package HerenciaEj_Ex02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;


public class HerenciaEj_Ex02 {

    public static void main(String[] args) {


        ArrayList<Edificio> ListaEdificios = new ArrayList<>();
        ListaEdificios.add(new Polideportivo("Polideportivo Publico n°1", Boolean.TRUE, 50d, 50d, 100d));
        ListaEdificios.add(new Polideportivo("Polideportivo Publico n°2", Boolean.FALSE, 30d, 30d, 60d));
        ListaEdificios.add(new EdificioDeOficinas(5, 10, 10, 30d, 50d, 40d));
        ListaEdificios.add(new EdificioDeOficinas(10, 15, 15, 40d, 70d, 60d));
        
        for (Edificio aux : ListaEdificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }
        
        
    }

}