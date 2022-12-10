package uia.com.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Principal {

    public Principal() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hola UIA, Realizando Examen 2DA VUELTA, Entrega de Material");


        //funcionalidad transitoria para construcción del reporte de nivel de inventario
        NivelInventario inventario = new NivelInventario();

        Lote lote1 = new Lote("1000","Lote 1", "7","10-10-2020","700","Acme 1");
        Lote lote2 = new Lote("2000","Lote 2", "8","10-10-2020","701","Acme 2");
        Lote lote3 = new Lote("3000","Lote 3", "9","10-10-2020","703","Acme 3");
        Lote lote4 = new Lote("4000","Lote 4", "10","10-10-2020","704","Acme 4");
        Lote lote5 = new Lote("5000","Lote 5", "7","10-10-2020","705","Acme 5");
        Lote lote6 = new Lote("6000","Lote 6", "8","10-10-2020","706","Acme 6");
        Lote lote7 = new Lote("2000","Lote 7","9", "10-11-2021","800","Patito 1");
        Lote lote8 = new Lote("8000","Lote 8","10", "10-11-2021","801","Patito 2");
        Lote lote9 = new Lote("9000","Lote 9","7", "10-11-2021","803","Patito 3");
        Lote lote10 = new Lote("10000","Lote 10","8", "10-11-2021","804","Patito 4");
        Lote lote11 = new Lote("11000","Lote 11","9", "10-11-2021","805","Patito 5");
        /* ---------------    Ivan Martinez Examen -------  */
        NivelInventario nivelInventario = new NivelInventario();
        Volumen volumen1 = new Volumen(1,1,1);
        Volumen volumen2 = new Volumen(3,3,3);
        Volumen volumen3 = new Volumen(2,2,2);
        CondicionesAlmacenamiento condicionesAlmacenamiento = new CondicionesAlmacenamiento("Seco", "25 grados", "menor al 30%");
        Embalaje embalajeTipoPlatico = new Embalaje("Platico", "Embalaje", "Embalaje1", 1, "Ingresando",volumen1);
        Embalaje embalajeTipoMadera = new Embalaje("Madera", "Embalaje", "Embalaje2",2, "Ingresando", volumen2);
        Embalaje embalajeTipoCarton = new Embalaje("Carton", "Embalaje", "Embalaje3", 3,"Ingresando", volumen3);
        Lote lote12 = new Lote("11110","Lote 13", "10","09-12-2022","806","patito6",embalajeTipoPlatico,condicionesAlmacenamiento);
        Lote lote13 = new Lote("11110","Lote 13", "10","09-12-2022","806","patito6",embalajeTipoMadera,condicionesAlmacenamiento);
        Lote lote14 = new Lote("11110","Lote 13", "10","09-12-2022","806","patito6",embalajeTipoCarton,condicionesAlmacenamiento);

        inventario.agrega("100","Material Oficina", "110","Sillas","111","Silla ejecutiva clase 1", lote1, 5);
        inventario.agrega("100","Material Oficina","110","Sillas","112","Silla ejecutiva clase 2", lote2,5);
        inventario.agrega("100","Material Oficina","110","Sillas","113","Silla secretarial clase 1", lote3,5);
        inventario.agrega("100","Material Oficina","110","Sillas","114","Silla secretarial clase 2", lote4,5);
        inventario.agrega("100","Material Oficina","110","Sillas","115","Silla de espera ", lote5,5);
        inventario.agrega("100","Material Oficina","120","Mesas","121","Mesa ejecutivo clase 1", lote6,5);
        inventario.agrega("100","Material Oficina", "130","Escritorios","131","Escritorio ejecutiva clase 1", lote7,5);
        inventario.agrega("100","Material Oficina","130","Escritorios","132","Escritorio ejecutiva clase 2", lote8,5);
        inventario.agrega("100","Material Oficina","130","Escritorios","133","Escritorio secretarial clase 1", lote9,5);
        inventario.agrega("100","Material Oficina","130","Escritorios","134","Escritorio secretarial clase 2", lote10,5);
        inventario.agrega("100","Material Oficina","130","Escritorios","135","Escritorio de espera ", lote11,5);
        nivelInventario.agrega("200", "Plastico", "140","Material de Plastico","136","Plastico",lote12,8);
        nivelInventario.agrega("200", "Madera", "150","Material de madera","137","Madera",lote13,4);
        nivelInventario.agrega("200", "Carton", "160","Material de Carton","138","Carton",lote14,5);
        inventario.serializa();
        /* Agregar los nuevos lotes */
        nivelInventario.serializa();


        //funcionalidad transitoria para construcción de la solicitud de Entrega
        GestorEntregaInventario gestorEntrega = new GestorEntregaInventario(new ReporteEntregaInventario());

        SolicitudEntregaMaterial solicitudEntrega = gestorEntrega.agregaSolicitudSalidaMaterial(
                "SolicitudEntregaMaterial",
                "Alfonso ",
                "Profesor TSU");

        solicitudEntrega.agrega("100","Material Oficina", "110","Sillas","111","Silla ejecutiva clase 1", lote1, 2);
        solicitudEntrega.agrega("100","Material Oficina","110","Sillas","113","Silla secretarial clase 1", lote3, 3);
        solicitudEntrega.agrega("100","Material Oficina","110","Sillas","115","Silla de espera ", lote5, 4);
        solicitudEntrega.agrega("100","Material Oficina", "130","Escritorios","131","Escritorio ejecutiva clase 1", lote7, 2);
        solicitudEntrega.agrega("100","Material Oficina","130","Escritorios","133","Escritorio secretarial clase 1", lote9, 3);
        solicitudEntrega.agrega("100","Material Oficina","130","Escritorios","135","Escritorio de espera ", lote11, 4);
        solicitudEntrega.serializa();


        IEntregaInventario inventario2 = null;
        gestorEntrega = new GestorEntregaInventario(inventario2);
        gestorEntrega.cargaSolicitudEntrega("SolicitudEntregaMaterial_1.json");   // Esta es la solicitud o archivo fuente o documento que se quiere agregar o que se usa para actualizar
        gestorEntrega.cargaInventario("ReporteNivelInventario.json");   // Este es documento objetivo.. el que quieren actualizar
        gestorEntrega.cargaSolicitudEntregaToInventario();
        gestorEntrega.serializaNivelInventario("ReporteNivelInventario.json");


        SpringApplication.run(Principal.class, args);
    }
}
