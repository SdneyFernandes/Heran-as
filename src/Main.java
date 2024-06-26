import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //objecto Pessoa
        Pessoa pessoa = new Pessoa("Sdney", "Frei Miguel, 10", "71968425794");
        System.out.print("Pessoa: " + pessoa.toString());

        //objecto PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica("Maria", "Baixa Fria, 85", "71992032184", "102564650-20", new Date(1999, 01 , 23));
        System.out.print("Pessoa Física: " + pessoaFisica.toString());

        //objecto PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa JP", "Luanda 54", "71845963526", "54869574215632", "4857965418");
        System.out.print("Pessoa Juridica: " + pessoaJuridica.toString());
        }
    }
