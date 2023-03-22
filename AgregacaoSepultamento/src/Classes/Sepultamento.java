package Classes;

public class Sepultamento {

    private int idSepultamento;
    private String data;

    public Sepultamento(int idSepultamento, String data) {
        this.idSepultamento = idSepultamento;
        this.data = data;
    }

    public void sepultar(){
        Classes.Corpo.sepultar();
        Classes.Tumulo.ocupar();
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdSepultamento() {
        return idSepultamento;
    }

    public String getData() {
        return data;
    }
}
