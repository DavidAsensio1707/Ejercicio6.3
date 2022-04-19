package Ejercicio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
  public static void main(String[] args) {

    Persona persona1 = new Persona("Jose", "Garcia", "Vazquez", 1);
    Persona persona2 = new Persona("Lolito", "Fdez", "Yepa", 2);
    Persona persona3 = new Persona("Jose", "Garcia", "Vazquez", 1);
    Persona persona4 = new Persona("Matthew", "Webster", "Christensen", 4);
    Persona persona5 = new Persona("Robert", "Davis", "Delacruz", 5);
    Persona persona6 = new Persona("Jacob", "Peterson", "Gregory", 6);
    Persona persona7 = new Persona("Roberto", "Pozo", "Mohammed", 7);
    Persona persona8 = new Persona("Dwayne", "\'The Rock\'", "Johnson", 8);
    System.out.println("Ejercicio 1");
    HashMap<Persona, Integer> personasMap = new HashMap<>();
    personasMap.put(persona1, 1);
    personasMap.put(persona2, 2);
    personasMap.put(persona3, 3);
    personasMap.put(persona4, 4);
    for (Persona clave : personasMap.keySet()) {
      Integer valor = personasMap.get(clave);
      System.out.println(valor + ": " + clave);
    }

    /*
     * ¿Nos lo permite? ¿Por qué? (Recuerda la teoría de Sets, en este caso HashSet)
     * Si fueran tipos primitivos como ya hemos visto en los ejemplos ¿Habría que
     * ajustar algo?
     * 
     * Si nos lo permite ya que sus Hashcode no son iguales
     * Habria que ajustar el Hashcode, por ejemplo que el HashCode se genere solo
     * por el codigo o la primera letra del nombre
     */
    System.out.println("\nEjercicio 3 y 4 (HashSet): ");
    Set<Persona> personasSet = new HashSet<>();
    personasSet.add(persona1);
    personasSet.add(persona2);
    personasSet.add(persona3);
    personasSet.add(persona4);
    personasSet.add(persona5);
    personasSet.add(persona6);
    personasSet.add(persona7);
    personasSet.add(persona8);
    personasSet.add(persona5);
    personasSet.add(persona2);
    System.out.println("for each:");
    for (Persona personas : personasSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas = personasSet.iterator();
    while (iteradorPersonas.hasNext()) {
      System.out.println(iteradorPersonas.next());
    }
    // Ejercicio 5
    System.out.println("\nEjercicio 5 (Despues de añadir una persona mas): ");
    Persona persona9 = new Persona("John", "Travolta", "otroApellido", 9);
    personasSet.add(persona9);
    System.out.println("for each:");
    for (Persona personas : personasSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas2 = personasSet.iterator();
    while (iteradorPersonas2.hasNext()) {
      System.out.println(iteradorPersonas2.next());
    }
    // Ejercicio 6
    System.out.println("\nEjercicio 6 (Eliminar a un a persona por su apellido1 e imprimir): ");
    String apellido1AEliminar = "Travolta";
    Iterator<Persona> iteradorParaEliminar = personasSet.iterator();
    while (iteradorParaEliminar.hasNext()) {
      if (iteradorParaEliminar.next().getApellido1().equals(apellido1AEliminar)) {
        iteradorParaEliminar.remove();
      }
    }
    System.out.println("for each:");
    for (Persona personas : personasSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas3 = personasSet.iterator();
    while (iteradorPersonas3.hasNext()) {
      System.out.println(iteradorPersonas3.next());
    }

    // Ejercicio 7
    System.out.println("\nEjercicio 7 (3, 4, 5, 6 pero con LinkedHashSet): ");
    System.out.println("\n 3 y 4: ");
    Set<Persona> personasLinkedSet = new LinkedHashSet<>();
    personasLinkedSet.add(persona1);
    personasLinkedSet.add(persona2);
    personasLinkedSet.add(persona3);
    personasLinkedSet.add(persona4);
    personasLinkedSet.add(persona5);
    personasLinkedSet.add(persona6);
    personasLinkedSet.add(persona7);
    personasLinkedSet.add(persona8);
    personasLinkedSet.add(persona5);
    personasLinkedSet.add(persona2);
    System.out.println("for each:");
    for (Persona personas : personasLinkedSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas74 = personasLinkedSet.iterator();
    while (iteradorPersonas74.hasNext()) {
      System.out.println(iteradorPersonas74.next());
    }
    // Ejercicio 5
    System.out.println("\nEjercicio 5 (Despues de añadir una persona mas): ");
    personasLinkedSet.add(persona9);
    System.out.println("for each:");
    for (Persona personas : personasLinkedSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas75 = personasLinkedSet.iterator();
    while (iteradorPersonas75.hasNext()) {
      System.out.println(iteradorPersonas75.next());
    }
    // Ejercicio 6
    System.out.println("\nEjercicio 6 (Eliminar a un a persona por su apellido1 e imprimir): ");
    Iterator<Persona> iteradorParaEliminar7 = personasLinkedSet.iterator();
    while (iteradorParaEliminar7.hasNext()) {
      if (iteradorParaEliminar7.next().getApellido1().equals(apellido1AEliminar)) {
        iteradorParaEliminar7.remove();
      }
    }
    System.out.println("for each:");
    for (Persona personas : personasLinkedSet) {
      System.out.println(personas);
    }
    System.out.println("con iterador:");
    Iterator<Persona> iteradorPersonas76 = personasLinkedSet.iterator();
    while (iteradorPersonas76.hasNext()) {
      System.out.println(iteradorPersonas76.next());
    }
    System.out.println("\nEjercicio 8 (añadir personas a un TreeSet y recorrerlo): ");
    TreeSet<Persona> personasTreeSet = new TreeSet<>(new ComparadorDeApellidos());
    personasTreeSet.add(persona1);
    personasTreeSet.add(persona2);
    personasTreeSet.add(persona6);
    personasTreeSet.add(persona4);
    personasTreeSet.add(persona5);
    personasTreeSet.add(persona8);
    for (Persona persona : personasTreeSet) {
      System.out.println(persona);
    }
    /*
     * 8.Tratar de insertar varias personas en un TreeSet y recorrerlo. ¿Se puede?
     * ¿Por qué?
     * no sabria responder a la pregunta
     * 
     * 10.Tratar nuevamente de insertar varias personas
     * (donde coincidan algunos valores) en el TreeSet y recorrerlo.
     */
    System.out.println("\nEjercicio 10: ");
    System.out.println("\nSegundo recorrido del TreeSet: ");
    personasTreeSet.add(persona3);
    personasTreeSet.add(persona7);
    personasTreeSet.add(persona8);
    for (Persona persona : personasTreeSet) {
      System.out.println(persona);
    }
    /*
     * 11.Crea un par de comparadores (Comparator) y úsalos para ordenar el TreeSet
     * por nombre y después por apellido1
     */
    System.out.println("\nEjercicio 11: ");
    System.out.println("\nordenados por nombre:");
    TreeSet<Persona> personasTreeSetOrdenadosPorNombre = new TreeSet<>(new ComparadorPorNombre());
    personasTreeSetOrdenadosPorNombre.add(persona1);
    personasTreeSetOrdenadosPorNombre.add(persona2);
    personasTreeSetOrdenadosPorNombre.add(persona6);
    personasTreeSetOrdenadosPorNombre.add(persona4);
    personasTreeSetOrdenadosPorNombre.add(persona5);
    personasTreeSetOrdenadosPorNombre.add(persona8);
    for (Persona persona : personasTreeSetOrdenadosPorNombre) {
      System.out.println(persona);
    }
    System.out.println("\nordenado por apellido1:");
    TreeSet<Persona> personasTreeSetOrdenadoPorApellido1 = new TreeSet<>(new ComparadorPorApellido1());
    personasTreeSetOrdenadoPorApellido1.add(persona1);
    personasTreeSetOrdenadoPorApellido1.add(persona2);
    personasTreeSetOrdenadoPorApellido1.add(persona6);
    personasTreeSetOrdenadoPorApellido1.add(persona4);
    personasTreeSetOrdenadoPorApellido1.add(persona5);
    personasTreeSetOrdenadoPorApellido1.add(persona8);
    for (Persona persona : personasTreeSetOrdenadoPorApellido1) {
      System.out.println(persona);
    }

    /*
     * 12.Repite estas comparaciones creando los comparadores con expresiones lambda
     * dentro del constructor del TreeSet
     */
    System.out.println("\nEjercicio 12: ");
    System.out.println("\nordenados por nombre, utilizando expresion lambda:");
    TreeSet<Persona> personasTreeSetOrdenadosPorNombreLambda = new TreeSet<>(
        (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    personasTreeSetOrdenadosPorNombreLambda.add(persona1);
    personasTreeSetOrdenadosPorNombreLambda.add(persona2);
    personasTreeSetOrdenadosPorNombreLambda.add(persona6);
    personasTreeSetOrdenadosPorNombreLambda.add(persona4);
    personasTreeSetOrdenadosPorNombreLambda.add(persona5);
    personasTreeSetOrdenadosPorNombreLambda.add(persona8);
    for (Persona persona : personasTreeSetOrdenadosPorNombreLambda) {
      System.out.println(persona);
    }
    System.out.println("\nordenado por apellido1, utilizando expresion lambda:");
    TreeSet<Persona> personasTreeSetOrdenadoPorApellido1Lambda = new TreeSet<>(
        (p1, p2) -> p1.getApellido1().compareTo(p2.getApellido1()));
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona1);
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona2);
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona6);
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona4);
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona5);
    personasTreeSetOrdenadoPorApellido1Lambda.add(persona8);
    for (Persona persona : personasTreeSetOrdenadoPorApellido1Lambda) {
      System.out.println(persona);
    }
  }
}
