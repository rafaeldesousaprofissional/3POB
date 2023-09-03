package instaciaAluno;

public class Aluno {
    private String nome, email;
    private int id, idade, matricula;
    
    public Aluno(String nome, String email, int matricula, int idade) {
    	super();
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.idade = idade;
    }
    
    public Aluno(){
    	super();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public int getId() {
		return id;
	}
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString() {
        return "Dados Aluno:\n\nNome: " + nome + "\nEmail: "+ email +"\nMatricula: "+ matricula +"\nIdade:" + idade + "";
    }
}
