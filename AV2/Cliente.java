package albergue;

public class Cliente {
    private int id;
    private String nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento;

    public Cliente( int id, String nome, String endereco, String postalCode, String pais, String cpf, 
    String passaporte, String email, String dataNascimento){

        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.postalCode = postalCode;
        this.pais = pais;
        this.cpf = cpf;
        this.passaporte = passaporte;
        this.email = email;
        this.dataNascimento = dataNascimento;
        
    }

    public int getId() {
            return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPais() {
        return pais;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}


