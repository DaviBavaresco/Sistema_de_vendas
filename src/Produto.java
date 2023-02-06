public class Produto {
    private float valor;
    private int estoque;
    private String nome;
    private int codigo;
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo<0){
            throw new RuntimeException("Codigo nulo");
        }
        this.codigo = codigo;
    }

    public Produto(float valor, int estoque, String nome, int codigo) {
        this.valor = valor;
        this.estoque = estoque;
        this.nome = nome;
        this.codigo = codigo;
    }
    public void decrementaEstoque(){
        if(this.estoque==0){
            throw new RuntimeException("Produto com estoque zero");
        }
        this.estoque--;
    }
}
