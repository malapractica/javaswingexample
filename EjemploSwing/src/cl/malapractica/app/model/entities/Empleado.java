package cl.malapractica.app.model.entities;

/**
 *
 * @author jazocar
 */
public class Empleado {
    
    private String rut;
    private String comuna;
    private String capacitacion;
    private String tipoContrato;

    public Empleado() {
    }

    public Empleado(String rut, String comuna, String capacitacion, String tipoContrato) {
        this.rut = rut;
        this.comuna = comuna;
        this.capacitacion = capacitacion;
        this.tipoContrato = tipoContrato;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", comuna=" + comuna + ", capacitacion=" + capacitacion + ", tipoContrato=" + tipoContrato + '}';
    }

    
}
