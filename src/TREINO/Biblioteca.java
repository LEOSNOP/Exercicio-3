package TREINO;

import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Livro> listaLivros = new ArrayList<Livro>();
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    protected static void emprestimoLivro(Usuario _user , Livro _book){
        _book.setStatus(true);
        _book.setNomeLocatario(_user.getNome());
        _user.alugarLivro(_book);
    }

    protected static void receberLivro(Usuario _user, Livro _book){
        _book.setStatus(false);
        _book.setNomeLocatario(null);
        _user.setDia(40);
        _user.devolver(_book);
    }

    protected static void emprestimoLivroM(Monitor _user, Livro _book){
        _book.setStatus(true);
        _book.setNomeLocatario(_user.getNome());
        _user.alugarLivro(_book);
    }

    protected static void receberLivroM(Monitor _user, Livro _book){
        _book.setStatus(false);
        _book.setNomeLocatario(null);
        _user.setDia(40);
        _user.devolver(_book);
    }

    public static void main(String[] args) {
        //Criando livros
        Livro l1 = new Livro("01", "pequenino", "e nos");
        Livro l2 = new Livro("02","livro de mormom","LDS");
        Livro l3 = new Livro("03","One Punch","ONE");
        Livro l4 = new Livro("04","One Piece","Oda");
        listaLivros.add(l1);
        listaLivros.add(l2);
        listaLivros.add(l3);
        listaLivros.add(l4);

        //Criando usuarios
        Usuario u1= new Usuario("01","Luiz","56012344404");
        Usuario u2= new Usuario("02","Leo","49175918807");
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);

        emprestimoLivro(u1, l2);


//        System.out.println(listaLivros);
//        System.out.println("---------------------------------");
//        System.out.println(listaUsuarios);

        receberLivro(u1, l2);


//        System.out.println(listaLivros);
//        System.out.println("---------------------------------");
//        System.out.println(listaUsuarios);

        //criando Monitores
        Monitor m1 = new Monitor("01","Mike","33377788898");
        Monitor m2 = new Monitor("02","Ronin","55544466676");

        listaUsuarios.add(m1);
        listaUsuarios.add(m2);

        emprestimoLivroM(m1 ,l2);
        emprestimoLivroM(m2,l4);

//        System.out.println(listaLivros);
//        System.out.println("---------------------------------");
//        System.out.println(listaUsuarios);

        receberLivroM(m1, l2);
        receberLivroM(m2,l4);

        System.out.println(listaLivros);
        System.out.println("---------------------------------");
        System.out.println(listaUsuarios);





    }
}















