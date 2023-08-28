package Estoque.Produto;

public class Caneta implements Produto {

    public void getCorCaneta(){
        System.out.println("Caneta da cor azul!");
    }

    @Override
    public String getNomeDoProduto() {
        return "Caneta Azul";
    }

    @Override
    public String getValorDoProduto() {
        return "5,00";
    }
}
