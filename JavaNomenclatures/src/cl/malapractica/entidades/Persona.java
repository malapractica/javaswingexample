package cl.malapractica.entidades;


import cl.malapractica.interfaces.InterfacePersona;
import java.util.Date;

/**
 *
 * @author jazocar
 */
public class Persona implements InterfacePersona{

    private String dni;
    private String nombreCompleto;
    private int    edad;
    private Date   fechaNacimiento;
    
    
    
    @Override
    public void correr() {
        int velocidad = 0;
        
    }

    @Override
    public void dormir() {
    }

    @Override
    public void hacerEjercicio() {
    }
    
}
