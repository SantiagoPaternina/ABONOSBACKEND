package org.example.Modelos;

import java.time.LocalDate;

public class Abono {
    private Long id;
    private Hincha hincha;
    private Tribuna tribuna;
    private Equipo equipo;
    private Integer costo;
    private LocalDate fechaVencimiento;

    public Abono() {
    }

    public Abono(Long id, Hincha hincha, Tribuna tribuna, Equipo equipo, Integer costo, LocalDate fechaVencimiento) {
        this.id = id;
        this.hincha = hincha;
        this.tribuna = tribuna;
        this.equipo = equipo;
        this.costo = costo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hincha getHincha() {
        return hincha;
    }

    public void setHincha(Hincha hincha) {
        this.hincha = hincha;
    }

    public Tribuna getTribuna() {
        return tribuna;
    }

    public void setTribuna(Tribuna tribuna) {
        this.tribuna = tribuna;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
