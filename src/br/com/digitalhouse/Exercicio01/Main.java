package br.com.digitalhouse.Exercicio01;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {

        Contrato contrato = new Contrato("Arquivo de Contrato", "DOC");
        Foto foto = new Foto("Foto001", "JPG");
        Documento documento = new Documento("Arquivo Word", "DOC");
        Impressora impressora = new Impressora();

        //Adicionar Contrato a fila da impressora
        impressora.adicionarImprimivel(contrato);

        //Adicionar Foto a fila da impressora
        impressora.adicionarImprimivel(foto);

        //Adicionar Documento a fila da impressora
        impressora.adicionarImprimivel(documento);

        //Imprimir tudo
        impressora.imprimirTudo();

    }


}
