public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        
        // Criando datas de nascimento
        Data data1 = new Data(15, 5, 1980);
        Data data2 = new Data(22, 11, 1992);
        Data data3 = new Data(3, 7, 1975);
        
        // Cadastrando pessoas
        cadastro.cadastraPessoa(new Cliente("João Silva", data1, 1001));
        cadastro.cadastraPessoa(new Gerente("Maria Souza", data2, 8500.0f, "Vendas"));
        cadastro.cadastraPessoa(new Funcionario("Carlos Oliveira", data3, 3500.0f) {
            @Override
            public float calculaImposto() {
                return salario * 0.03f; // 3% de imposto
            }

            @Override
            public void imprimeDados() {
                System.out.println("Funcionário: " + nome);
                System.out.println("Data de Nascimento: " + nascimento);
                System.out.println("Salário: R$" + salario);
                System.out.println("Imposto: R$" + calculaImposto());
            }
        });
        
        // Imprimindo cadastro
        cadastro.imprimeCadastro();
    }
}