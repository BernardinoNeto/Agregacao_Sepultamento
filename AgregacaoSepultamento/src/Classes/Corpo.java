package Classes;

public class Corpo {

    private int idCorpo;
    private String nome;
    private static String situacao = "Aguardando Sepulpamento";

    public Corpo(int idCorpo, String nome, String situacao) {
        this.idCorpo = idCorpo;
        this.nome = nome;
        this.situacao = situacao;
    }

    public static void sepultar(){
        situacao = "SEPULTADO";
    }

    public static void exumar(){
        situacao = "EXUMADO";
    }

    public int getIdCorpo() {
        return idCorpo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
