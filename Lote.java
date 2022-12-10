package uia.com.inventarios;

import java.util.Objects;

public class Lote extends InfoUIA{

    private String fechaIngreso = "";
    private Proveedor proveedor = new Proveedor();

    private Embalaje embalaje=new Embalaje();

    private CondicionesAlmacenamiento condiciones = new CondicionesAlmacenamiento();
    public Lote() {
        super();
    }
    public Lote(String idLote, String descLote, String cantidad, String fechaIngreso, String idProv, String descProv)
    {
        super("Lote", idLote, descLote, cantidad, "Ingresado");
        this.fechaIngreso = fechaIngreso;
        proveedor.setName(descLote);
        proveedor.setId(idProv);
    }
    public Lote(String idLote, String descLote, String cantidad, String fechaIngreso, String idProv, String descProv,Embalaje embalaje, CondicionesAlmacenamiento condiciones)
    {
        super("Lote", idLote, descLote, cantidad, "Ingresado");
        this.fechaIngreso = fechaIngreso;
        proveedor.setName(descLote);
        proveedor.setId(idProv);
        this.embalaje = embalaje;
        this.condiciones = condiciones;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Embalaje getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(Embalaje embalaje) {
        this.embalaje = embalaje;
    }

    public CondicionesAlmacenamiento getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(CondicionesAlmacenamiento condiciones) {
        this.condiciones = condiciones;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", proveedor=" + proveedor +
                ", embalaje=" + embalaje +
                ", condiciones=" + condiciones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lote lote = (Lote) o;
        return Objects.equals(fechaIngreso, lote.fechaIngreso) && Objects.equals(proveedor, lote.proveedor) && Objects.equals(embalaje, lote.embalaje) && Objects.equals(condiciones, lote.condiciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaIngreso, proveedor, embalaje, condiciones);
    }
}