package albergue;

public class Reserva {
    private int id, idQuarto, idCama, idCliente;
    private String dataEntrada, dataSaida;

    public Reserva(int id, int idQuarto, int idCama, int idCliente, String dataEntrada, String dataSaida){

        this.id = id;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.idCliente = idCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getId() {
            return id;
    }
    
    public int getIdQuarto() {
        return idQuarto;
    }

    public int getIdCama() {
        return idCama;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}
