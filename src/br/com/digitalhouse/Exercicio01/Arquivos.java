package br.com.digitalhouse.Exercicio01;

public abstract class Arquivos implements Imprimivel{

    //Atributos
    protected String nome;
    protected String tipo;

    //Construtor
    public Arquivos(){

    }

    public Arquivos(String nome, String tipo){

        this.nome = nome;
        this.tipo = tipo;

    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Métodos
    public abstract void imprimir();

}
