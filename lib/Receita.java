import java.util.Date;
import java.util.List;

public class Receita {

    private int codReceita;
    private Date dataReceita;
    private Medico medico;
    private Paciente paciente;
    private List<Medicamento> medicamento;
    private String dosagem;
    public int getCodReceita() {
        return codReceita;
    }
    public void setCodReceita(int codReceita) {
        this.codReceita = codReceita;
    }
    public Date getDataReceita() {
        return dataReceita;
    }
    public void setDataReceita(Date dataReceita) {
        this.dataReceita = dataReceita;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public List<Medicamento> getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
    public String getDosagem() {
        return dosagem;
    }
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    @Override
    public String toString() {
        return "Receita [codReceita=" + codReceita + ", dataReceita=" + dataReceita + ", medico=" + medico
                + ", paciente=" + paciente + ", medicamento=" + medicamento + ", dosagem=" + dosagem + "]";
    }
    
}
