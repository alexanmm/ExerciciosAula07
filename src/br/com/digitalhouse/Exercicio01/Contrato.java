package br.com.digitalhouse.Exercicio01;

public class Contrato extends Arquivos{

    //Construtor
    public Contrato() {
    }

    public Contrato(String nome, String tipo) {
        super(nome, tipo);
    }

    //Métodos
    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Sou um contrato muito legal " + nome + tipo);

    }
}
