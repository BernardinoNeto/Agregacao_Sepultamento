package Classes;

public class Exumacao {

    private int idExumacao;
    private String data;

    public Exumacao(int idExumacao, String data) {
        this.idExumacao = idExumacao;
        this.data = data;
    }

    public void exumar(){
        Classes.Corpo.exumar();
        Classes.Tumulo.ocupar();
    }

    public int getIdExumacao() {
        return idExumacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
