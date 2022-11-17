package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Polideportivo extends Edificio {

    public String nombre;
    public Boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techo) {
        this.nombre = nombre;
        this.techo = techo;
    }

    public Polideportivo(String nombre, Boolean techo, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTecho() {
        return techo;
    }

    public void setTecho(Boolean techo) {
        this.techo = techo;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La supeficie del Polideportivo es: " + (ancho * largo) + " mt2");
    }

    @Override
    public void calcularVolumen() {

        System.out.println("El volumen del Polideportivo es: " + (largo * ancho * alto) + " mt3");
        if (techo == false) {
            System.out.println("El polideportivo no tiene techo");
        } else {
            System.out.println("El polideportivo tiene techo");
        }
    }

}
