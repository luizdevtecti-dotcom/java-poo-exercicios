# Sistema de Produtos — Exercício de POO em Java

Exercício prático de Programação Orientada a Objetos em Java, aplicando **encapsulamento**, **herança** e **polimorfismo** através de uma hierarquia de classes de produtos.

## 💡 Conceitos demonstrados

- **Encapsulamento**: atributos `protected` na classe base `Produto`, acessados por métodos.
- **Herança**: `ProdutoEletronico` e `ProdutoAlimenticio` estendem `Produto`, reaproveitando `nome` e `preco` via `super()`.
- **Polimorfismo**: os métodos `calcularDesconto()` e `mostrarDetalheEspecifico()` são sobrescritos (`@Override`) em cada subclasse, com comportamento próprio, mas chamados de forma genérica através de um array de `Produto`.

## 🗂️ Estrutura

```
├── Main.java               # Classe principal — cria os produtos e percorre o array
├── Produto.java             # Classe base (nome, preço, exibirInfo, calcularDesconto)
├── ProdutoEletronico.java   # Subclasse — garantia em meses, desconto de 10%
└── ProdutoAlimenticio.java  # Subclasse — data de validade, desconto de 2%
```

## ⚙️ Como funciona

1. `Produto` define os atributos comuns (`nome`, `preco`) e dois métodos que as subclasses sobrescrevem: `calcularDesconto()` (desconto padrão de 5%) e `mostrarDetalheEspecifico()`.
2. `ProdutoEletronico` adiciona `garantiaMeses` e aplica 10% de desconto.
3. `ProdutoAlimenticio` adiciona `dataValidade` e aplica 2% de desconto.
4. Em `Main`, um array de `Produto` guarda objetos dos dois tipos. O laço `for` chama `exibirInfo()` e `mostrarDetalheEspecifico()` para cada um — cada objeto executa sua própria versão do método, sem precisar saber o tipo concreto (polimorfismo em ação).
5. Um segundo laço calcula e exibe o desconto de cada produto.

## ▶️ Como rodar

```bash
javac Main.java Produto.java ProdutoEletronico.java ProdutoAlimenticio.java
java Main
```

## 📚 Contexto

Exercício desenvolvido durante os estudos de Java/POO, parte de um roteiro de aprendizado estruturado (encapsulamento → herança → polimorfismo).
