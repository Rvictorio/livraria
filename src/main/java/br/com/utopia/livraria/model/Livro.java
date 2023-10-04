package br.com.utopia.livraria.model;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Livro(){

    }

    @Override
    public String toString(){
        return "Livros[" +
                "Titulo: " + titulo +
                ". Autor: " +autor +
                "]";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
