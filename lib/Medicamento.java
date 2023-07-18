
public class Medicamento {
    private String nomeRemedio;
    private String dataDeValidade;
    

public String getNomeRemedio() {
    return nomeRemedio;
}



public void setNomeRemedio(String nomeRemedio) {
    this.nomeRemedio = nomeRemedio;
}



public String getDataDeValidade() {
    return dataDeValidade;
}



public void setDataDeValidade(String dataDeValidade) {
    this.dataDeValidade = dataDeValidade;
}

@Override
    public String toString() {
        return "Medicamento [nomeRemedio=" + nomeRemedio + ", dataDeValidade=" + dataDeValidade + "]";
    }

}
