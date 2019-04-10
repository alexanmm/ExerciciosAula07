package br.com.digitalhouse.Exercicio01;

public class Documento extends Arquivos{

    //Construtor
    public Documento() {
    }

    public Documento(String nome, String tipo) {
        super(nome, tipo);
    }

    //Métodos
    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Sou um documento " + nome + tipo);

    }
}
