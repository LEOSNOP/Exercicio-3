package TREINO;


import java.util.ArrayList;

public class Usuario {
    private String codigo;
    private String nome;
    private String cpf;
    private ArrayList<Livro> livrosUsuario = new ArrayList<Livro>();
    private int dia;
    private int resu = 0;

    public Usuario(){}

    public Usuario(String _codigo, String _nome, String _cpf) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.cpf = _cpf;
    }

    public void alugarLivro(Livro _book){
        livrosUsuario.add(_book);
    }

    public void devolver(Livro _book){
        valorAluguel();
        livrosUsuario.remove(_book);

    }

    public void valorAluguel(){
        int i = 15;

        if(this.dia >= i){
            System.out.println("os "+ i + " dias gratuitos acabaram");
            for(int d = 0; d <=this.dia; d++){
                this.resu = d - 15;
            }
            System.out.println("total de multa a pagar "+ this.resu + "R$");
        }else{
            this.resu = i - this.dia;
            System.out.println("tem "+ this.resu + " dias de gratuidade");
            System.out.println("nao precisa pagar multa");
        }

    }

    public void setDia(int d){
        this.dia = d;
    }

    public int getDia() {
        return dia;
    }


    public String getNome() {
        return nome;
    }



    @Override
    public String toString() {
        return "\nUsuario{" +
                "\ncodigo='" + codigo + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \ncpf='" + cpf + '\'' +
                ", \nlivrosUsuario='" + livrosUsuario + '\'' +
                "}\n";
    }
}
