package com.service.impl;

import com.entities.Estudiantes;
import org.springframework.stereotype.Service;

import java.util.List;
import com.db.EstudiantesRepository;
import comservice.EstudiantesService;

@Service
public class EstudiantexService implements EstudiantesService {

    private final EstudiantesRepository EstudiantesRepository;

    public EstudiantexServicee(EstudiantesRepository EstudiantesRepository) {
        this.EstudiantesRepository = EstudiantesRepository;
    }
//Read lo que hay en estudiantes
    public List<Estudiantes> getAllEstudiantes() {
        return (List<Estudiantes>) this.EstudiantesRepository.findAll();
    }
 //create despliega nuevo usuario 
    public void create(Estudiantes Estudiantes) {
        Estudiantes.setActivo(true);
        this.EstudiantesRepository.save(Estudiantes);
    }
//delete 
    public void delete(Estudiantes Estudiantes) {
        this.EstudiantesRepository.delete(Estudiantes);
    }
//gurdar datos de nuevo usuario

    public void save(Estudiantes Estudiantes) {
        Estudiantes.setActivo(true);
        this.EstudiantesRepository.save(Estudiantes);
    }

 //metodo para buscar por id
    
    
   
}



