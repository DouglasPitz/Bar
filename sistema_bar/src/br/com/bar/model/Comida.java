package br.com.bar.model;

public class Comida extends Item {

    public Comida(int id, String nome, double precoBase) {
        super(id, nome, precoBase, CategoriaItem.COMIDA);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}