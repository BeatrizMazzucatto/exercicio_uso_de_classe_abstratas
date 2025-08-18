import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas;
    private int qtdAtual;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
        this.qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pess) {
        pessoas.add(pess);
        qtdAtual++;
    }

    public void imprimeCadastro() {
        System.out.println("\n=== CADASTRO DE PESSOAS ===");
        System.out.println("Quantidade: " + qtdAtual + "\n");
        
        for (Pessoa p : pessoas) {
            p.imprimeDados();
            System.out.println();
        }
    }
}