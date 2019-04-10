package br.com.digitalhouse.Exercicio01;

public class Foto extends Arquivos{

    //Construtor
    public Foto() {
    }

    public Foto(String nome, String tipo) {
        super(nome, tipo);
    }

    //Métodos
    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Sou uma selfie " + nome + tipo);
    }
}
