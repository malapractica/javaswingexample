/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.malapractica.app.controller.impl;

import cl.malapractica.app.controller.IEmpleadoController;
import cl.malapractica.app.model.entities.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jazocar
 */
public class EmpleadoControllerImpl implements IEmpleadoController {

    @Override
    public boolean save(Empleado empleado) {
       
        if(empleado != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Empleado> selectAll() {
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("16698-2", "Santiago", "SI", "Indefinido"));
        lista.add(new Empleado("16697-3", "Providencia", "SI", "Indefinido"));
        lista.add(new Empleado("16691-4", "Valparaiso", "NO", "Indefinido"));
        lista.add(new Empleado("11678-5", "Puente Alto", "NO", "Honorarios"));
        lista.add(new Empleado("13678-6", "La Florida", "SI", "Indefinido"));
        lista.add(new Empleado("12456-7", "Chillán", "NO", "Honorarios"));
        
        return lista;
    }

    @Override
    public List<Empleado> selectByRut(String rut) {
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("16698-2", "Santiago", "SI", "Indefinido"));
        lista.add(new Empleado("16697-3", "Providencia", "SI", "Indefinido"));
        lista.add(new Empleado("16691-4", "Valparaiso", "NO", "Indefinido"));
        lista.add(new Empleado("11678-5", "Puente Alto", "NO", "Honorarios"));
        lista.add(new Empleado("13678-6", "La Florida", "SI", "Indefinido"));
        lista.add(new Empleado("12456-7", "Chillán", "NO", "Honorarios"));
        
        List<Empleado> nuevaLista = new ArrayList<>();
        
        for(Empleado empleado: lista){
            if(empleado.getRut().contains(rut)){
                nuevaLista.add(empleado);
            }
        }
        
        return nuevaLista;    
    }   
}
