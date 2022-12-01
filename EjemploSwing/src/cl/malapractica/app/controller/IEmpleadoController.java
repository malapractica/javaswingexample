package cl.malapractica.app.controller;

import cl.malapractica.app.model.entities.Empleado;
import java.util.List;

/**
 *
 * @author jazocar
 */
public interface IEmpleadoController {
    
    boolean save(Empleado empleado);
    List<Empleado> selectAll();
    List<Empleado> selectByRut(String rut);
}
