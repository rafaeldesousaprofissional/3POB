package instaciaAluno;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de alunos.");

        Aluno aluno1 = CriarAluno.criarNovoAluno();
        Aluno aluno2 = CriarAluno.criarNovoAluno();

        System.out.println("\nDados do Primeiro aluno:");
        System.out.println(aluno1);

        System.out.println("\nDados do Segundo aluno:");
        System.out.println(aluno2);
    }
}

class CriarAluno {
    public static Aluno criarNovoAluno() {
    	String nome, email;
    	int matricula, idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome do aluno: ");
        nome = sc.nextLine();
        
        System.out.print("Digite o Email do aluno: ");
        email = sc.nextLine();

        System.out.print("Digite a Matricula do aluno: ");
        matricula = sc.nextInt();
        
        System.out.print("Digite a Idade do aluno: ");
        idade = sc.nextInt();

        return new Aluno(nome, email, matricula, idade);
    }
}
