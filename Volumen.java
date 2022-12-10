package uia.com.inventarios;

import java.util.Objects;

public class Volumen {
    private int largo;
    private int alto;
    private int ancho;


    public Volumen() {
    }

    public Volumen(int largo, int alto, int ancho) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Volumen{" +
                "largo=" + largo +
                ", alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volumen volumen = (Volumen) o;
        return Objects.equals(largo, volumen.largo) && Objects.equals(alto, volumen.alto) && Objects.equals(ancho, volumen.ancho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(largo, alto, ancho);
    }
}