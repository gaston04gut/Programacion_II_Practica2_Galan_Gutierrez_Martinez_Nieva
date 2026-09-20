package Ejercicio1Carrera;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrera {
    private double distancia;
    private List<Atleta> competidores;//collection

    // constructor 
    public Carrera (double distancia){
     this.distancia=distancia;
     this.competidores= new ArrayList<>();//inicializamos la lista vacia
    }

    public void agregarAtleta (Atleta atleta){ //agregar atletas
      competidores.add (atleta);
    }
    public List<Atleta> getCompetidores(){
        return competidores;
    }
    public double getDistancia (){
        return distancia;
    }
    public void mostrarCompetidores() {
     System.out.println("=== LISTA DE COMPETIDORES ===");
     for (Atleta a : competidores) {
        System.out.println(a);
    }
}
    public Atleta obtenerGanador() {

     if (competidores.isEmpty()) {
        return null; // Si no hay atletas, devuelve nulo de forma segura
     }
     
     Atleta ganador = competidores.get(0); // el primero de la lista
    
     for (Atleta a : competidores) {
        if (a.getTiempo() < ganador.getTiempo()) {
            ganador = a; // Si es menor, lo actualizamos como el nuevo ganador
        }}
      return ganador; 
    }
    public int contarYMostrarUruguayos() {
      int contador = 0;
      System.out.println(" ATLETAS DE NACIONALIDAD URUGUAYA");

     for (Atleta a: competidores) {
        if (a.getNacionalidad().equalsIgnoreCase("Uruguaya")) {
            System.out.println(a); // Muestra los datos del atleta
            contador++; 
        }}
        return contador;
    }

    public void ordenarYMostrarPorNombre() {

     competidores.sort(Comparator.comparing(Atleta::getNombre));
    
    System.out.println("=== ATLETAS ORDENADOS ===");
    for (Atleta a : competidores) {
        System.out.println(a);
    }}
   public Atleta buacarArgentinoMenor(){
        System.out.println(" Atletas de Nacionalidad Argentina y menor edad");
        LocalDate hoy = LocalDate.now();
        for (Atleta a :competidores ){
          boolean esArgentino ="Argentino".equalsIgnoreCase(a.getNacionalidad());
          
          int edad = Period.between(a.getFechaNacimiento(), hoy).getYears();

        if (esArgentino && edad < 18) {
        return a; 
        }}
    return null; 
   }
    public Atleta obtenerUltimoEnLlegar() {
     if (competidores.isEmpty()) {
        return null;
    }
    Atleta ultimo = competidores.get(0); 
    for (Atleta a : competidores) {
        if (a.getTiempo() > ultimo.getTiempo()) {
            ultimo = a;
        }
    }
    return ultimo;
    }
    
    public boolean existeAtletaPeruano() {
    for (Atleta a : competidores) {
        if ("Peruana".equalsIgnoreCase(a.getNacionalidad()) || "Peruano".equalsIgnoreCase(a.getNacionalidad())) {
        return true;}}
    return false; 
    }
}