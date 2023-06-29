package com.entities;
//crud por cada atributo de personas con su respectivo string int double

import jakarta.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "producto")
public class Estudiantes {

    @Id
    @Column(name = "id_estudiantes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    private String nivel_cursado;
    private Integer Identificador;
    private Integer edad;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double peso;
    private String genero;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel_cursado() {
        return nivel_cursado;
    }

    public void setNivel_cursado(String nivel_cursado) {
        this.nivel_cursado = nivel_cursado;
    }

    public Integer getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Integer Identificador) {
        this.Identificador = Identificador;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
   

   
        
   
    