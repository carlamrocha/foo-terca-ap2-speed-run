import java.util.ArrayList;

public class CompaniaAerea {
    private String nome;
    private String descricao;
    ArrayList<Aviao>aviaos = new ArrayList<>();

    public CompaniaAerea() {
    }

    public CompaniaAerea(String nome, String descricao, ArrayList<Aviao> aviaos) {
        this.nome = nome;
        this.descricao = descricao;
        this.aviaos = aviaos;
    }

    public CompaniaAerea(String nome, String descricao) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Aviao> getAviaos() {
        return aviaos;
    }

    public void setAviaos(ArrayList<Aviao> aviaos) {
        this.aviaos = aviaos;
    }

    @Override
    public String toString() {
        return "CompaniaAerea{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", aviaos=" + aviaos +
                '}';
    }
}
