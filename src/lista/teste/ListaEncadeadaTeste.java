package lista.teste;

import lista.ListaEncadeada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        //adicionaPosicao();
        //removeInicio();
        //removeFinal();
        removePosicao();

    }


    public static void removePosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.remove(2));
        System.out.println("Lista: " + lista);

    }

    public static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        //lista.removeFinal();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);
    }


    public static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

         lista.removeInicio();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);
    }

    public static void adicionaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        // lista.adiciona(-1, 1);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4); // 1, 2, 4

        // lista.adiciona(5, 0);
        //lista.adiciona(0, 1); // 0, 1, 2, 4
        lista.adiciona(3, 5); // 0, 1, 2, 4, 5
        lista.adiciona(1, 3); // 0, 1, 2, 3, 4, 5

        System.out.println(lista);
    }

    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista);

        // busca por elemento
        System.out.println("******* busca por elemento ");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // busca por posição
        System.out.println("******* busca por posição ");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        // System.out.println(lista.buscaPorPosicao(-1));
        // System.out.println(lista.buscaPorPosicao(4));
    }

}
