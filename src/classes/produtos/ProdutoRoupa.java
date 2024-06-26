package classes.produtos;

public class ProdutoRoupa extends Produto {
    public ProdutoRoupa(String nome, double preco) {
        super(nome, preco);
    }

    public String enviarDados() {
        return "Roupa," + getNome() + "," + getPreco();
    }

    public String toString(){
        return "Roupa: " + getNome() +  " | Preco: " + getPreco();
    }

}
