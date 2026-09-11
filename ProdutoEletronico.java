public class ProdutoEletronico extends Produto{
    protected Integer garantiaMeses;

    public ProdutoEletronico(String nome, Double preco,Integer garantiaMeses){
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }
    @Override
    public Double calcularDesconto() {
        return preco*0.10;
    }
    @Override
    public void mostrarDetalheEspecifico() {
        System.out.println("Garantia: " + garantiaMeses + " meses"+"\n");
    }
}
