package TREINO;

public class Livro {
    private String id;
    private String nome;
    private String editora;
    protected boolean statusAlugado;
    private String nomeLocatario;



    public Livro(String _id, String _nome, String _editora){
        this.id = _id;
        this.nome = _nome;
        this.editora = _editora;
        this.statusAlugado = false;
    }

    public void setStatus(boolean s){
        this.statusAlugado = s;
    }

    public void setNomeLocatario(String _nome){
        this.nomeLocatario = _nome;
    }

    @Override
    public String toString() {
        return "\nLivro{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", editora='" + editora + '\'' +
                ", statusAlugado=" + statusAlugado +
                ", nomeLocatario=" + nomeLocatario +
                "}\n";
    }
}
