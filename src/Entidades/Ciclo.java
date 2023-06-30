package Entidades;

import java.time.LocalDate;

public class Ciclo {
    private int anno;

    private int numero;

    private LocalDate fechaInicio;

    private LocalDate fechaFinalizacion;

    public Ciclo(int anno, int numero, LocalDate fechaInicio, LocalDate fechaFinalizacion) {
        this.anno = anno;
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
