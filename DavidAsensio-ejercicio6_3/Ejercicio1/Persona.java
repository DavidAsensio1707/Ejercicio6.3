package Ejercicio1;

public class Persona implements Comparable<Persona> {

  private String nombre;
  private String apellido1;
  private String apellido2;
  private Integer codigo;

  public Persona(String nombre, String apellido1, String apellido2, Integer codigo) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido1() {
    return apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  @Override
  public String toString() {
    return "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", codigo=" + codigo;
  }

  // Ejercicio 2
  @Override
  public int hashCode() {
    return codigo;
  }

  @Override
  public boolean equals(Object o) {
    boolean nombreIgual = this.nombre.equals(((Persona) o).nombre);
    boolean apellido1Igual = this.apellido1.equals(((Persona) o).apellido1);
    boolean apellido2Igual = this.apellido2.equals(((Persona) o).apellido2);
    boolean codigoIgual = this.codigo.equals(((Persona) o).codigo);
    boolean todoIgual = nombreIgual && apellido1Igual && apellido2Igual && codigoIgual;
    return todoIgual;
  }

  @Override
  public int compareTo(Persona otraPersona) {

    return this.codigo.compareTo(otraPersona.codigo);
  }

}