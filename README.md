# java-poo-exercicios

Esses são exercícios que fui fazendo pra treinar Programação Orientada a Objetos em Java. A ideia principal foi a classe `Produto`, que depois eu especializei em `ProdutoEletronico` e `ProdutoAlimenticio`, cada um com seu próprio jeito de calcular desconto e mostrar detalhes.

## O que tem aqui

- `Produto.java` — a classe base, com nome, preço e os métodos que as outras duas sobrescrevem
- `ProdutoEletronico.java` — adiciona garantia em meses, desconto de 10%
- `ProdutoAlimenticio.java` — adiciona data de validade, desconto de 2%
- `Main.java` — cria os produtos e percorre tudo num array

## O que eu treinei com isso

Encapsulamento (atributos protegidos, acesso por método), herança (as duas classes usando `super()` pra reaproveitar nome/preço da classe mãe) e polimorfismo (o `mostrarDetalheEspecifico()` e o `calcularDesconto()` fazem coisa diferente dependendo do objeto, mesmo chamando do mesmo jeito no loop).

## Como rodar

```
javac Main.java Produto.java ProdutoEletronico.java ProdutoAlimenticio.java
java Main
```

---
Feito durante meus estudos de Java/POO no curso técnico.
