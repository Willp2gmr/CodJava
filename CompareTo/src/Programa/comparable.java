package Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Carro implements Comparable<Carro> {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public int compareTo(Carro outroCarro) {
        return Integer.compare(this.anoFabricacao, outroCarro.getAnoFabricacao());
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anoFabricacao + ")";
    }

    public static void main(String[] args) {
        List<Carro> lista = new ArrayList<>();
        lista.add(new Carro("Toyota", "Corolla", 2020));
        lista.add(new Carro("Honda", "Civic", 2019));
        lista.add(new Carro("Ford", "Focus", 2021));

        System.out.println("Lista de carros antes da ordenação:");
        for (Carro carro : lista) {
            System.out.println(carro);
        }

        Collections.sort(lista);

        System.out.println("\nLista de carros após a ordenação por ano de fabricação:");
        for (Carro carro : lista) {
            System.out.println(carro);
        }
    }
}
