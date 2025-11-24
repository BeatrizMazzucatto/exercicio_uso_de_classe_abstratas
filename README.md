# Exercício - Uso de Classes Abstratas

Este projeto demonstra a implementação de classes abstratas em Java através de um sistema de cadastro de pessoas, explorando herança, polimorfismo e métodos abstratos.

## 📋 Descrição

O projeto implementa um sistema de cadastro que gerencia diferentes tipos de pessoas (clientes, gerentes e funcionários), utilizando classes abstratas para definir comportamentos comuns e específicos através de herança.

## 🗂️ Estrutura do Projeto

```
exercicio_uso_de_classe_abstratas/
├── Pessoa.java              # Classe abstrata base
├── Cliente.java             # Classe concreta (herda de Pessoa)
├── Funcionario.java         # Classe abstrata (herda de Pessoa)
├── Gerente.java            # Classe concreta (herda de Funcionario)
├── Data.java               # Classe utilitária para datas
├── CadastroPessoas.java    # Gerenciador de cadastros
├── TestaCadastro.java      # Classe principal com testes
└── README.md               # Este arquivo
```

## 🎯 Classes Implementadas

### Pessoa (Abstrata)
* Classe base para todos os tipos de pessoas
* Atributos: `nome`, `nascimento`
* Método abstrato: `imprimeDados()`
* Objetivo: Definir estrutura comum para todas as pessoas

### Cliente (Concreta)
* Herda de `Pessoa`
* Atributo adicional: `codigo`
* Implementa `imprimeDados()` exibindo dados específicos do cliente

### Funcionario (Abstrata)
* Herda de `Pessoa`
* Atributo: `salario`
* Método abstrato: `calculaImposto()`
* Objetivo: Base para diferentes tipos de funcionários com cálculo de imposto específico

### Gerente (Concreta)
* Herda de `Funcionario`
* Atributo adicional: `area`
* Implementa `calculaImposto()` com taxa de 5%
* Implementa `imprimeDados()` com informações completas incluindo imposto

### Data
* Classe utilitária para representar datas
* Atributos: `dia`, `mes`, `ano`
* Sobrescreve `toString()` para formatação dd/mm/aaaa

### CadastroPessoas
* Gerencia uma lista de pessoas usando `ArrayList`
* Método `cadastraPessoa()`: Adiciona pessoas ao cadastro
* Método `imprimeCadastro()`: Exibe todas as pessoas cadastradas

## 🚀 Como Executar

### Pré-requisitos
* Java JDK 8 ou superior
* Compilador Java (javac)

### Compilação

```bash
javac Data.java Pessoa.java Cliente.java Funcionario.java Gerente.java CadastroPessoas.java TestaCadastro.java
```

### Execução

```bash
java TestaCadastro
```

## 📊 Exemplo de Saída

```
=== CADASTRO DE PESSOAS ===
Quantidade: 3

Cliente: João Silva
Data de Nascimento: 15/5/1980
Código: 1001

Gerente: Maria Souza
Data de Nascimento: 22/11/1992
Área: Vendas
Salário: R$8500.0
Imposto: R$425.0

Funcionário: Carlos Oliveira
Data de Nascimento: 3/7/1975
Salário: R$3500.0
Imposto: R$105.0
```

## 🔍 Conceitos Abordados

* **Classes Abstratas**: Definição de estruturas que não podem ser instanciadas diretamente
* **Métodos Abstratos**: Métodos sem implementação que devem ser implementados pelas subclasses
* **Herança**: Reutilização de código através de hierarquia de classes
* **Polimorfismo**: Tratamento uniforme de objetos de diferentes tipos através da classe base
* **Classes Anônimas**: Criação de implementação de `Funcionario` diretamente no `TestaCadastro`
* **ArrayList**: Uso de coleções para gerenciar múltiplos objetos
* **Override**: Sobrescrita de métodos (`imprimeDados()`, `toString()`)
* **Encapsulamento**: Uso de modificadores `protected` para atributos herdados

## 📚 Hierarquia de Classes

```
Pessoa (abstract)
├── Cliente
└── Funcionario (abstract)
    └── Gerente
```

## 💡 Destaques da Implementação

### Classe Anônima
O projeto demonstra o uso de classe anônima no `TestaCadastro.java` para criar um funcionário genérico sem necessidade de criar uma classe separada:

```java
new Funcionario("Carlos Oliveira", data3, 3500.0f) {
    @Override
    public float calculaImposto() {
        return salario * 0.03f; // 3% de imposto
    }
    
    @Override
    public void imprimeDados() {
        // Implementação específica
    }
}
```

### Polimorfismo em Ação
O `CadastroPessoas` armazena objetos de diferentes tipos (`Cliente`, `Gerente`, `Funcionario`) em uma única lista do tipo `Pessoa`, demonstrando o poder do polimorfismo.

## 🎓 Aprendizados

Este projeto demonstra como classes abstratas podem:
* Definir contratos que subclasses devem seguir
* Permitir reutilização de código através de herança
* Facilitar a extensibilidade do sistema
* Garantir implementação obrigatória de métodos específicos
* Possibilitar tratamento uniforme de objetos relacionados

## 👨‍💻 Tecnologias

* Java 8+
* Collections Framework (ArrayList)
* Programação Orientada a Objetos
* Classes Abstratas e Métodos Abstratos

---

**Nota**: Este exercício demonstra os fundamentos de programação orientada a objetos em Java, sendo ideal para compreender herança, polimorfismo e o uso de classes abstratas em cenários práticos.
