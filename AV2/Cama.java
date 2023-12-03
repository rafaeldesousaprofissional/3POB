package albergue;

public class Cama {
    private int id, codigoCama;
    private Boolean ehBeliche;
    private String posicao, descricao;

    public Cama(int id, int codigoCama, Boolean ehBeliche, String posicao, String descricao){

        this.id = id;
        this.codigoCama = codigoCama;
        this.ehBeliche = ehBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
    }

    public int getId() {
            return id;
    }

    public int getCodigoCama() {
        return codigoCama;
    }

    public Boolean getEhBeliche() {
        return ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoCama(int codigoCama) {
        this.codigoCama = codigoCama;
    }

    public void setEhBeliche(Boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}