package uia.com.inventarios;

import java.util.Objects;

public class Embalaje {
    private String id;
    private String clase;

    private String name;
    private int cantidad;
    private String status;


    private Volumen volumen = new Volumen();


    public Embalaje() {
    }

    public Embalaje(String id, String clase, String name, int cantidad, String status, Volumen volumen) {
        this.id = id;
        this.clase = clase;
        this.name = name;
        this.cantidad = cantidad;
        this.status = status;
        this.volumen = volumen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Volumen getVolumen() {
        return volumen;
    }

    public void setVolumen(Volumen volumen) {
        this.volumen = volumen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Embalaje{" +
                "id='" + id + '\'' +
                ", clase='" + clase + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", volumen=" + volumen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Embalaje embalaje = (Embalaje) o;
        return Objects.equals(id, embalaje.id) && Objects.equals(clase, embalaje.clase) && Objects.equals(name, embalaje.name) && Objects.equals(cantidad, embalaje.cantidad) && Objects.equals(status, embalaje.status) && Objects.equals(volumen, embalaje.volumen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clase, name, cantidad, status, volumen);
    }
}