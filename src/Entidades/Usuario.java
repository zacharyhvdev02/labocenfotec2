package Entidades;

public class Usuario {

    public String clave;

    public Persona persona;

    public Usuario(String clave, Persona persona) {
        this.clave = clave;
        this.persona = persona;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
