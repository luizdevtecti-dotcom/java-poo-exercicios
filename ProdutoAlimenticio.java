public class ProdutoAlimenticio extends Produto {
    protected String dataValidade;

    public ProdutoAlimenticio(String nome, Double preco, String dataValidade){
        super(nome,preco);
        this.dataValidade = dataValidade;
    }
    @Override
    public Double calcularDesconto(){
        return preco*0.02;
    }
    @Override
    public void mostrarDetalheEspecifico() {
        System.out.println("Validade: " + dataValidade+"\n");
    }
}
