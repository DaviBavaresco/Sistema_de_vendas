public class Main {
    public static void main(String[] args) {
        Produto p1= new Produto(12.75,20,"Mouse",1);
        Produto p2= new Produto(500,5,"Monitor",2);
        Produto p3= new Produto(75.50,20,"Teclado",3);

        Cliente c1= new Cliente("João","004.220.430.82","(51)99858-1515");

        Nota_Fiscas n1= new Nota_Fiscas(1,c1);
        n1.incluirProduto(p1);
        n1.incluirProduto(p2);
        n1.incluirProduto(p3);
        n1.getCopiaProdutos();
        n1.imprimeNota();
        System.out.println("teste 1");
    }
}