package uia.com.inventarios;

import java.util.Objects;

public class CondicionesAlmacenamiento {
    private String tipo;
    private String temperatura;

    private String humedad;

    public CondicionesAlmacenamiento() {
    }

    public CondicionesAlmacenamiento(String tipo, String temperatura, String humedad) {
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    @Override
    public String toString() {
        return "Condiciones{" +
                "tipo='" + tipo + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", humedad='" + humedad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CondicionesAlmacenamiento that = (CondicionesAlmacenamiento) o;
        return Objects.equals(tipo, that.tipo) && Objects.equals(temperatura, that.temperatura) && Objects.equals(humedad, that.humedad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, temperatura, humedad);
    }
}
