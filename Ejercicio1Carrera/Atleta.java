package Ejercicio1Carrera;

import java.time.LocalDate;

public class Atleta {
    private String nombre;
    private int numero;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private double tiempo;

    public Atleta() {
    }
    

//En una carrera de velocidad participan un cierto número de atletas, fecha de nacimiento y el tiempo que le tomó correr la carrera. Cree una clase “Atleta” que represente a un atleta, con los métodos de acceso a los atributos y constructores necesarios.

    public Atleta(String nombre ,int numero,String nacionalidad, LocalDate fechaNacimiento, double tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public String toString() {
        return "Atleta [Nombre: " + nombre + ", Número: " + numero + ", Nacionalidad: " + nacionalidad + 
               ", Nacimiento: " + fechaNacimiento + ", Tiempo: " + tiempo + "s]";
    }

}
