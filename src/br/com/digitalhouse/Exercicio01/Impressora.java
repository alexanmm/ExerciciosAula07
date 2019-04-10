package br.com.digitalhouse.Exercicio01;

import java.util.ArrayList;

public class Impressora {

    private ArrayList<Imprimivel> imprimiveis = new ArrayList<>();

    //Construtor
    public Impressora(){

    }

    //Getter and Setter
    public ArrayList<Imprimivel> getImprimiveis() {
        return imprimiveis;
    }

    public void setImprimiveis(ArrayList<Imprimivel> imprimiveis) {
        this.imprimiveis = imprimiveis;
    }

    //Métodos
    public void imprimirTudo(){
        //Esse método será encarregado de percorrer a
        //lista de imprimíveis e fazer a impressão..

        System.out.println("Imprimir Tudo:");

        for(int posicao = 0; posicao < imprimiveis.size(); posicao++){
            imprimiveis.get(posicao).imprimir();
        }

    }

    public void adicionarImprimivel(Imprimivel umImprimivel){

        imprimiveis.add(umImprimivel);

    }

}
