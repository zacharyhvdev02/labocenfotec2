package Entidades;

import java.time.LocalTime;

public class Curso {
    public String codigo;

    public String nombre;

    public int creditos;

    public LocalTime horaSemanales;

    public Curso(String codigo, String nombre, int creditos, LocalTime horaSemanales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horaSemanales = horaSemanales;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public LocalTime getHoraSemanales() {
        return horaSemanales;
    }

    public void setHoraSemanales(LocalTime horaSemanales) {
        this.horaSemanales = horaSemanales;
    }
}
