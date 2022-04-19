package Ejercicio2.Ejercicio2_2;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> fraseMapa = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una oracion: ");
        String fraseTeclado = sc.nextLine();
        for (int i = 0; i < fraseTeclado.length(); i++) {
            char letras = fraseTeclado.charAt(i);
            if (fraseMapa.keySet().contains(letras)) {
                fraseMapa.put(letras, fraseMapa.get(letras) + 1);
            } else {
                fraseMapa.put(letras, 1);
            }
        }

        ArrayList<Entry<Character, Integer>> letrasOrdenadas = new ArrayList<>(fraseMapa.entrySet());
        letrasOrdenadas.sort((l1, l2) -> (l2.getValue().compareTo(l1.getValue())));
        for (Entry<Character, Integer> letras : letrasOrdenadas) {
            System.out.println(letras + ": " + (letras.getKey() * 100) / fraseTeclado.length() + " %");
        }
        sc.close();
    }
}
