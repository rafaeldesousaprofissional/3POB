package av1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

     private ArrayList<Produto> produtos = new ArrayList();

     public void processamento() {

        System.out.println("Sistema carrinho:\n");
        
        //produtos preedeterminados
		Produto produto = new Produto(1 , "Cera", 5.50);
		produtos.add(produto);
        produto = new Produto(2 , "Sabao", 2.99);
		produtos.add(produto);
        produto = new Produto(3 , "Shampoo", 1.99);
		produtos.add(produto);
        
        Carrinho carrinho = new Carrinho(0);
        
        menu(carrinho);
        
    }

    public void menu(Carrinho carrinho){
        int op=0;

        while(op!=5){

            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha a opção:\n");
            System.out.println("1-Adicionar Produto ao carrinho\n2-Listar Produtos\n3-Ver carrinho\n4-Adicionar Novo Produto\n5-Finalizar\n");
            op = sc.nextInt();

            switch(op){

                case 1: AdicionarProdutoCarrinho(carrinho);
                break;

                case 2: ListarProdutos();
                break;

                case 3: VerCarrinho(carrinho);
                break;

                case 4: AdicionarProduto();
                break;

                case 5:System.exit(0);
                break;
            }
        }
    }

    public void AdicionarProdutoCarrinho(Carrinho carrinho){

        int id, quant; 
        boolean resp=false;

        while(!resp){

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o id do produto:\n");
            id = sc.nextInt();
            System.out.println("Digite a Quantidade desejada:\n");
            quant = sc.nextInt();

            resp = produtoExiste(carrinho, id, quant);
        }
    }

    public void AdicionarProduto(){

        int id;
        String nome;
        double preco;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do produto:\n");
        id = sc.nextInt();
        sc.nextLine();// limpando buffer

        System.out.println("Digite o Nome do produto:\n");
        nome = sc.nextLine();
        System.out.println("Digite o Preço do produto:\n");
        preco = sc.nextDouble();
        Produto produto = new Produto(id, nome, preco);
		produtos.add(produto);
    }

    public void ListarProdutos(){
        for (int i = 0; i < produtos.size(); i++){
            System.out.println("PRODUTO:");
            System.out.print("Id:");
            System.out.println(produtos.get(i).getId());
            System.out.print("Nome:");
            System.out.println(produtos.get(i).getNome());
            System.out.print("Preço:");
            System.out.println(produtos.get(i).getPreco());
            System.out.print("\n");
        }
    }

    public void VerCarrinho(Carrinho carrinho){

        System.out.println("CARRINHO:\n");
         for (int i = 0; i < produtos.size(); i++){

            for (int j = 0; j < carrinho.getItemsize(); j++){
                
                if(produtos.get(i).getId() == carrinho.getItemId(j)){
                    System.out.println("Produto:\n");
                    System.out.print("Id:");
                    System.out.println(produtos.get(i).getId());
                    System.out.print("Nome:");
                    System.out.println(produtos.get(i).getNome());
                    System.out.print("Preço:");
                    System.out.println(produtos.get(i).getPreco());
                    System.out.print("Quant:");
                    System.out.println(carrinho.getItemQuant(j));
                    System.out.print("Subtotal:");
                    System.out.print((produtos.get(i).getPreco()*carrinho.getItemQuant(j)));
                    System.out.print("\n");
                }
            }
        }

        carrinho.setTotal(total(carrinho));
        System.out.print("\nTotal:");
        System.out.println(carrinho.getTotal());
    }

    public boolean produtoExiste(Carrinho carrinho, int id, int quantidade){
        boolean achou = false;
        
        for (int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getId()==id){
                achou = true;
                break;
            }
        }

        if(!achou){
            System.out.println("Id invalido");
            return false;
        }
        else{
        
            for (int i = 0; i < carrinho.getItemsize(); i++){
                
                if(carrinho.getItemId(i)==id){
                   carrinho.setItemQuant(i, (carrinho.getItemQuant(i)+quantidade));
                   System.out.println("Adicionado com sucesso\n");
                   return true;
                }
            }

            carrinho.setItem(id, quantidade);
            System.out.println("Adicionado1 com sucesso\n");
            return true;
        }
        
    }

    public double total(Carrinho carrinho){
        double preco=0.00;

        for (int i = 0; i < produtos.size(); i++){

            for (int j = 0; j < carrinho.getItemsize(); j++){
                
                if(produtos.get(i).getId() == carrinho.getItemId(j)){
                    preco += (produtos.get(i).getPreco()*carrinho.getItemQuant(j));
                }
            }
        }
        return preco;
    }
}
