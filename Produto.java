public class Produto {
    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void exibirInfo(){
        System.out.printf("\nNome do produto: %s\nPreço:%.3f\n",nome,preco);
    }
    public Double calcularDesconto(){
        return preco*0.05;
    }
    public void mostrarDetalheEspecifico() {
        System.out.println("Sem detalhes adicionais.");
    }
}
