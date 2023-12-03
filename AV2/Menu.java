package albergue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    
    private ArrayList<Cliente> Clientes = new ArrayList<>();
    private ArrayList<Reserva> Reservas = new ArrayList<>();
    private ArrayList<Quarto> Quartos = new ArrayList<>();
    private ArrayList<Cama> Camas = new ArrayList<>();

    public void processamento(){

        System.out.println("Albergue:");

        opcoes();
        
    }

// Menus de Opções
    public void opcoes(){

        int opcao=0;
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja modificar ?");
            System.out.println("1- Reserva");
            System.out.println("2- Cliente");
            System.out.println("3- Quarto");
            System.out.println("4- Cama");
            System.out.println("5- sair");

            opcao = sc.nextInt();


            switch(opcao){

                case 1: opcoesReserva();
                        break;

                case 2: opcoesCliente();
                        break;

                case 3: opcoesQuarto();
                        break;

                case 4: opcoesCama();
                        break;

                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                        break;

            }

        }while(opcao != 5);
    }
//Menus
    public void opcoesReserva(){

        int opcao=0;
        
        do{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja fazer ?\n");
            System.out.println("1- Incluir Reserva");
            System.out.println("2- Alterar Reserva");
            System.out.println("3- Excluir Reserva");
            System.out.println("4- Listar Reservas");
            System.out.println("5- Voltar ao menu anterior\n");

            opcao = sc.nextInt();


            switch(opcao){
                case 1: incluirReserva();
                        break;

                case 2: alterarReserva();
                        break;

                case 3: excluirReserva();
                        break;

                case 4: listarReservas();
                        break;

                case 5: opcoes();
                        break;

            }

        }while(opcao != 5);
    }

    public void opcoesCliente(){

        int opcao=0;
        
        do{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja fazer ?");
            System.out.println("1- Incluir Cliente");
            System.out.println("2- Alterar Cliente");
            System.out.println("3- Excluir Cliente");
            System.out.println("4- Listar Clientes");
            System.out.println("5- Voltar ao menu anterior");

            opcao = sc.nextInt();

            switch(opcao){
                case 1: incluirCliente();
                        break;
                case 2: alterarCliente();
                        break;
                case 3: excluirCliente();
                        break;
                case 4: listarClientes();
                        break;
                case 5: opcoes();
                        break;

            }

        }while(opcao != 5);
    }

    public void opcoesQuarto(){

        int opcao=0;
        
        do{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja fazer ?");
            System.out.println("1- Incluir Quarto");
            System.out.println("2- Alterar Quarto");
            System.out.println("3- Excluir Quarto");
            System.out.println("4- Listar Quartos");
            System.out.println("5- Voltar ao menu anterior");

            opcao = sc.nextInt();

            switch(opcao){
                case 1: incluirQuarto();
                        break;

                case 2: alterarQuarto();
                        break;

                case 3: excluirQuarto();
                        break;

                case 4: listarQuartos();
                        break;

                case 5: opcoes();
                        break;

            }

        }while(opcao != 5);

    }

    public void opcoesCama(){

        int opcao=0;
        
        do{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja fazer ?");
            System.out.println("1- Incluir Cama");
            System.out.println("2- Alterar Cama");
            System.out.println("3- Excluir Cama");
            System.out.println("4- Listar Camas");
            System.out.println("5- Voltar ao menu anterior");

            opcao = sc.nextInt();

            switch(opcao){
                case 1: incluirCama();
                        break;

                case 2: alterarCama();
                        break;

                case 3: excluirCama();
                        break;

                case 4: listarCamas();
                        break;

                case 5: opcoes();
                        break;

            }

        }while(opcao != 5);
    }

