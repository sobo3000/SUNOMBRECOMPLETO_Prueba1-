package com.tienda.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer nombre;
    private String nivel_cursado;
    private Integer Identificador;
    private Integer edad;
    private Integer altura;
    private String genero;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id_producto) {
        this.id = id_producto;
    }

    public Integer getId_categoria() {
        return nombre;
    }

    public void setId_categoria(Integer id_categoria) {
        this.nombre = id_categoria;
    }

    public String getDescripcion() {
        return nivel_cursado;
    }

    public void setDescripcion(String descripcion) {
        this.nivel_cursado = descripcion;
    }

    public Integer getDetalle() {
        return Identificador;
    }

    public void setDetalle(Integer detalle) {
        this.Identificador = detalle;
    }

    public Integer getPrecio() {
        return edad;
    }

    public void setPrecio(Integer precio) {
        this.edad = precio;
    }

    public Integer getExistencias() {
        return altura;
    }

    public void setExistencias(Integer existencias) {
        this.altura = existencias;
    }

    public String getRuta_imagen() {
        return genero;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.genero = ruta_imagen;
    }

}
