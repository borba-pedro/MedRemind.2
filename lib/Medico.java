public class Medico{
  private int codMedico;
  private String nome;
  private String especialidade;

public Medico(int codMedico, String nome, String especialidade){
    this.nome = nome;
    this.especialidade = especialidade;
    this.nome = nome;
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public int getCodMedico() {
    return codMedico;
}

public void setCodMedico(int codMedico) {
    this.codMedico = codMedico;
}

public String getEspecialidade() {
    return especialidade;
}

public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}

@Override
public String toString() {
    return "Medico [codMedico=" + codMedico + ", nome=" + nome + ", especialidade=" + especialidade + "]";
}

}