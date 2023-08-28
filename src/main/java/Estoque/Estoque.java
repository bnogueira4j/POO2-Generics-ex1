package Estoque;

import Estoque.Produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> listaProdutos = new ArrayList<>();

    public boolean adicionar(Produto produto){
        if(produto != null){
            listaProdutos.add(produto);
            return true;
        }
        return false;
    }

    public boolean remove(Produto produto){
        if(produto != null){
            listaProdutos.remove(produto);
            return true;
        }
        return false;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
}
