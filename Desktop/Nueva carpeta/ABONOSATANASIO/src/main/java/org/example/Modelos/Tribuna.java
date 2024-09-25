package org.example.Modelos;

public class Tribuna {
    private Long id;
    private String nombre;
    private Integer aforo;
    private String localidad;
    private Boolean estaSancionada;

    public Tribuna() {
    }

    public Tribuna(Long id, String nombre, Integer aforo, String localidad, Boolean estaSancionada) {
        this.id = id;
        this.nombre = nombre;
        this.aforo = aforo;
        this.localidad = localidad;
        this.estaSancionada = estaSancionada;
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

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Boolean getEstaSancionada() {
        return estaSancionada;
    }

    public void setEstaSancionada(Boolean estaSancionada) {
        this.estaSancionada = estaSancionada;
    }
}
