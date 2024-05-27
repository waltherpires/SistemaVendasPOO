import java.util.Date;

public class VendaCredito extends Venda{
    public VendaCredito(Cliente cliente, Produto produto, Date dataVenda) {
        super(cliente, produto, dataVenda);
    }

    public double calcularTotal(){
        return getProduto().getPreco()*1.10;
    }
}