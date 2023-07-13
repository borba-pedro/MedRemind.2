public class Paciente {
    private int codIdentificacao;
    private String email;
    private String senha;
    private String nome;
    private String idade;
    private String cpf;
    private String telefone;


    public Paciente(int codIdentificacao, String email, String senha, String nome, String idade, String cpf, String  telefone){
        this.codIdentificacao = codIdentificacao;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;    
    }


    public int getCodIdentificacao() {
        return codIdentificacao;
    }


    public void setCodIdentificacao(int codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdade() {
        return idade;
    }


    public void setIdade(String idade) {
        this.idade = idade;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Paciente [codIdentificacao=" + codIdentificacao + ", email=" + email + ", senha=" + senha + ", nome="
                + nome + ", idade=" + idade + ", cpf=" + cpf + ", telefone=" + telefone + "]";
    }

}
