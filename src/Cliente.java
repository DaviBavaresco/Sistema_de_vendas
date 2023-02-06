public class Cliente {
    private String nome;
    private String cpf;
    private String fone;

    public Cliente(String nome, String cps, String fone) {
        this.nome = nome;
        this.cpf = cps;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
        throw new RuntimeException("Nome nulo");
        }
        if(nome.length()<3){
            throw new RuntimeException("Nome com menos de 3 caracteres");
        }

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
