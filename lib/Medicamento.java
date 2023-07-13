
public class Medicamento {
    private String nomeRemedio;
    private String dataDeValidade;
    private String dosagem;



   public Medicamento(String nomeRemedio, String dataDeValidade, String dosagem){
    this.nomeRemedio = nomeRemedio;
    this.dataDeValidade = dataDeValidade;
    this.dosagem = dosagem;
   }



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



public String getDosagem() {
    return dosagem;
}



public void setDosagem(String dosagem) {
    this.dosagem = dosagem;
}



@Override
public String toString() {
    return "Medicamento [nomeRemedio=" + nomeRemedio + ", dataDeValidade=" + dataDeValidade + ", dosagem=" + dosagem
            + "]";
}
}
