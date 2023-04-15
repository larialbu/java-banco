import java.util.ArrayList;

public class Cliente {
    private String cpf;
    private String nome;
    private ArrayList<Conta> contas;
    private Endereco endereco;
    private ArrayList<Telefone> telefone;

    public Cliente(String cpf, String nome, Endereco endereco, ArrayList<Conta> conta) {
        this.cpf = cpf;
        this.nome = nome;
        this.contas = conta;
        this.endereco = endereco;
        this.telefone = new ArrayList<Telefone>();
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefone;
    }

    public void setTelefones(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void addTelefone(Telefone telefone) {
        this.telefone.add(telefone);
    }
}
