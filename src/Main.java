import java.util.Scanner;

class Carro extends Veiculo {
    private String modelo="Uno";
    public static void main(String[] args) {
        Scanner nomeScanner = new Scanner(System.in);
        Cliente c001 = new Cliente();
        Carro aLenda = new Carro();
        Gato meuGato = new Gato();
        petGato newGato = new petGato();


        System.out.println("Insira o nome do cliente: ");
        c001.setNome(String.valueOf(nomeScanner.next()));
        System.out.println("O nome do cliente é: " + c001.getNome());
        System.out.println("O cliente possui um " +aLenda.marca+ " " +aLenda.modelo+ " "+ aLenda.ano+ ", vulgo 'Lenda'");
        aLenda.bozina();
        System.out.println("A buzina do Lenda assustou o gato, fazendo ele gritar:");
        meuGato.susto();
        System.out.println("Normalmente, ele  dorme e faz ");
        meuGato.onomatopeia();
        meuGato.dorme();
        newGato.nome();
        newGato.especie();
        newGato.raca();

    }
}