package av1.produto;

import java.util.ArrayList;

public class Carrinho {
    private int idPessoa;
    private ArrayList<Item> itens = new ArrayList();
    private float valor;


    public Carrinho(int idPessoa) {
        super();
        this.idPessoa = idPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setId(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public void setItem(int idProduto, int quant){
        int id = idProduto;
        int quantidade = quant;
        Item item = new Item(id, quantidade);
        itens.add(item);
    }

    public int getItem(int num){
        int resp = itens.get(num).getIdProduto();
        return resp;
    }

    public void Valor(float valor){

        for (int i = 0; i < itens.size(); i++){
        
        }
    }
}
