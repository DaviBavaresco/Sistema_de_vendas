import java.util.ArrayList;
import java.util.List;

public class Nota_Fiscas {
    private int numero;
    private Cliente cliente;
    private List<Produto> produtos;




    public Nota_Fiscas(int numero, Cliente cliente) {

        this.numero = numero;
        this.cliente = cliente;
        produtos=new ArrayList<Produto>();
    }


public List<Produto> getProdutos(){
    return produtos;
}

public List<Produto> getCopiaProdutos(){
        List<Produto> copia= new ArrayList<Produto>();
        for(Produto p: produtos){copia.add(p);}
        return copia;
}

//Diversos métodos para não burlar o produto e ocorrer erros na compra
public void incluirProduto(Produto p){
    if(p== null){
        throw new RuntimeException("Produto nulo");
    }
    if(produtos.contains(p)){
        throw new RuntimeException("Nota fiscal ja contem este produto");
    }
    if(p.getEstoque()<=0){
        throw new RuntimeException("Produto fora de estoque");
    }
    p.decrementaEstoque();
    produtos.add(p);
}

public void removerProduto(Produto p){
    produtos.remove(p);
}
private void setNumero(int numero){
        if(numero<=0){
            throw new RuntimeException("Erro: Nota fiscal com numero nulo ou igual a zero");
        }
        else{
            this.numero=numero;
        }
}

private void setCliente(Cliente cliente){
        if(cliente==null){
            throw new RuntimeException("Erro: Cliente nulo");
        }
        else{
            this.cliente=cliente;
        }
}

public int getNumero(){
        return numero;
}
public float valorProdutos() {
    float val = 0;
    for (Produto aux : produtos) {
        val += aux.getValor();
    }
    return val;
}
    public void imprimeNota() {
        System.out.println("---------- Nota Fiscal n. " + getNumero() + " ----------");
        System.out.println("Cliente: "+cliente.getNome() + ", CPF:"+cliente.getCpf() + ", Fone:"+cliente.getFone());
        System.out.println("Produtos");
        System.out.println(getCopiaProdutos());

        System.out.printf("Valor Produtos     = %16.2f\n", valorProdutos());

        System.out.println("--------------------");
    }
}




