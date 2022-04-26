
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;


public class Controladora {
  ControladoraPersistencia  controlPersis = new ControladoraPersistencia ();
public void crearPersona(Persona per){
controlPersis.crearPersona(per);
}
public void eliminarPersona(int id) throws NonexistentEntityException{
controlPersis.eliminarPersona(id);
}
public void eliminarPersona(Persona pers){
controlPersis.eliminarPersona(pers);
}

public List<Persona> traerPersona(){
return controlPersis.traerPersonas();
}

    public void eliminarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void eliminarPerson() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
