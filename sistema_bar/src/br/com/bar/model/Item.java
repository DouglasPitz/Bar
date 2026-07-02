package br.com.bar.model;

public abstract class Item {
    private int id;
    private String nome;
    private double precoBase;
    private CategoriaItem categoria;

    public Item(int id, String nome, double precoBase, CategoriaItem categoria) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public CategoriaItem getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaItem categoria) {
        this.categoria = categoria;
    }
    public abstract double calcularPrecoFinal();
}
