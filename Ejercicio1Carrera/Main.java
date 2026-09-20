package Ejercicio1Carrera;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Carrera carrera=new Carrera(200.0);

        System.out.print("=== REGISTRO DE ATLETA ===");

        //nombre
        System.out.print("Ingrese el nombre del atleta:");
        String nombre = scanner.nextLine();

        // número
        System.out.print("Ingrese el número del atleta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // nacionalidad
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        // fecha de nacimiento
        System.out.print("Año de nacimiento : ");
        int año = scanner.nextInt();
        System.out.print("Mes de nacimiento : ");
        int mes = scanner.nextInt();
        System.out.print("Día de nacimiento : ");
        int dia = scanner.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        //tiempo
        System.out.print("Ingrese el tiempo en segundos: ");
        double tiempo = scanner.nextDouble();

        Atleta atleta = new Atleta(nombre,numero, nacionalidad,fechaNacimiento,tiempo);
        carrera.agregarAtleta(atleta);
        
        System.out.println("¡Atleta registrado con éxito!");

        System.out.println("La cantidad de atletas en la carrera son: " + carrera.getCompetidores().size());
        
        System.out.println("el listado de los COMPETIDORES :");
        carrera.mostrarCompetidores();

        Atleta ganador = carrera.obtenerGanador();
        if (ganador != null) {
         System.out.println("\n=== ¡GANADOR DE LA CARRERA! ===");
         System.out.println(ganador); // Esto llama al toString() de Atleta con sus datos
         System.out.println("Tiempo registrado: " + ganador.getTiempo() + " segundos");
         } else {
         System.out.println("No hay atletas registrados en la carrera.");
         }
    
        int totalUruguayos = carrera.contarYMostrarUruguayos();
        System.out.println("Cantidad total de atletas uruguayos: " + totalUruguayos);

        carrera.ordenarYMostrarPorNombre();
        
        Atleta primerMenorArg = carrera.buacarArgentinoMenor();

        if (primerMenorArg != null) {
            System.out.println("PRIMER ATLETA ARGENTINO MENOR DE EDAD ");
            System.out.println(primerMenorArg);
        } else {
            System.out.println("No se encontró ningún atleta argentino menor de edad.");
        }
        Atleta ultimoAtleta = carrera.obtenerUltimoEnLlegar();

        if (ultimoAtleta != null) {
          System.out.println("ATLETA QUE SALIÓ ÚLTIMO ===");
          System.out.println(ultimoAtleta);
          System.out.println("Tiempo registrado: " + ultimoAtleta.getTiempo() + " segundos");
        } else {
          System.out.println("No hay atletas registrados en la carrera.");
        }
        boolean hayPeruano = carrera.existeAtletaPeruano();

        if (hayPeruano) {
         System.out.println(" ATLETA PERUANO");
         System.out.println("Sí, existe al menos un atleta de nacionalidad peruana en la carrera.");
        } else {
          System.out.println("No se encontró ningún atleta de nacionalidad peruana en la carrera.");
        }
    }}