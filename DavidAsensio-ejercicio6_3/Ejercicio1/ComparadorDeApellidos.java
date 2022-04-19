package Ejercicio1;

import java.util.Comparator;

public class ComparadorDeApellidos implements Comparator<Persona> {

  @Override
  public int compare(Persona p1, Persona p2) {
    int comparacion;
    if (p1.getApellido1().equals(p2.getApellido1())) {
      comparacion = p1.getApellido2().compareTo(p2.getApellido2());
    } else {
      comparacion = p1.getApellido1().compareTo(p2.getApellido1());
    }
    return comparacion;
  }

}
