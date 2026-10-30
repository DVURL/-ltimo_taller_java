# Taller final de Java POO: Sistema de gestión de personajes

**Autor:** URIEL JARAMILLO
**Fecha:** 29/09/2026

Aplicación de consola en Java que registra un Guerrero y un Mago y muestra sus acciones desde una sola lista.

## Archivos
- `Personaje.java`: clase base con atributos privados, constructor y `mostrarInfo()`.
- `Guerrero.java`: hereda de Personaje y sobrescribe `realizarAccion()`.
- `Mago.java`: hereda de Personaje y sobrescribe `realizarAccion()`.
- `Main.java`: pide los datos, los valida y recorre la lista.

## Cómo ejecutarlo
    javac Personaje.java Guerrero.java Mago.java Main.java
    java Main