// CRUD Reserva
    public void incluirReserva(){

        int id, idQuarto, idCama, idCliente;
        String dataEntrada, dataSaida;
        boolean valida = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da Reserva:\n");

        do{

            System.out.println("Digite o id da Reserva:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;

                for(Reserva i: Reservas){
                    if(id == i.getId()){
                        System.out.println("O Id informado já existe, Digite Novamente");
                        valida = true;
                        break;
                    }
                }
            }

        }while(valida);
        valida = true;

        
        do{
            System.out.println("Digite o id do Quarto da Reserva:");
            idQuarto = sc.nextInt();

            if(!idValida(idQuarto)){
                System.out.println("Id do Quarto inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{

            System.out.println("Digite o id da Cama da Reserva:");
            idCama = sc.nextInt();

            if(!idValida(idCama)){
                System.out.println("Id da Cama inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
        
            System.out.println("Digite o id do Cliente:");
            idCliente = sc.nextInt();

            if(!idValida(idCliente)){
                System.out.println("Id do Cliente inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        do{
            System.out.println("Digite a Data da Entrada da Reserva (DD/MM/AAAA):");
            dataEntrada = sc.nextLine();
            if(!dataValida(dataEntrada)){
                System.out.println("Data inválida, Digite Novamente");
            }else{
                valida = false;
            }
        }while(valida);
        valida = true;

        do{
            System.out.println("Digite a Data da Saida da Reserva (DD/MM/AAAA):");
            dataSaida = sc.nextLine();
            if(!dataValida(dataSaida)){
                System.out.println("Data inválida, Digite Novamente");
            }else{
                valida = false;
            }
        }while(valida);

        Reserva Reserva = new Reserva(id, idQuarto, idCama, idCliente, dataEntrada, dataSaida);
        Reservas.add(Reserva);
    }

    public void alterarReserva(){

        int id, idQuarto, idCama, idCliente;
        String dataEntrada, dataSaida;
        boolean achou = false, valida = true;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Entre com o id da Reserva que deseja alterar:");
            id = sc.nextInt();

            if(!idValida(id)){
                    System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;
            }
        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        for(Reserva i: Reservas){
            if(i.getId() == id){
                System.out.println("Reserva encontrada, entre com as dados a seguir:");

                do{
                    System.out.println("Digite o id do Quarto da Reserva:");
                    idQuarto = sc.nextInt();

                    if(!idValida(idQuarto)){
                        System.out.println("Id do Quarto inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setIdQuarto(idQuarto);

                do{

                    System.out.println("Digite o id da Cama da Reserva:");
                    idCama = sc.nextInt();

                    if(!idValida(idCama)){
                        System.out.println("Id da Cama inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setIdCama(idCama);

                do{
                
                    System.out.println("Digite o id do Cliente:");
                    idCliente = sc.nextInt();

                    if(!idValida(idCliente)){
                        System.out.println("Id do Cliente inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setIdCliente(idCliente);

                sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

                do{
                    System.out.println("Digite a Data da Entrada da Reserva (DD/MM/AAAA):");
                    dataEntrada = sc.nextLine();
                    if(!dataValida(dataEntrada)){
                        System.out.println("Data inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }
                }while(valida);
                valida = true;
                i.setDataEntrada(dataEntrada);

                do{
                    System.out.println("Digite a Data da Saida da Reserva (DD/MM/AAAA):");
                    dataSaida = sc.nextLine();
                    if(!dataValida(dataSaida)){
                        System.out.println("Data inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }
                }while(valida);
                valida = true;
                i.setDataSaida(dataSaida);

                achou = true;
                break;
            }
        }

        if(!achou){ 
            System.out.println("Reserva não encontrada, verifique o id");
        }
       
    }

    public void excluirReserva(){

        int id;
        Scanner sc = new Scanner(System.in);
        boolean achou = false, valida = true;

        do{

            System.out.println("Entre com o id da Reserva que deseja excluir:");
            id = sc.nextInt();
            if(!idValida(id)){
                        System.out.println("Id inválido, Digite Novamente\n");
            }else{
                valida = false;
            }
        }while(valida);

        for(Reserva i: Reservas){
            if(i.getId() == id){
                Reservas.remove(i);
                System.out.println("Reserva Removida com Sucesso\n");
                achou = true;
                break;
            }
        }
        if(!achou){
        System.out.println("Reserva não encontrada, verifique o id\n");
        }
    }

    public void listarReservas(){

        boolean achou = false;

        System.out.println("Reservas Existentes:\n");

        for(Reserva i: Reservas){
            System.out.println("Reserva:\n");

            System.out.println("Id:" + i.getId());

            System.out.println("Id Quarto:" + i.getIdQuarto());

            System.out.println("Id Cama:" + i.getIdCama());

            System.out.println("Id Clinte:" + i.getIdCliente());

            System.out.println("Data de Entrada:" + i.getDataEntrada());

            System.out.println("Data de Saida:" + i.getDataSaida() + "\n");

            achou = true;

        }

        if(!achou){
            System.out.println("Não há Reservas\n");
        }
    }

// CRUD Cliente
    public void incluirCliente(){

        int id;
        String nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento;
        boolean valida = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do Cliente:\n");
        

        do{
            System.out.println("Digite o id do Cliente:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;

                for(Cliente i: Clientes){
                    if(id == i.getId()){
                        System.out.println("O Id informado já existe, Digite Novamente");
                        valida = true;
                        break;
                    }
                }
            }

        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        do{
            System.out.println("Digite o Nome e Sobrenome do Cliente (ex: João Silva):");
            nome = sc.nextLine();
            if(!nomeValida(nome)){
                    System.out.println("Nome inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o Endereco do Cliente:");
            endereco = sc.nextLine();
            if(!palavraValida(endereco)){
                    System.out.println("Endereco inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o CEP do Cliente (ex: 23012-123):");
            postalCode = sc.nextLine();
            if(!cepValida(postalCode)){
                    System.out.println("CEP inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o País do Cliente (ex: Brasil)");
            pais = sc.nextLine();
            if(!palavraValida(pais)){
                    System.out.println("País inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o CPF do Cliente (ex: 123.456.789-00):");
            cpf = sc.nextLine();

            if(!cpfValida(cpf)){
                    System.out.println("CPF inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o Passaporte do Cliente (ex: AB123456):");
            passaporte = sc.nextLine();

            if(!passaporteValida(passaporte)){
                    System.out.println("Passaporte inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o Email do Cliente (ex:Joao@gmail.com)");
            email = sc.nextLine();

            if(!emailValida(email)){
                    System.out.println("Email inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite a Data de Nascimento do Cliente (DD/MM/AAAA)");
            dataNascimento = sc.nextLine();
            if(!dataValida(dataNascimento)){
                System.out.println("Data inválida, Digite Novamente");
            }else{
                valida = false;
            }
        }while(valida);

        Cliente Cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
        Clientes.add(Cliente);
    }

    public void alterarCliente(){
      
        int id;
        String nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento;
        boolean achou = false, valida= true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o id do Cliente que deseja Alterar:");

        do{
            System.out.println("Digite o id do Cliente:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        for(Cliente i : Clientes){
            if(i.getId() == id){
                System.out.println("Cliente Encontrado, entre com os dados a seguir:\n");

                do{
                    System.out.println("Digite o Nome e Sobrenome do Cliente (ex: João Silva):");
                    nome = sc.nextLine();
                    if(!nomeValida(nome)){
                            System.out.println("Nome inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setNome(nome);
                
                do{
                    System.out.println("Digite o Endereco do Cliente:");
                    endereco = sc.nextLine();
                    if(!palavraValida(endereco)){
                            System.out.println("Endereco inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setEndereco(endereco);

                do{
                    System.out.println("Digite o CEP do Cliente (ex: 23012-123):");
                    postalCode = sc.nextLine();
                    if(!cepValida(postalCode)){
                            System.out.println("CEP inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setPostalCode(postalCode);

                do{
                    System.out.println("Digite o País do Cliente (ex: Brasil)");
                    pais = sc.nextLine();
                    if(!cepValida(pais)){
                            System.out.println("País inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setPais(pais);

                do{
                    System.out.println("Digite o CPF do Cliente (ex: 123.456.789-00):");
                    cpf = sc.nextLine();

                    if(!cpfValida(cpf)){
                            System.out.println("CPF inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setCpf(cpf);

                do{
                    System.out.println("Digite o Passaporte do Cliente (ex: AB123456):");
                    passaporte = sc.nextLine();

                    if(!passaporteValida(passaporte)){
                            System.out.println("Passaporte inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setPassaporte(passaporte);

               do{
                    System.out.println("Digite o Email do Cliente (ex: joao@gmail.com)");
                    email = sc.nextLine();

                    if(!emailValida(email)){
                            System.out.println("Email inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setEmail(email);

                do{
                    System.out.println("Digite a Data de Nascimento do Cliente (DD/MM/AAAA)");
                    dataNascimento = sc.nextLine();
                    if(!dataValida(dataNascimento)){
                        System.out.println("Data inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }
                }while(valida);
                i.setDataNascimento(dataNascimento);
                
                achou = true;
                break;
            }
        }

        if(!achou){
            System.out.println("Cliente não Encontrado, Verifique o id\n");
        }

    }

    public void excluirCliente(){

        int id;
        Scanner sc = new Scanner(System.in);
        boolean achou = false, valida = true;
        
        do{
            System.out.println("Entre com o id do Cliente que deseja Excluir:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente\n");
            }else{
                valida = false;
            }

        }while(valida);

        for(Cliente i : Clientes){
            if(i.getId() == id){
                Clientes.remove(i);
                System.out.println("Cliente Removido com sucesso\n");
                achou = true;
                break;
            }
        }

        if(!achou){
            System.out.println("Cliente não Encontrado, Verifique o id\n");
        }

    }

    public void listarClientes(){

        boolean achou = false;
        System.out.println("Clientes Existentes:\n");

        for(Cliente i : Clientes){
            
            System.out.println("Cliente:\n");

            System.out.println("Id:" + i.getId());

            System.out.println("Nome:" + i.getNome());

            System.out.println("Endereço:" + i.getEndereco());

            System.out.println("CEP:" + i.getPostalCode());

            System.out.println("País:" + i.getPais());

            System.out.println("CPF:" + i.getCpf());

            System.out.println("Passaporte:" + i.getPassaporte());

            System.out.println("Email:" + i.getEmail()); 

            System.out.println("Data de Nascimento:" + i.getDataNascimento() + "\n");
            
            achou = true;
        }

        if(!achou){
            System.out.println("Não há Clientes\n");
        }

    }

// CRUD Quarto
    public void incluirQuarto(){

        int id, qtdeCamas;
        String nomeQuarto, descricao, banheiro; 
        Boolean temBanheiro, valida = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do Quarto:\n");

        do{
            System.out.println("Digite o id do Quarto:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;

                for(Quarto i: Quartos){
                    if(id == i.getId()){
                        System.out.println("O Id informado já existe, Digite Novamente");
                        valida = true;
                        break;
                    }
                }
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite a Quantidade de camas no Quarto:");
            qtdeCamas = sc.nextInt();

            if(!idValida(qtdeCamas)){
                System.out.println("Quantidade inválida, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        do{
            System.out.println("Digite o Nome do Quarto:");
            nomeQuarto = sc.nextLine();

            if(!palavraValida(nomeQuarto)){
                System.out.println("Nome do Quarto inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite a Descrição do Quarto:");
            descricao = sc.nextLine();

            if(!palavraValida(descricao)){
                System.out.println("Descrição inválida, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite se o Quarto tem banheiro (true ou false)");
            banheiro = sc.nextLine();

            if(!booleanValida(banheiro)){
                System.out.println("Entrada Inválida, Digite Novamente");
            }else{
                valida = false;
            }

            temBanheiro = Boolean.parseBoolean(banheiro);

        }while(valida);

        Quarto Quarto = new Quarto(id, qtdeCamas, nomeQuarto, descricao, temBanheiro);
        Quartos.add(Quarto);

    }

    public void alterarQuarto(){

        int id, qtdeCamas;
        String nomeQuarto, descricao, banheiro; 
        Boolean temBanheiro, achou = false, valida = true;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite o Id do Quarto que deseja Alterar:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        for(Quarto i: Quartos){
            if(i.getId() == id){

                System.out.println("Quarto Encontrado, entre com os dados a seguir:\n");

                do{
                    System.out.println("Digite a Quantidade de camas no Quarto:");
                    qtdeCamas = sc.nextInt();

                    if(!idValida(qtdeCamas)){
                        System.out.println("Quantidade inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setQtdeCamas(qtdeCamas);

                sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

                do{
                    System.out.println("Digite o Nome do Quarto:");
                    nomeQuarto = sc.nextLine();

                    if(!palavraValida(nomeQuarto)){
                        System.out.println("Nome do Quarto inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setNomeQuarto(nomeQuarto);

                do{
                    System.out.println("Digite a Descrição do Quarto:");
                    descricao = sc.nextLine();

                    if(!palavraValida(descricao)){
                        System.out.println("Descrição inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setDescricao(descricao);

                do{
                    System.out.println("Digite se o Quarto tem banheiro (true ou false)");
                    banheiro = sc.nextLine();

                    if(!booleanValida(banheiro)){
                        System.out.println("Entrada Inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                    temBanheiro = Boolean.parseBoolean(banheiro);

                }while(valida);
                i.setTemBanheiro(temBanheiro);

                achou = true;
                break;
            }
        }
        if(!achou){
            System.out.println("Quarto Nâo Encontrado, Verifique o Id\n");
        }
    }

    public void excluirQuarto(){

        int id;
        boolean achou = false, valida = true;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite o Id do Quarto que deseja Alterar:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);

        for(Quarto i: Quartos){
            if(i.getId() == id){
                Quartos.remove(i);
                achou = true;
                System.out.println("Quarto Removido com Sucesso\n");
                break;
            }
        }
        if(!achou){
            System.out.println("Quarto Não Encontrado, Verifique o Id");
        }

    }

    public void listarQuartos(){

        boolean achou = false;

        System.out.println("Quartos Existentes:\n");

        for(Quarto i: Quartos){

            System.out.println("Quarto:\n");

            System.out.println("Id:" + i.getId());

            System.out.println("Quantidade de Camas" + i.getQtdeCamas());

            System.out.println("Nome do Quarto:" + i.getNomeQuarto());

            System.out.println("Descrição:" + i.getDescricao());

            System.out.println("Tem Banheiro ? " + i.getTemBanheiro()+ "\n");
            
            achou = true;

        }
        if(!achou){
            System.out.println("Não há Quartos\n");
        }
    }

// CRUD Cama
    public void incluirCama(){

        int id, codigoCama;
        Boolean ehBeliche, valida = true;
        String posicao, descricao, beliche;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da Cama:\n");

        do{
            System.out.println("Digite o id da Cama:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;

                for(Cama i: Camas){
                    if(id == i.getId()){
                        System.out.println("O Id informado já existe, Digite Novamente");
                        valida = true;
                        break;
                    }
                }
            }

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite o Codigo da Cama (ex:23):");
            codigoCama = sc.nextInt();

            if(!idValida(codigoCama)){
                System.out.println("Codigo da Cama inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

        do{
            System.out.println("A cama é Beliche ? (true ou false):");
            beliche = sc.nextLine();

            if(!booleanValida(beliche)){
                System.out.println("Entrada inválida, Digite Novamente");
            }else{
                valida = false;
            }

            ehBeliche = Boolean.parseBoolean(beliche);

        }while(valida);
        valida = true;

        do{
            System.out.println("Digite a Posição da Cama (ex: Ao lado da Janela)");
            posicao = sc.nextLine();

            if(!palavraValida(posicao)){
                System.out.println("Posição inválida, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        do{ 
            System.out.println("Digite a Descrição da Cama");
            descricao =  sc.nextLine();

            if(!palavraValida(descricao)){
                System.out.println("Descrição inválida, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);

        Cama Cama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);
        Camas.add(Cama);
    }

    public void alterarCama(){

        int id, codigoCama;
        Boolean ehBeliche, achou = false, valida = true;
        String posicao, descricao, beliche;
       

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite o Id da Cama que deseja Alterar:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente");
            }else{
                valida = false;
            }

        }while(valida);
        valida = true;

        for(Cama i: Camas){
            if(i.getId() == id){

                System.out.println("Cama Encontrada, entre com os dados a seguir:\n");

                do{
                    System.out.println("Digite o Codigo da Cama (ex:23):");
                    codigoCama = sc.nextInt();

                    if(!idValida(codigoCama)){
                        System.out.println("Codigo da Cama inválido, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setCodigoCama(codigoCama);

                sc.nextLine(); // limpar buffer entre inserções de diferentes tipos 

                do{
                    System.out.println("A cama é Beliche ? (true ou false):");
                    beliche = sc.nextLine();

                    if(!booleanValida(beliche)){
                        System.out.println("Entrada inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                    ehBeliche = Boolean.parseBoolean(beliche);

                }while(valida);
                valida = true;
                i.setEhBeliche(ehBeliche);

                do{
                    System.out.println("Digite a Posição da Cama (ex: Ao lado da Janela)");
                    posicao = sc.nextLine();

                    if(!palavraValida(posicao)){
                        System.out.println("Posição inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida);
                valida = true;
                i.setPosicao(posicao);

                do{ 
                    System.out.println("Digite a Descrição da Cama");
                    descricao =  sc.nextLine();

                    if(!palavraValida(descricao)){
                        System.out.println("Descrição inválida, Digite Novamente");
                    }else{
                        valida = false;
                    }

                }while(valida); 
                i.setDescricao(descricao);

                achou = true;
                break;
            }
        }
        if(!achou){
            System.out.println("Cama Nâo Encontrada, Verifique o Id\n");
        }

    }

    public void excluirCama(){

        int id;
        boolean achou = false, valida = true;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite o Id da Cama que deseja Excluir:");
            id = sc.nextInt();

            if(!idValida(id)){
                System.out.println("Id inválido, Digite Novamente\n");
            }else{
                valida = false;
            }

        }while(valida);

        for(Cama i: Camas){
            if(i.getId() == id){

                Camas.remove(i);
                System.out.println("Cama Removida com Sucesso\n");
                achou = true;
                break;
            }
        }

        if(!achou){
            System.out.println("Cama Não Encontrada, Verifique o Id\n");
        }
    }

    public void listarCamas(){

        boolean achou = false;

        System.out.println("Camas Existentes:\n");

        for(Cama i: Camas){

            System.out.println("Cama:\n");

            System.out.println("Id:" + i.getId());

            System.out.println("Codigo da Cama:" + i.getCodigoCama());

            System.out.println("É Beliche:" + i.getEhBeliche());

            System.out.println("Posição da Cama:" + i.getPosicao());

            System.out.println("Descrição:" + i.getDescricao() + "\n");

            achou = true;
        }

        if(!achou){
            System.out.println("Não há Camas\n");
        }
    }

// Verificao

    public boolean idValida(int id){

        if(id>0){
            return true;
        }

        return false;
    }

    public boolean dataValida(String data){

        Pattern pattern = Pattern.compile("^[0-3][0-9]/[0-1][0-9]/[1-2][0-9]{3}$");
        Matcher matcher = pattern.matcher(data);
        boolean matchFound = matcher.find();

        return matchFound;
    }

    public boolean nomeValida(String nome) {
        Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(nome);
        boolean matchFound = matcher.find();

        return matchFound;
    }

    public boolean cepValida(String cep){
        Pattern pattern = Pattern.compile("^[2][0-8][0-9]{3}-[0-9]{3}$");//20000-000 28999-999
        Matcher matcher = pattern.matcher(cep);
        boolean matchFound = matcher.find();

        return matchFound;
    }

    public boolean palavraValida(String palavra){
        Pattern pattern = Pattern.compile( "^[a-z,\\s,0-9]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(palavra);
        boolean matchFound = matcher.find();

        return matchFound;
    }

    public boolean cpfValida(String cpf) {
        Pattern pattern = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$");
        Matcher matcher = pattern.matcher(cpf);
        boolean matchFound = matcher.find();

        return matchFound;
    }

    public boolean passaporteValida(String passaporte){
        
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{6}$");
        Matcher matcher = pattern.matcher(passaporte);
        boolean matchFound = matcher.find();
        return matchFound;

    }

    public boolean emailValida(String email){

        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.com$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    public boolean booleanValida(String palavra){
        Pattern patternTrue = Pattern.compile("true",Pattern.CASE_INSENSITIVE);
        Pattern patternFalse = Pattern.compile("false",Pattern.CASE_INSENSITIVE);
        Matcher matcherTrue = patternTrue.matcher(palavra);
        Matcher matcherFalse = patternFalse.matcher(palavra);

        boolean matchFoundTrue = matcherTrue.find();
        boolean matchFoundFalse = matcherFalse.find();

        return (matchFoundTrue || matchFoundFalse);
    }

}