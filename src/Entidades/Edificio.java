package Entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public abstract class Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    protected Double ancho;
    protected Double alto;
    protected Double largo;

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

    public Edificio() {
    }

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

}
