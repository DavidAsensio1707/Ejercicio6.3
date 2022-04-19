package Ejercicio1;

import java.util.Comparator;

public class ComparadorPorApellido1 implements Comparator<Persona> {
  /*
   * 11.Crea un par de comparadores (Comparator) y úsalos para ordenar el TreeSet
   * por nombre y después por apellido1
   */
  @Override
  public int compare(Persona o1, Persona o2) {
    return o1.getApellido1().compareTo(o2.getApellido1());
  }

}
