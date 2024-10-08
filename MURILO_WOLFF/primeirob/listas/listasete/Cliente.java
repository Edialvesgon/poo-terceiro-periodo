package MURILO_WOLFF.primeirob.listas.listasete;

public class Cliente extends Pessoa {

    public Cliente(String nome, int idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    @Override
    public void apresentarse() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
        getEndereco().apresentarLogradouro();
    }
}