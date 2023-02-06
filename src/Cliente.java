public class Cliente {
    private String nome;
    private String cps;
    private String fone;

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

    public String getCps() {
        return cps;
    }

    public void setCps(String cps) {
        this.cps = cps;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
