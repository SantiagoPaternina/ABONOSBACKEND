package org.example.Modelos;

import java.time.LocalDate;

public class Equipo {

    private Long id;
    private String nombre;
    private Integer titulos;
    private LocalDate fundacion;
    private String ciudad;

    public Equipo() {
    }


    public Equipo(Long id, String nombre, Integer titulos, LocalDate fundacion, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.titulos = titulos;
        this.fundacion = fundacion;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTitulos() {
        return titulos;
    }

    public void setTitulos(Integer titulos) {
        this.titulos = titulos;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
