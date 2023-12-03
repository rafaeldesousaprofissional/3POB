package albergue;

public class Quarto {
    private int id, qtdeCamas;
    private String nomeQuarto, descricao; 
    private Boolean temBanheiro;

    public Quarto(int id, int qtdeCamas, String nomeQuarto, String descricao, Boolean temBanheiro){

        this.id = id;
        this.qtdeCamas = qtdeCamas;
        this.nomeQuarto = nomeQuarto;
        this.descricao = descricao;
        this.temBanheiro = temBanheiro;

    }

    public int getId() {
            return id;
    }

    public int getQtdeCamas() {
        return qtdeCamas;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTemBanheiro() {
        return temBanheiro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdeCamas(int qtdeCamas) {
        this.qtdeCamas = qtdeCamas;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTemBanheiro(Boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }
}
