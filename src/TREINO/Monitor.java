package TREINO;


import java.util.ArrayList;

public class Monitor extends Usuario{
    private int resu = 0;
    private ArrayList<Livro> livrosMonitor = new ArrayList<Livro>();


    public Monitor(String _codigo, String _nome, String _cpf) {
        super(_codigo, _nome, _cpf);
    }

    @Override
    public void alugarLivro(Livro _book) {
       livrosMonitor.add(_book);
    }

    @Override
    public void devolver(Livro _book) {
       valorAluguel();
       livrosMonitor.remove(_book);
    }

    @Override
    public void valorAluguel() {
        int i = 30;

        if(this.getDia() >= i){
            System.out.println("os "+ i + " dias gratuitos acabaram");
            for(int d = 0; d <=this.getDia(); d++){
                this.resu= d - 30;
            }
            System.out.println("total de multa a pagar "+ this.resu + "R$");
        }else{
            this.resu = i - this.getDia();
            System.out.println("tem "+ this.resu + " dias de gratuidade");
            System.out.println("nao precisa pagar multa");
        }
    }
}

