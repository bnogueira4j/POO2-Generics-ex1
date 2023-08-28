package Estoque;

import Estoque.Produto.Caderno;
import Estoque.Produto.Caneta;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Caneta caneta = new Caneta();
        Caderno caderno = new Caderno();

        estoque.adicionar(caneta);
        estoque.adicionar(caderno);

        System.out.println(estoque.getListaProdutos().get(0).getNomeDoProduto());
        System.out.println(estoque.getListaProdutos().get(0).getValorDoProduto());
        System.out.println(estoque.getListaProdutos().get(1).getNomeDoProduto());
        System.out.println(estoque.getListaProdutos().get(1).getValorDoProduto());
    }
}
