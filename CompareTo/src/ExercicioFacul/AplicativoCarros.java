package ExercicioFacul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AplicativoCarros {
        public static void main(String[] args) {
         // Cria uma lista de carros
         List<Carro> lista = new ArrayList<>();

        // Adiciona carros à lista
        lista.add(new Carro("Honda", "Fit", 2010));
        lista.add(new Carro("Ford", "Ka", 2019));
        lista.add(new Carro("Fiat", "Siena", 2006));

        // Imprime a lista de carros antes da ordenação
       System.out.println ("Lista de carros antes da ordenação:");
      for (Carro carro : lista) {
            System.out.println(carro);
       }

       // Ordena a lista de carros por ano de fabricação usando o Collection.sort
       Collections.sort(lista);

       // Imprime a lista de carros após a ordenação
       System.out.println("\nLista de carros após a ordenação por ano de fabricação:");
       for (Carro carro : lista) {
             System.out.println(carro);
       }
  }
}