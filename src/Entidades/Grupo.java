package Entidades;

import java.util.ArrayList;

public class Grupo {
    private Ciclo ciclo;

    private Curso curso;

    private int numero;

    private String horario;

    private Profesor profesor;

    private ArrayList<Alumno> estudiantes;

    public Grupo(Ciclo ciclo, Curso curso, int numero, String horario, Profesor profesor, ArrayList<Alumno> estudiantes) {
        this.ciclo = ciclo;
        this.curso = curso;
        this.numero = numero;
        this.horario = horario;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Alumno> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
