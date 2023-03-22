package Classes;

public class Tumulo {

    private int idTumulo;
    private String localizacao;
    private boolean ocupado;

    public Tumulo(int idTumulo, String localizacao, boolean ocupado) {
        this.idTumulo = idTumulo;
        this.localizacao = localizacao;
        this.ocupado = ocupado;
    }

    public static void ocupar(){
        String tumulo;
        tumulo = "Ocupado";
    }

    public void desocupar(){
        String tumulo;
        tumulo = "Desocupado";
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getIdTumulo() {
        return idTumulo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
