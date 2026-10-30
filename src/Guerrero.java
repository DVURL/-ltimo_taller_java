// TALLER FINAL: JAVA POO
// AUTOR: URIEL JARAMILLO
// FECHA: 29-09-2026
// CLASE: Guerrero (hereda de Personaje)

public class Guerrero extends Personaje {

    public Guerrero(int id, String nombre, int nivel) {
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion() {
        return "El guerrero ataca con su espada.";
    }
}