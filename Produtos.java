package Faculdade;

public class Produtos {
    private String Produto;
    private double preco;

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produtos(String produto, double preco) {
        Produto = produto;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return (Produto + ": R$" + preco );
    }

}
