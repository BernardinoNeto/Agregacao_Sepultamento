package Classes;

public class AppSepultamento {

    public static void main(String[] args) {

        Sepultamento sepultamento = new Sepultamento(20, "18/06/2020");
        Exumacao exumacao = new Exumacao(30, "18/08/2022");
        Corpo corpo = new Corpo(10,"João Alfredo Dantas", "Aguardando Sepultamento");

        System.out.printf("\nIdentificador do Corpo.......: %d", corpo.getIdCorpo());
        System.out.printf("\nNome da Pessoa...............: %s", corpo.getNome());
        System.out.printf("\nSituação do Corpo............: %s", corpo.getSituacao());
        System.out.println();

        sepultamento.sepultar();
        System.out.printf("\nDADOS DO SEPULPAMENTO");
        System.out.printf("\nIdentificador do Sepultamento: %d", sepultamento.getIdSepultamento());
        System.out.printf("\nNome da Pessoa...............: %s", corpo.getNome());
        System.out.printf("\nData do Sepultamento.........: %s", sepultamento.getData());
        System.out.printf("\nSituação do Corpo............: %s", corpo.getSituacao());
        System.out.println();

        exumacao.exumar();
        System.out.printf("\nDADOS DA EXUMAÇÃO");
        System.out.printf("\nIdentificador da Exumação....: %d", exumacao.getIdExumacao());
        System.out.printf("\nNome da Pessoa...............: %s", corpo.getNome());
        System.out.printf("\nData do Sepultamento.........: %s", exumacao.getData());
        System.out.printf("\nSituação do Corpo............: %s", corpo.getSituacao());

    }
}
