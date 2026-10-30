// TALLER FINAL: JAVA POO
// AUTOR: URIEL JARAMILLO
// FECHA: 29-09-2026
// CLASE: Mago (hereda de Personaje)

public class Mago extends Personaje {

    public Mago(int id, String nombre, int nivel) {
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion() {
        return "El mago lanza un hechizo de fuego.";
    }
}