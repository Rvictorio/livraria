package br.com.utopia.livraria.model;

public class Livro {
    private String titulo;
    private String autor;
    private Double valor;

    public Livro(String titulo, String autor, Double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.valor = this.valor;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
