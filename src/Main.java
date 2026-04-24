import model.Cliente;
import model.Aluguel;
import model.Filme;


public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Vinicius", "(55) +35 9894-2122");

        Filme filme = new Filme ("Duna: Parte Dois", 10.0,"Ficção Cientifica, Drama");
        filme.aplicardesconto(5);

        Aluguel aluguel = new Aluguel(cliente, filme, 4);

        System.out.println(filme.exibirdetalhes());
        System.out.println(aluguel.getResumo());
        System.out.println(cliente.apresentar());
    }
}