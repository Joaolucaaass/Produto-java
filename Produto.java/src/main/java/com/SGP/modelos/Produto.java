package com.SGP.modelos;  // Declaração do pacote

public class Produto {

    private String nomeProduto; // Atributo privado, acessível só dentro da classe Produto
    private double preco; // Atributo privado que armazena o preço do produto
    private int quantidade; // Atributo privado que armazena a quantidade disponível

    // Construtor que recebe nome do produto, preço e quantidade como parâmetros
    public Produto(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor sobrecarregado sem parâmetros
    // Inicializa com valores padrão: nomeProduto="Caderno", preco=10.0 e quantidade=1
    public Produto() {
        this.nomeProduto = "Caderno";
        this.preco = 10.0;
        this.quantidade = 1;
    }

    // Método que exibe informações do produto
    public void exibirProduto() {
        System.out.println("Produto: " + nomeProduto + " | Preço: R$" + preco + " | Quantidade: " + quantidade);
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados

    // Retorna o nome do produto
    public String getNomeProduto() {
        return nomeProduto;
    }

    // Retorna o preço do produto
    public double getPreco() {
        return preco;
    }

    // Retorna a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Define um novo nome para o produto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    // Define um novo preço para o produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Define uma nova quantidade para o produto
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
