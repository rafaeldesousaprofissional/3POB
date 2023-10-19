package av1.produto;

public class Item {
    private int idProduto;
    private int quant;

    public Item(int idProduto,int quant){
        super();
        this.idProduto = idProduto;
        this.quant = quant;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
