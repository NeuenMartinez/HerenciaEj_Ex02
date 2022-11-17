package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class EdificioDeOficinas extends Edificio {

    public int numOfic;
    public int personasXofic;
    public int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOfic, int personasXofic, int cantPisos) {
        this.numOfic = numOfic;
        this.personasXofic = personasXofic;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(int numOfic, int personasXofic, int cantPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOfic = numOfic;
        this.personasXofic = personasXofic;
        this.cantPisos = cantPisos;
    }

    public int getNumOfic() {
        return numOfic;
    }

    public void setNumOfic(int numOfic) {
        this.numOfic = numOfic;
    }

    public int getPersonasXofic() {
        return personasXofic;
    }

    public void setPersonasXofic(int personasXofic) {
        this.personasXofic = personasXofic;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La supeficie del edificio es: " + (ancho * largo) + " mt2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: " + (ancho * largo * alto) + " mt3");
        cantPersonas();
    }

    public void cantPersonas() {
        System.out.println("La cantidad de personas que entran por piso es de: " + (personasXofic * numOfic));
        System.out.println("La cantidad de personas que entran en todo el edificio es de: " + (personasXofic * numOfic * cantPisos));
    }

}
