package Estoque.Produto;

public class Caderno implements Produto {

    public void getQuantidadeFolhas(){
        System.out.println("Caderno com 250 folhas!");
    }

    @Override
    public String getNomeDoProduto() {
        return "Caderno de capa dura";
    }

    @Override
    public String getValorDoProduto() {
        return "19,99";
    }
}
