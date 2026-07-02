package br.com.bar.model;

public class Bebida extends Item{
    public Bebida(int id, String nome, double precoBase) {
        super(id, nome, precoBase, CategoriaItem.BEBIDA);
    }
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }
}
