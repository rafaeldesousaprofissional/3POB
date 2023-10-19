package av1.produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

     private ArrayList<Produto> produtos = new ArrayList();

     public void processamento() {

         double valorFinal = 0.00;

        System.out.println("Sistema carrinho\n");
        
        Scanner sc = new Scanner(System.in);
		Produto prod1 = new Produto(1 , "Cera", 5.50);
		produtos.add(prod1);
        prod1 = new Produto(2 , "Sabao", 2.99);
		produtos.add(prod1);
        prod1 = new Produto(3 , "Shampoo", 1.99);
		produtos.add(prod1);
        
        Carrinho carrinho = new Carrinho(0);

        carrinho.setItem(3, 2);
        carrinho.setItem(2, 6);

        
        valorFinal = valor(carrinho);

        System.out.println(valorFinal);

    }

    public double valor(Carrinho carrinho){
        double preco=0.00;

        for (int i = 0; i < produtos.size(); i++){

            for (int j = 0; j < 2; j++){
                
                if(produtos.get(i).getId() == carrinho.getItem(j)){
                     preco += produtos.get(i).getPreco();
                }
            }
        }
        return preco;
    }
}
