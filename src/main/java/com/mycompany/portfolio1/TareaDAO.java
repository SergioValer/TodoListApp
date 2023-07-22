
package com.mycompany.portfolio1;

import java.util.List;

public interface TareaDAO {
       Tarea obtenerPorId(Long id);
        List<Tarea> obtenerTodas();
        void crear(Tarea tarea);
         void actualizar(Tarea tarea);
        void eliminar(Tarea tarea);
}
