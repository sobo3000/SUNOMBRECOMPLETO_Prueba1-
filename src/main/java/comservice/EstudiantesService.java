package comservice;

import com.entities.Estudiantes;
import java.util.List;

public interface EstudiantesService {
    List<Estudiantes> getAllEstudiantes();

    void save(Estudiantes product);

    void delete(Estudiantes product);
    
    //en estudiantes buscamos por id
    Estudiantes buscarPorId(Long id);

}
