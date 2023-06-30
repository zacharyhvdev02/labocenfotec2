package Entidades;

import java.time.LocalDate;

public class Alumno extends Persona {

    private LocalDate fechaNacimiento;

    private int idCarreraCursando;

    public Alumno(LocalDate fechaNacimiento, int idCarreraCursando) {
        this.fechaNacimiento = fechaNacimiento;
        this.idCarreraCursando = idCarreraCursando;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdCarreraCursando() {
        return idCarreraCursando;
    }

    public void setIdCarreraCursando(int idCarreraCursando) {
        this.idCarreraCursando = idCarreraCursando;
    }
}
