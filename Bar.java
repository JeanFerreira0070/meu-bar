package Faculdade;
import java.util.Scanner;
import java.util.ArrayList;

public class Bar {
    private String nome;
    private double valorTotal = 0;
    private ArrayList<Produtos> produtosConsumidos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produtos produto) {
        produtosConsumidos.add(produto);
    }

    public void calcularConta() {
        for (Produtos produto : produtosConsumidos) {
            valorTotal += produto.getPreco();
        }
        System.out.println("Valor total da conta de " + getNome() + ": R$" + valorTotal);
    }
}
