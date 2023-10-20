package av1;

import java.util.ArrayList;

public class Carrinho {
    private int idPessoa;
    private ArrayList<Item> itens = new ArrayList();
    private double total;

    public Carrinho(int idPessoa) {
        super();
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public void setItem(int idProduto, int quant){
       
        int id = idProduto;
        int quantidade = quant;
        Item item = new Item(id, quantidade);
        itens.add(item);
    }

    public int getItemId(int num){
        int resp = itens.get(num).getIdProduto();
        return resp;
    }

    public int getItemQuant(int num){
        int resp = itens.get(num).getQuant();
        return resp;
    }

    public void setItemQuant(int num,int quant){
       itens.get(num).setQuant(quant);
    }

    public int getItemsize(){
        return itens.size();
    }

}
