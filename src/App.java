// TALLER FINAL: JAVA POO
// AUTOR: URIEL JARAMILLO
// FECHA: 29/09/2026

import java.util.ArrayList;
import java.util.Scanner;

public class App {

        public static boolean datosValidos(int id, String nombre, int nivel) {
        if (id <= 0) {
            System.out.println("Error: el id debe ser mayor que 0.");
            return false;
        }
        if (nombre.trim().isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return false;
        }
        if (nivel < 1 || nivel > 100) {
            System.out.println("Error: el nivel debe estar entre 1 y 100.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        try {
            System.out.println("=== Registro del Guerrero ===");
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(sc.nextLine());

            if (!datosValidos(id, nombre, nivel)) {
                return;
            }
            personajes.add(new Guerrero(id, nombre, nivel));

             System.out.println("=== Registro del Mago ===");
            System.out.print("ID: ");
            id = Integer.parseInt(sc.nextLine());
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Nivel: ");
            nivel = Integer.parseInt(sc.nextLine());

            if (!datosValidos(id, nombre, nivel)) {
                return;
            }
            personajes.add(new Mago(id, nombre, nivel));

        } catch (NumberFormatException e) {

            System.out.println("Error: debes ingresar un número válido en id y nivel.");
            return;
        }

         System.out.println("=== Personajes registrados ===");
        for (Personaje p : personajes) {
            p.mostrarInfo();
            System.out.println(p.realizarAccion());
            System.out.println("---------------");
        }

        System.out.println(">_ Urx.code()");
    }
}
