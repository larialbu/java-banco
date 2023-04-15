import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        // Criando um endereço
        Endereco endereco = new Endereco("12345-678", "Rua Principal", 100);

        // Criando dois telefones
        Telefone telefone1 = new Telefone("11", "99999-9999");
        Telefone telefone2 = new Telefone("11", "88888-8888");

        // Criando uma conta
        Conta conta = new Conta(123, "001", 1000.0);

        // Adicionando a conta à lista de contas do cliente
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);

        // Criando um cliente
        Cliente cliente = new Cliente("123.456.789-00", "Fulano de Tal", endereco, contas);
        cliente.addTelefone(telefone1);
        cliente.addTelefone(telefone2);

        // Imprimindo informações do cliente
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco().getLogradouro() + ", " +
                        cliente.getEndereco().getNumero() + " - " + cliente.getEndereco().getCep());
        System.out.println("Telefones:");
        for (Telefone telefone : cliente.getTelefones()) {
            System.out.println("  " + telefone.getDdd() + " " + telefone.getNumero());
        }
        System.out.println("Contas:");
        for (Conta c : cliente.getContas()) {
            System.out.println("  " + c.getAgencia() + " " + c.getNumero() + " " + c.getSaldo());
        }
    }
}