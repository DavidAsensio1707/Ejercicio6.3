package Ejercicio2.Ejercicio2_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Principal1 {
    public static void main(String[] args) {
        HashMap<Integer, String> corredores = new HashMap<>();
        corredores.put(1, "Jose");
        corredores.put(2, "Maria");
        corredores.put(3, "Pedro");
        corredores.put(4, "Dwayne");
        boolean salida = false;
        System.out.println("1)Añadir elemento (pareja de valores entero y cadena) \n" +
                "2)Mostrar elemento para un dorsal concreto \n" +
                "3)Mostrar elemento(s) para un nombre concreto\n" +
                "4)Mostrar todos los elementos\n" +
                "5)Modificar nombre de un dorsal concreto\n" +
                "6)Eliminar elemento con dorsal concreto\n" +
                "7)Eliminar elemento(s) insertado con un nombre concreto\n" +
                "8)Salir");
        while (salida == false) {
            Scanner sc = new Scanner(System.in);
            System.out.print("inserta la opcion: ");
            int opcion = sc.nextInt();
            Scanner numero = new Scanner(System.in);
            Scanner nombre = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el dorsal y nombre del corredor: ");
                    Integer num1 = numero.nextInt();
                    String nom1 = nombre.nextLine();
                    corredores.put(num1, nom1);
                    break;

                case 2:
                    System.out.print("Inserta el dorsal del corredor: ");
                    Integer num2 = numero.nextInt();
                    System.out.println("El nombre del corredor es: " + corredores.get(num2));
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del corredor: ");
                    String nom3 = nombre.nextLine();
                    for (Entry<Integer, String> entrada : corredores.entrySet()) {
                        if (entrada.getValue().equals(nom3)) {
                            System.out.println("El dorsal del corredor es " + entrada.getKey());
                        }
                    }
                    break;
                case 4:
                    ArrayList<Entry<Integer, String>> corredoresLista = new ArrayList<>(corredores.entrySet());
                    corredoresLista.sort((c1, c2) -> (c1.getValue().compareTo(c2.getValue())));
                    for (Entry<Integer, String> corredoresOrdenados : corredoresLista) {
                        System.out.println("Dorsal: " + corredoresOrdenados);

                    }
                    break;
                case 5:
                    System.out.print("Inserta el dorsal del corredor: ");
                    Integer num5 = numero.nextInt();
                    System.out.print("Inserta el nuevo nombre del corredor: ");
                    String nom5 = nombre.nextLine();
                    corredores.put(num5, nom5);
                    break;
                case 6:
                    System.out.print("inserta el numero del corredor que quieras eliminar: ");
                    Integer num6 = numero.nextInt();
                    corredores.remove(num6);
                    break;
                case 7:
                    Iterator<Integer> iterador7 = corredores.keySet().iterator();
                    System.out.print("Ingresa el nombre del corredor que deseas eliminar: ");
                    String nom7 = nombre.nextLine();
                    while (iterador7.hasNext()) {
                        if (corredores.get(iterador7.next()).equals(nom7)) {
                            iterador7.remove();
                        }
                    }
                    break;
                case 8:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Inserta un numero del 1 al 8");
                    break;
            }
        }
        System.out.println("Se ha finalizado el programa");
    }
}