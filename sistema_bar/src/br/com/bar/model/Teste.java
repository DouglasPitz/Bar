package br.com.bar.model;

public class Teste {   public static void main(String[] args) {

    Item cerveja = new Bebida(1, "Cerveja", 10.0);
    Item hamburguer = new Comida(2, "Hamburguer", 20.0);

    System.out.println(cerveja.getNome() + " - Final: " + cerveja.calcularPrecoFinal());
    System.out.println(hamburguer.getNome() + " - Final: " + hamburguer.calcularPrecoFinal());
}
}
